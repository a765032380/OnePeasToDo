package pub.gll.onepeas.module.comic.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ComicNetworkModule {

    @Singleton
    @Provides
    fun provideComicHomeService(retrofit: Retrofit): pub.gll.onepeas.module.comic.comic.home.remote.ComicHomeService {
        return retrofit.create(pub.gll.onepeas.module.comic.comic.home.remote.ComicHomeService::class.java)
    }

}