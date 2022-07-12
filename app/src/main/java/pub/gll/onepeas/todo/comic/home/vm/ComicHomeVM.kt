package pub.gll.onepeas.todo.comic.home.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import pub.gll.onepeas.todo.comic.home.repository.ComicRepository
import javax.inject.Inject

@HiltViewModel
class ComicHomeVM @Inject constructor(
    comicHomeRepository: ComicRepository
): ViewModel() {

    var data = comicHomeRepository.fetchComicHomeList()
        .cachedIn(viewModelScope)
        .asLiveData()
        .asFlow()

}