package pub.gll.onepeas.module.comic.comic.home.remote

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import kotlinx.coroutines.delay
import pub.gll.onepeas.libbase.BaseApp
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeAppDatabase
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeEntity
import pub.gll.onepeas.libbase.util.showToast
import pub.gll.onepeas.libbase.util.NetCheckUtil

@OptIn(ExperimentalPagingApi::class)
class ComicHomeRemoteMediator(
    val api: ComicHomeService,
    val db: ComicHomeAppDatabase
) :RemoteMediator<Int, ComicHomeEntity>(){

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, ComicHomeEntity>
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
            if (!NetCheckUtil.checkNet(BaseApp.instance)){
                showToast("无网络")
                return MediatorResult.Success(true)
            }


            val page = pageKey?:1
            //第二步：请求分页数据
            val result = api.fetchComicHome(page,state.config.pageSize,"4c753f2f20288772bf555d0be98eede0","2015-07-10")
            delay(3*1000)
            val comicHomeDao = db.getComicHomeDao()


            //第三步：插入数据库
            val item = result.map {
                ComicHomeEntity(
                    id = it.id,
                    page = page
                )
            }

            db.withTransaction {
                if(loadType == LoadType.REFRESH){
                    comicHomeDao.clearComicHome()
                }
                comicHomeDao.insertComicHome(item)
            }

            val endOfPaginationReached = item.isEmpty()

            return MediatorResult.Success(endOfPaginationReached=endOfPaginationReached)
        }catch(e:Exception){
            e.printStackTrace()
            return MediatorResult.Error(e)
        }

    }
}