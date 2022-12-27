package pub.gll.onepeas.libbase.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0004H\u0007J*\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0004H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0007\u00a8\u0006\u0019"}, d2 = {"Lpub/gll/onepeas/libbase/di/BaseNetworkModule;", "", "()V", "provideBaseUrl", "", "provideCallAdapterFactory", "Lretrofit2/CallAdapter$Factory;", "apexCallAdapterFactory", "Lpub/gll/onepeas/libbase/net/adapter/ApexCallAdapterFactory;", "provideConverterFactory", "Lretrofit2/Converter$Factory;", "provideGlobalNetworkResultInterceptor", "Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;", "wanGlobalNetworkResultInterceptor", "Lpub/gll/onepeas/libbase/di/http/interceptor/ToDoGlobalNetworkResultInterceptor;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "converterFactory", "callAdapterFactory", "baseUrl", "provideVideoRetrofit", "provideVideoUrl", "LibBase_debug"})
@dagger.Module()
public final class BaseNetworkModule {
    
    public BaseNetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor provideGlobalNetworkResultInterceptor(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.di.http.interceptor.ToDoGlobalNetworkResultInterceptor wanGlobalNetworkResultInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.CallAdapter.Factory provideCallAdapterFactory(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.net.adapter.ApexCallAdapterFactory apexCallAdapterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Named(value = "baseUrl")
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Named(value = "videoUrl")
    public final java.lang.String provideVideoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Converter.Factory provideConverterFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter.Factory converterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.CallAdapter.Factory callAdapterFactory, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "baseUrl")
    java.lang.String baseUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "videoUrl")
    public final retrofit2.Retrofit provideVideoRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter.Factory converterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.CallAdapter.Factory callAdapterFactory, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "videoUrl")
    java.lang.String baseUrl) {
        return null;
    }
}