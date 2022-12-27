package pub.gll.onepeas.module.account.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AccountNetworkModule {

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): pub.gll.onepeas.module.account.HttpService {
        return retrofit.create(pub.gll.onepeas.module.account.HttpService::class.java)
    }
    @Singleton
    @Provides
    fun provideVideoService(@Named("videoUrl")
                            retrofit: Retrofit): pub.gll.onepeas.module.account.VideoService {
        return retrofit.create(pub.gll.onepeas.module.account.VideoService::class.java)
    }

}