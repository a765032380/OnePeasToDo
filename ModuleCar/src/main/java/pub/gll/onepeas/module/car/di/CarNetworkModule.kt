package pub.gll.onepeas.module.car.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.module.car.remote.CarBrandService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CarNetworkModule {


    @Singleton
    @Provides
    fun provideCarBrandService(retrofit: Retrofit): CarBrandService {
        return retrofit.create(CarBrandService::class.java)
    }
}