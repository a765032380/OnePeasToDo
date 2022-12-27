package pub.gll.onepeas.module.comic.comic.home.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import pub.gll.onepeas.module.comic.comic.home.model.ComicHomeItemModel

interface ComicRepository {
    fun fetchComicHomeList(): Flow<PagingData<ComicHomeItemModel>>
}