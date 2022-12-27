package pub.gll.onepeas.module.car.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.module.car.db.AppDatabase
import pub.gll.onepeas.module.car.mapper.CarBrandEntity2ModelMapper
import pub.gll.onepeas.module.car.remote.CarBrandService
import pub.gll.onepeas.module.car.repository.CarBrandRepositoryImpl
import pub.gll.onepeas.module.car.repository.Repository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CarRepositoryModule {

    @Singleton
    @Provides
    fun provideCarBrandRepository(api: CarBrandService, appDatabase: AppDatabase): Repository {
        return CarBrandRepositoryImpl(api,appDatabase, CarBrandEntity2ModelMapper())
    }

}