package pub.gll.onepeas.module.comic.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeAppDatabase
import pub.gll.onepeas.module.comic.comic.home.mapper.ComicHomeEntity2ModelMapper
import pub.gll.onepeas.module.comic.comic.home.remote.ComicHomeService
import pub.gll.onepeas.module.comic.comic.home.repository.ComicRepository
import pub.gll.onepeas.module.comic.comic.home.repository.ComicRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ComicRepositoryModule {

    @Singleton
    @Provides
    fun provideComicHomeRepository(api: ComicHomeService, appDatabase: ComicHomeAppDatabase): ComicRepository {
        return ComicRepositoryImpl(
            api,
            appDatabase,
            ComicHomeEntity2ModelMapper()
        )
    }
}