package pub.gll.modulevideo.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.modulevideo.db.VideoAppDatabase
import pub.gll.modulevideo.db.VideoDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class VideoRoomModule {

    @Singleton
    @Provides
    fun provideComicHomeAppDatabase(application: Application): VideoAppDatabase {
        return Room.databaseBuilder(
            application,
            VideoAppDatabase::class.java,
            "comic_home.db"
        ).build()
    }
    @Singleton
    @Provides
    fun provideComicHomeDao(appDatabase: VideoAppDatabase): VideoDao {
        return appDatabase.getVideoDao()
    }

}