package pub.gll.onepeas.module.comic.comic.home.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [ComicHomeEntity::class],
    version = 1,
    exportSchema = false
)
abstract class ComicHomeAppDatabase : RoomDatabase(){
    abstract fun getComicHomeDao(): ComicHomeDao
}