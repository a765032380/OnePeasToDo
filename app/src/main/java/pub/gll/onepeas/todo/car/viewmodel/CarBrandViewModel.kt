package pub.gll.onepeas.todo.car.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import pub.gll.onepeas.todo.car.model.CarBrandItemModel
import pub.gll.onepeas.todo.car.repository.Repository
import javax.inject.Inject

class CarBrandViewModel @Inject constructor(
    carBrandRepository: Repository
): ViewModel() {


    val data :LiveData<PagingData<CarBrandItemModel>> =
        carBrandRepository.fetchCarBrandList()
            .cachedIn(viewModelScope)
            .asLiveData()
}