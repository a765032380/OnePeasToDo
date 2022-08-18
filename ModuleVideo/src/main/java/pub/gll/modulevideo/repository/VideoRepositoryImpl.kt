package pub.gll.modulevideo.repository

import androidx.paging.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import pub.gll.modulevideo.db.VideoAppDatabase
import pub.gll.modulevideo.db.VideoEntity
import pub.gll.modulevideo.model.VideoItemModel
import pub.gll.modulevideo.remote.VideoRemoteMediator
import pub.gll.modulevideo.remote.VideoService
import pub.gll.onepeas.libbase.mapper.Mapper

class VideoRepositoryImpl(
    private val api: VideoService,
    private val database: VideoAppDatabase,
    private val carBrandEntity2ModelMapper: Mapper<VideoEntity, VideoItemModel>
):VideoRepository {
    @OptIn(ExperimentalPagingApi::class)
    override fun fetchVideoList(): Flow<PagingData<VideoItemModel>> {
        return Pager(
            config = PagingConfig(
                pageSize = 8,//每页的条数
                prefetchDistance = 3,//距离底部还有多少条的时候去加载
                initialLoadSize = 8//第一次加载的条数
            ),
            remoteMediator = VideoRemoteMediator(api,database)//请求网络数据，把网络数据放到数据库里面
        ) {
            database.getVideoDao().getVideoList()//从数据库里面拿数据
        }.flow
            .flowOn(Dispatchers.IO)
            .map {
                it.map {comicHomeEntity->
                    carBrandEntity2ModelMapper.map(comicHomeEntity)//把数据进行转换，给UI进行显示
                }
            }
    }
}