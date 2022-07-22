package pub.gll.onepeas.libbase.ext

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import pub.gll.onepeas.libbase.BaseApp
import pub.gll.onepeas.libbase.util.showToast
import pub.gll.onepeas.libcore.util.NetCheckUtil

interface PagerEntity{
    var page:Int
}

@OptIn(ExperimentalPagingApi::class)
suspend fun <T:List<Any>,E : PagerEntity> simplePager(
    loadType: LoadType,
    state: PagingState<Int, E>,
    loadNet: suspend (page: Int, pageSize: Int) -> T,
    insertDbData: suspend (loadType: LoadType, page: Int, data: T) -> Unit,
): RemoteMediator.MediatorResult {
    try{
        //第一步：判断loadType
        val pageKey = when(loadType){
            LoadType.REFRESH->{//首次刷新的时候使用，或者调用Adapter.refresh()触发
                null
            }
            LoadType.APPEND->{//在加载更多的时候触发，当LoadType.REFRESH触发当时候LoadType.PREPEND也会触发
                val lastItem = state.lastItemOrNull()?:return RemoteMediator.MediatorResult.Success(true)
                lastItem.page
            }
            LoadType.PREPEND->{//在当前列表的头部添加数据的时候触发
                return RemoteMediator.MediatorResult.Success(true)
            }
        }
        //无网络加载本地数据
        if (!NetCheckUtil.checkNet(BaseApp.instance)){
            showToast("无网络")
            return RemoteMediator.MediatorResult.Success(true)
        }
        val page = pageKey?:1
        //第二步：请求分页数据
//        val time = System.currentTimeMillis().toDateFormat("yyyy-MM-dd")
        val result = loadNet.invoke(page,state.config.pageSize)
        //第三步：插入数据到数据库
        insertDbData(loadType,page,result)
        val endOfPaginationReached = result.isEmpty()

        return RemoteMediator.MediatorResult.Success(endOfPaginationReached=endOfPaginationReached)
    }catch(e:Exception){
        e.printStackTrace()
        return RemoteMediator.MediatorResult.Error(e)
    }

}