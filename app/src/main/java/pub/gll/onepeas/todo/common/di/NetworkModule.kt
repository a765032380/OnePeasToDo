package pub.gll.onepeas.todo.common.di

import pub.gll.onepeas.todo.data.http.HttpService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import pub.gll.onepeas.todo.car.remote.CarBrandService
import pub.gll.onepeas.todo.comic.home.remote.ComicHomeService
import pub.gll.onepeas.todo.data.http.OkHttpBuild
import pub.gll.onepeas.todo.net.ApexCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//这里使用了SingletonComponent，因此 NetworkModule 绑定到 Application 的生命周期
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpBuild.okHttpClient

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(ApexCallAdapterFactory())
            .baseUrl(if (HttpService.isDebug) HttpService.url else HttpService.debugUrl)
            .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): HttpService {
        return retrofit.create(HttpService::class.java)
    }

    @Singleton
    @Provides
    fun provideCarBrandService(retrofit: Retrofit): CarBrandService {
        return retrofit.create(CarBrandService::class.java)
    }
    @Singleton
    @Provides
    fun provideComicHomeService(retrofit: Retrofit): ComicHomeService {
        return retrofit.create(ComicHomeService::class.java)
    }


}