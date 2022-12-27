package pub.gll.onepeas.module.account.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/module/account/di/AccountNetworkModule;", "", "()V", "provideApiService", "Lpub/gll/onepeas/module/account/HttpService;", "retrofit", "Lretrofit2/Retrofit;", "provideVideoService", "Lpub/gll/onepeas/module/account/VideoService;", "ModuleAccount_debug"})
@dagger.Module()
public final class AccountNetworkModule {
    
    public AccountNetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.onepeas.module.account.HttpService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.onepeas.module.account.VideoService provideVideoService(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "videoUrl")
    retrofit2.Retrofit retrofit) {
        return null;
    }
}