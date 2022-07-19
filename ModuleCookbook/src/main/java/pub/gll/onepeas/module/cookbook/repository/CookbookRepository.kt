package pub.gll.onepeas.module.cookbook.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import pub.gll.onepeas.module.cookbook.model.CookbookItemModel

interface CookbookRepository {
    fun fetchCookbookList(): Flow<PagingData<CookbookItemModel>>
}