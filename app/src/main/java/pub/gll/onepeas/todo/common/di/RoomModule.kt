package pub.gll.onepeas.todo.common.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.todo.car.db.AppDatabase
import pub.gll.onepeas.todo.car.db.CarBrandDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Singleton
    @Provides
    fun provideAppDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(
            application,
            AppDatabase::class.java,
            "car_brand.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideCarBrandDao(appDatabase: AppDatabase):CarBrandDao{
        return appDatabase.getCarBrandDao()
    }

}