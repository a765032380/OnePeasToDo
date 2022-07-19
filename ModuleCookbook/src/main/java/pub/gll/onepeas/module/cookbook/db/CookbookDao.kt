package pub.gll.onepeas.module.cookbook.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CookbookDao {
    @Query("DELETE FROM CookbookEntity")
    suspend fun clearCookbook()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCookbook(cookbookList: List<CookbookEntity>)

    @Query("SELECT * FROM CookbookEntity")
    fun getCookbookList(): PagingSource<Int, CookbookEntity>
}