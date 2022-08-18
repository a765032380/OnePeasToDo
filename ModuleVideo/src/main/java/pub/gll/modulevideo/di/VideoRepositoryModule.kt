package pub.gll.modulevideo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.modulevideo.db.VideoAppDatabase
import pub.gll.modulevideo.mapper.VideoEntity2ModelMapper
import pub.gll.modulevideo.remote.VideoService
import pub.gll.modulevideo.repository.VideoRepository
import pub.gll.modulevideo.repository.VideoRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class VideoRepositoryModule {


    @Singleton
    @Provides
    fun provideCookbookRepository(api: VideoService, appDatabase: VideoAppDatabase): VideoRepository {
        return VideoRepositoryImpl(api,appDatabase, VideoEntity2ModelMapper())
    }

}