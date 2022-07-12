package pub.gll.onepeas.todo.comic.home.db

import androidx.room.Database
import androidx.room.RoomDatabase
import pub.gll.onepeas.todo.car.db.CarBrandEntity

@Database(
    entities = [ComicHomeEntity::class],
    version = 1,
    exportSchema = false
)
abstract class ComicHomeAppDatabase : RoomDatabase(){
    abstract fun getComicHomeDao(): ComicHomeDao
}