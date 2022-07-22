package pub.gll.onepeas.module.car.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import pub.gll.onepeas.module.car.model.CarBrandItemModel

interface Repository {

    fun fetchCarBrandList():Flow<PagingData<CarBrandItemModel>>
}