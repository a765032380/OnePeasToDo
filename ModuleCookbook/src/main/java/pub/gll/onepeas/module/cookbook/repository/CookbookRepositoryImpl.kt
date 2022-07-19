package pub.gll.onepeas.module.cookbook.repository

import androidx.paging.*
import coil.map.Mapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase
import pub.gll.onepeas.module.cookbook.db.CookbookEntity
import pub.gll.onepeas.module.cookbook.model.CookbookItemModel
import pub.gll.onepeas.module.cookbook.remote.CookbookRemoteMediator
import pub.gll.onepeas.module.cookbook.remote.CookbookService

class CookbookRepositoryImpl(
    private val api: CookbookService,
    private val database: CookbookAppDatabase,
    private val carBrandEntity2ModelMapper: Mapper<CookbookEntity, CookbookItemModel>
):CookbookRepository {
    @OptIn(ExperimentalPagingApi::class)
    override fun fetchCookbookList(): Flow<PagingData<CookbookItemModel>> {
        return Pager(
            config = PagingConfig(
                pageSize = 8,//每页的条数
                prefetchDistance = 3,//距离底部还有多少条的时候去加载
                initialLoadSize = 8//第一次加载的条数
            ),
            remoteMediator = CookbookRemoteMediator(api,database)//请求网络数据，把网络数据放到数据库里面
        ) {
            database.getCookbookDao().getCookbookList()//从数据库里面拿数据
        }.flow
            .flowOn(Dispatchers.IO )
            .map {
                it.map {comicHomeEntity->
                    carBrandEntity2ModelMapper.map(comicHomeEntity)//把数据进行转换，给UI进行显示
                }
            }
    }
}