package pub.gll.onepeas.module.cookbook.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/module/cookbook/di/CookbookNetworkModule;", "", "()V", "provideCookbookService", "Lpub/gll/onepeas/module/cookbook/remote/CookbookService;", "retrofit", "Lretrofit2/Retrofit;", "ModuleCookbook_debug"})
@dagger.Module()
public final class CookbookNetworkModule {
    
    public CookbookNetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.onepeas.module.cookbook.remote.CookbookService provideCookbookService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}