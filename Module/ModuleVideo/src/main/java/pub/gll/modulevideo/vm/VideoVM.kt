package pub.gll.modulevideo.vm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asFlow
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import pub.gll.modulevideo.repository.VideoRepository
import javax.inject.Inject

@HiltViewModel
class VideoVM @Inject constructor(
   val comicHomeRepository: VideoRepository
): ViewModel() {

    val key = mutableStateOf("")

    var data = comicHomeRepository.fetchVideoList(key.value)
        .cachedIn(viewModelScope)
        .asLiveData()
        .asFlow()
    fun refresh(){
        data = comicHomeRepository.fetchVideoList(key.value)
            .cachedIn(viewModelScope)
            .asLiveData()
            .asFlow()
    }

}