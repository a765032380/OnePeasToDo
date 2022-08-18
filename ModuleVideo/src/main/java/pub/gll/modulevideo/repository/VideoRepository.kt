package pub.gll.modulevideo.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import pub.gll.modulevideo.model.VideoItemModel

interface VideoRepository {
    fun fetchVideoList(): Flow<PagingData<VideoItemModel>>
}