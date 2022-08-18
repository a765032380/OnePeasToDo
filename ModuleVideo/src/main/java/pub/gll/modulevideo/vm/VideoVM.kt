package pub.gll.modulevideo.vm

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
    comicHomeRepository: VideoRepository
): ViewModel() {

    var data = comicHomeRepository.fetchVideoList()
        .cachedIn(viewModelScope)
        .asLiveData()
        .asFlow()

}