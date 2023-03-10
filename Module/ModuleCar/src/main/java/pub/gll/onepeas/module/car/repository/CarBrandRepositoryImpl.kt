package pub.gll.onepeas.module.car.repository

import androidx.paging.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import pub.gll.onepeas.module.car.db.AppDatabase
import pub.gll.onepeas.module.car.db.CarBrandEntity
import pub.gll.onepeas.libbase.mapper.Mapper
import pub.gll.onepeas.module.car.model.CarBrandItemModel
import pub.gll.onepeas.module.car.remote.CarBrandRemoteMediator
import pub.gll.onepeas.module.car.remote.CarBrandService

class CarBrandRepositoryImpl(
    private val api: CarBrandService,
    private val database: AppDatabase,
    private val carBrandEntity2ModelMapper: Mapper<CarBrandEntity, CarBrandItemModel>
): Repository {
    @OptIn(ExperimentalPagingApi::class)
    override fun fetchCarBrandList(): Flow<PagingData<CarBrandItemModel>> {
        return Pager(
            config = PagingConfig(
                pageSize = 8,//每页的条数
                prefetchDistance = 3,//距离底部还有多少条的时候去加载
                initialLoadSize = 8//第一次加载的条数
            ),
            remoteMediator = CarBrandRemoteMediator(api,database)//请求网络数据，把网络数据放到数据库里面
        ) {
            database.getCarBrandDao().getCarBrand()//从数据库里面拿数据
        }.flow
            .flowOn(Dispatchers.IO )
            .map {
            it.map {carBrandEntity->
                carBrandEntity2ModelMapper.map(carBrandEntity)//把数据进行转换，给UI进行显示
            }
        }
    }
}