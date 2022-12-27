package pub.gll.onepeas.module.cookbook.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase
import pub.gll.onepeas.module.cookbook.mapper.CookbookEntity2ModelMapper
import pub.gll.onepeas.module.cookbook.remote.CookbookService
import pub.gll.onepeas.module.cookbook.repository.CookbookRepository
import pub.gll.onepeas.module.cookbook.repository.CookbookRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CookbookRepositoryModule {


    @Singleton
    @Provides
    fun provideCookbookRepository(api: CookbookService, appDatabase: CookbookAppDatabase): CookbookRepository {
        return CookbookRepositoryImpl(api,appDatabase, CookbookEntity2ModelMapper())
    }

}