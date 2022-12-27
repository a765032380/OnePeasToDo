package pub.gll.onepeas.module.cookbook.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase
import pub.gll.onepeas.module.cookbook.db.CookbookDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CookbookRoomModule {

    @Singleton
    @Provides
    fun provideComicHomeAppDatabase(application: Application): CookbookAppDatabase {
        return Room.databaseBuilder(
            application,
            CookbookAppDatabase::class.java,
            "comic_home.db"
        ).build()
    }
    @Singleton
    @Provides
    fun provideComicHomeDao(appDatabase: CookbookAppDatabase): CookbookDao {
        return appDatabase.getCookbookDao()
    }

}