package pub.gll.onepeas.todo.car.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CarBrandEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase :RoomDatabase(){
    abstract fun getCarBrandDao():CarBrandDao
}