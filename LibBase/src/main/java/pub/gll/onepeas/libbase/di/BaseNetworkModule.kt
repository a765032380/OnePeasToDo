package pub.gll.onepeas.libbase.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import pub.gll.onepeas.libbase.di.http.OkHttpBuild
import pub.gll.onepeas.libbase.di.http.interceptor.ToDoGlobalNetworkResultInterceptor
import pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor
import pub.gll.onepeas.libbase.net.adapter.ApexCallAdapterFactory
import retrofit2.CallAdapter
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class BaseNetworkModule {


    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpBuild.okHttpClient


    @Singleton
    @Provides
    fun provideGlobalNetworkResultInterceptor(
        wanGlobalNetworkResultInterceptor: ToDoGlobalNetworkResultInterceptor
    ): GlobalNetworkResultInterceptor {
        return wanGlobalNetworkResultInterceptor
    }

    @Singleton
    @Provides
    fun provideCallAdapterFactory(
        apexCallAdapterFactory: ApexCallAdapterFactory
    ): CallAdapter.Factory {
        return apexCallAdapterFactory
    }

    @Named("baseUrl")
    @Provides
    fun provideBaseUrl(): String {
//        return "http://49.232.198.163:8082/"
        return "http://192.168.199.214:8082/api/"

    }
    @Named("videoUrl")
    @Provides
    fun provideVideoUrl(): String {
        return "http://49.232.198.163:8082/api/"
    }

    @Provides
    fun provideConverterFactory(): Converter.Factory {
        return GsonConverterFactory.create()
    }


    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient,
                        converterFactory: Converter.Factory,
                        callAdapterFactory: CallAdapter.Factory,
                        @Named("baseUrl") baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(converterFactory)
            .addCallAdapterFactory(callAdapterFactory)
            .baseUrl(baseUrl)
            .build()
    }
    @Named("videoUrl")
    @Singleton
    @Provides
    fun provideVideoRetrofit(okHttpClient: OkHttpClient,
                        converterFactory: Converter.Factory,
                        callAdapterFactory: CallAdapter.Factory,
                        @Named("videoUrl") baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(converterFactory)
            .addCallAdapterFactory(callAdapterFactory)
            .baseUrl(baseUrl)
            .build()
    }

}