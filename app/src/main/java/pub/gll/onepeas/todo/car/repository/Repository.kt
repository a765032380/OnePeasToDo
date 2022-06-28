package pub.gll.onepeas.todo.car.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import pub.gll.onepeas.todo.car.model.CarBrandItemModel

interface Repository {

    fun fetchCarBrandList():Flow<PagingData<CarBrandItemModel>>
}