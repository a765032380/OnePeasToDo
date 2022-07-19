package pub.gll.onepeas.module.cookbook.remote

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import kotlinx.coroutines.delay
import pub.gll.onepeas.libcore.ext.toDateFormat
import pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase
import pub.gll.onepeas.module.cookbook.db.CookbookEntity

@OptIn(ExperimentalPagingApi::class)
class CookbookRemoteMediator(
    val api: CookbookService,
    val db: CookbookAppDatabase
) :RemoteMediator<Int, CookbookEntity>(){

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, CookbookEntity>
    ): MediatorResult {
        try{
            //第一步：判断loadType
            val pageKey = when(loadType){
                LoadType.REFRESH->{//首次刷新的时候使用，或者调用Adapter.refresh()触发
                    null
                }
                LoadType.APPEND->{//在加载更多的时候触发，当LoadType.REFRESH触发当时候LoadType.PREPEND也会触发
                    val lastItem = state.lastItemOrNull()?:return MediatorResult.Success(true)
                    lastItem.page
                }
                LoadType.PREPEND->{//在当前列表的头部添加数据的时候触发
                    return MediatorResult.Success(true)
                }
            }
            //无网络加载本地数据
//            if (!AppHelper.mContext.isConnectedNetwork()){
//                showToast("无网络")
//                return MediatorResult.Success(true)
//            }


            val page = pageKey?:1
            //第二步：请求分页数据
            val time = System.currentTimeMillis().toDateFormat("yyyy-MM-dd")
            val result = api.fetchCookbook(page,state.config.pageSize,"4c753f2f20288772bf555d0be98eede0",time)
            val comicHomeDao = db.getCookbookDao()


            //第三步：插入数据库
            val item = result.result.showapi_res_body.contentlist.map {
                CookbookEntity(
                    id = it.id,
                    page = page+ 1,
                    name = it.name,
                    icon = it.icon
                )
            }

            db.withTransaction {
                if(loadType == LoadType.REFRESH){
                    comicHomeDao.clearCookbook()
                }
                comicHomeDao.insertCookbook(item)
            }

            val endOfPaginationReached = item.isEmpty()

            return MediatorResult.Success(endOfPaginationReached=endOfPaginationReached)
        }catch(e:Exception){
            e.printStackTrace()
            return MediatorResult.Error(e)
        }

    }
}