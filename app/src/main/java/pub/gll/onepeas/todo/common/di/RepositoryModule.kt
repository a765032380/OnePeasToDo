package pub.gll.onepeas.todo.common.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import pub.gll.onepeas.todo.car.db.AppDatabase
import pub.gll.onepeas.todo.car.mapper.CarBrandEntity2ModelMapper
import pub.gll.onepeas.todo.car.remote.CarBrandService
import pub.gll.onepeas.todo.car.repository.CarBrandRepositoryImpl
import pub.gll.onepeas.todo.car.repository.Repository
import pub.gll.onepeas.todo.comic.home.db.ComicHomeAppDatabase
import pub.gll.onepeas.todo.comic.home.mapper.ComicHomeEntity2ModelMapper
import pub.gll.onepeas.todo.comic.home.remote.ComicHomeService
import pub.gll.onepeas.todo.comic.home.repository.ComicRepository
import pub.gll.onepeas.todo.comic.home.repository.ComicRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideCarBrandRepository(api:CarBrandService, appDatabase: AppDatabase): Repository {
        return CarBrandRepositoryImpl(api,appDatabase, CarBrandEntity2ModelMapper())
    }

    @Singleton
    @Provides
    fun provideComicHomeRepository(api:ComicHomeService, appDatabase: ComicHomeAppDatabase): ComicRepository {
        return ComicRepositoryImpl(api,appDatabase, ComicHomeEntity2ModelMapper())
    }

}