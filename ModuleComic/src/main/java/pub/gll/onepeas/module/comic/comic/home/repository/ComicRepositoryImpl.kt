package pub.gll.onepeas.module.comic.comic.home.repository

import androidx.paging.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeAppDatabase
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeEntity
import pub.gll.onepeas.module.comic.comic.home.mapper.Mapper
import pub.gll.onepeas.module.comic.comic.home.model.ComicHomeItemModel
import pub.gll.onepeas.module.comic.comic.home.remote.ComicHomeRemoteMediator
import pub.gll.onepeas.module.comic.comic.home.remote.ComicHomeService

class ComicRepositoryImpl(
    private val api: ComicHomeService,
    private val database: ComicHomeAppDatabase,
    private val carBrandEntity2ModelMapper: Mapper<ComicHomeEntity, ComicHomeItemModel>
): ComicRepository {
    @OptIn(ExperimentalPagingApi::class)
    override fun fetchComicHomeList(): Flow<PagingData<ComicHomeItemModel>> {
        return Pager(
            config = PagingConfig(
                pageSize = 8,//每页的条数
                prefetchDistance = 3,//距离底部还有多少条的时候去加载
                initialLoadSize = 8//第一次加载的条数
            ),
            remoteMediator = ComicHomeRemoteMediator(api,database)//请求网络数据，把网络数据放到数据库里面
        ) {
            database.getComicHomeDao().getComicHomeList()//从数据库里面拿数据
        }.flow
            .flowOn(Dispatchers.IO )
            .map {
                it.map {comicHomeEntity->
                    carBrandEntity2ModelMapper.map(comicHomeEntity)//把数据进行转换，给UI进行显示
                }
            }
    }
}