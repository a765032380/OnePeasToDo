package pub.gll.onepeas.todo.comic.home.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ComicHomeDao {
    @Query("DELETE FROM ComicHomeEntity")
    suspend fun clearComicHome()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertComicHome(carBrandList: List<ComicHomeEntity>)

    @Query("SELECT * FROM ComicHomeEntity")
    fun getComicHomeList(): PagingSource<Int, ComicHomeEntity>
}