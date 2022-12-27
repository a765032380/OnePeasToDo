package pub.gll.onepeas.module.comic.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeAppDatabase
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ComicRoomModule {

    @Singleton
    @Provides
    fun provideComicHomeAppDatabase(application: Application): ComicHomeAppDatabase {
        return Room.databaseBuilder(
            application,
            ComicHomeAppDatabase::class.java,
            "comic_home.db"
        ).build()
    }
    @Singleton
    @Provides
    fun provideComicHomeDao(appDatabase: ComicHomeAppDatabase): ComicHomeDao {
        return appDatabase.getComicHomeDao()
    }
}