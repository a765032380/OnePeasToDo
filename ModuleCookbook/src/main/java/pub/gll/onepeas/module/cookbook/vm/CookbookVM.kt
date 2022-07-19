package pub.gll.onepeas.module.cookbook.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import pub.gll.onepeas.module.cookbook.repository.CookbookRepository
import javax.inject.Inject

@HiltViewModel
class CookbookVM @Inject constructor(
    comicHomeRepository: CookbookRepository
): ViewModel() {

    var data = comicHomeRepository.fetchCookbookList()
        .cachedIn(viewModelScope)
        .asLiveData()
        .asFlow()

}