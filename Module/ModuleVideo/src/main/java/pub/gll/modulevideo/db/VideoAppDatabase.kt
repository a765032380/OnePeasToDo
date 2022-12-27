package pub.gll.modulevideo.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [VideoEntity::class],
    version = 1,
    exportSchema = false
)
abstract class VideoAppDatabase : RoomDatabase(){
    abstract fun getVideoDao(): VideoDao
}