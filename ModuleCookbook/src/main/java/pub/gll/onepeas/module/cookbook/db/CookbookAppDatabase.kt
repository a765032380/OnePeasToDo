package pub.gll.onepeas.module.cookbook.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CookbookEntity::class],
    version = 1,
    exportSchema = false
)
abstract class CookbookAppDatabase : RoomDatabase(){
    abstract fun getCookbookDao(): CookbookDao
}