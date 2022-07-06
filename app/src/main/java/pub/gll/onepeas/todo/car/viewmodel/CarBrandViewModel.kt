package pub.gll.onepeas.todo.car.viewmodel

import androidx.lifecycle.*
import androidx.paging.PagingData
import androidx.paging.cachedIn
import pub.gll.onepeas.todo.car.model.CarBrandItemModel
import pub.gll.onepeas.todo.car.repository.Repository
import javax.inject.Inject

class CarBrandViewModel @Inject constructor(
    carBrandRepository: Repository
): ViewModel() {

    var dataCompose  = carBrandRepository.fetchCarBrandList()
        .cachedIn(viewModelScope)
        .asLiveData()
        .asFlow()

    var data  = carBrandRepository.fetchCarBrandList()
        .cachedIn(viewModelScope)
        .asLiveData()

}