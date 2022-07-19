package pub.gll.onepeas.module.cookbook.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.module.cookbook.remote.CookbookService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CookbookNetworkModule {

    @Singleton
    @Provides
    fun provideCookbookService(retrofit: Retrofit): CookbookService {
        return retrofit.create(CookbookService::class.java)
    }

}