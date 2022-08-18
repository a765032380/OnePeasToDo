package pub.gll.modulevideo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.modulevideo.remote.VideoService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class VideoNetworkModule {

    @Singleton
    @Provides
    fun provideCookbookService(retrofit: Retrofit): VideoService {
        return retrofit.create(VideoService::class.java)
    }

}