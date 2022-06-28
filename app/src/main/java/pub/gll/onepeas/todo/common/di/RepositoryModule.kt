package pub.gll.onepeas.todo.common.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.todo.car.db.AppDatabase
import pub.gll.onepeas.todo.car.db.CarBrandDao
import pub.gll.onepeas.todo.car.mapper.CarBrandEntity2ModelMapper
import pub.gll.onepeas.todo.car.remote.CarBrandService
import pub.gll.onepeas.todo.car.repository.CarBrandRepositoryImpl
import pub.gll.onepeas.todo.car.repository.Repository
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
class RepositoryModule {

    @ActivityScoped
    @Provides
    fun provideCarBrandRepository(api:CarBrandService, appDatabase: AppDatabase): Repository {
        return CarBrandRepositoryImpl(api,appDatabase, CarBrandEntity2ModelMapper())
    }

}