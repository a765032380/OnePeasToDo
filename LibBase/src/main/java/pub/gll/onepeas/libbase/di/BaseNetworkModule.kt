package pub.gll.onepeas.libbase.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import pub.gll.onepeas.libbase.di.http.ApexCallAdapterFactory
import pub.gll.onepeas.libbase.di.http.OkHttpBuild
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class BaseNetworkModule {


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
            .baseUrl("https://way.jd.com/showapi/")
            .build()
    }

}