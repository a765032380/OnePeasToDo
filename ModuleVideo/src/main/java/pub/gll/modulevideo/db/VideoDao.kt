package pub.gll.modulevideo.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface VideoDao {
    @Query("DELETE FROM VideoEntity")
    suspend fun clearVideo()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertVideo(cookbookList: List<VideoEntity>)

    @Query("SELECT * FROM VideoEntity")
    fun getVideoList(): PagingSource<Int, VideoEntity>
}