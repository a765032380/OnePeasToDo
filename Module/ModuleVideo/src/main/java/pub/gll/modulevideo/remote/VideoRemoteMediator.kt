package pub.gll.modulevideo.remote

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import pub.gll.modulevideo.db.VideoAppDatabase
import pub.gll.modulevideo.db.VideoEntity
import pub.gll.modulevideo.model.VideoItemModel
import pub.gll.onepeas.libbase.ext.simplePager

@OptIn(ExperimentalPagingApi::class)
class VideoRemoteMediator(
    val api: VideoService,
    val db: VideoAppDatabase,
    val key: String
) :RemoteMediator<Int, VideoEntity>(){
    /**
     * 从网络加载数据
     */
    private suspend fun loadNet(page:Int, pageSize:Int):List<VideoItemModel>{
        val result = api.fetchVideo(page,key)
        return result.content
    }

    /**
     * 将数据插入数据库
     */
    private suspend fun insertDB(loadType: LoadType, page:Int, data:List<VideoItemModel>){
        val comicHomeDao = db.getVideoDao()
        //第三步：插入数据库
        val item = data.map {
            VideoEntity(
                id = it.url,
                page = page+ 1,
                name = it.name,
                icon = it.icon,
                url = it.url
            )
        }
        db.withTransaction {
            if(loadType == LoadType.REFRESH){
                comicHomeDao.clearVideo()
            }
            comicHomeDao.insertVideo(item)
        }
    }

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, VideoEntity>
    ): MediatorResult {
        return simplePager(loadType, state, { page, pageSize->
            loadNet(page, pageSize)
        }) { loadT, page, data ->
            insertDB(loadT, page, data)
        }

    }
}