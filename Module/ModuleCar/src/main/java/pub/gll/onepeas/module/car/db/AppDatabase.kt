package pub.gll.onepeas.module.car.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [CarBrandEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase :RoomDatabase(){
    abstract fun getCarBrandDao(): CarBrandDao
}