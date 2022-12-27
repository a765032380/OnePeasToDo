package pub.gll.onepeas.module.comic.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/module/comic/di/ComicRepositoryModule;", "", "()V", "provideComicHomeRepository", "Lpub/gll/onepeas/module/comic/comic/home/repository/ComicRepository;", "api", "Lpub/gll/onepeas/module/comic/comic/home/remote/ComicHomeService;", "appDatabase", "Lpub/gll/onepeas/module/comic/comic/home/db/ComicHomeAppDatabase;", "ModuleComic_debug"})
@dagger.Module()
public final class ComicRepositoryModule {
    
    public ComicRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.onepeas.module.comic.comic.home.repository.ComicRepository provideComicHomeRepository(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.comic.comic.home.remote.ComicHomeService api, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.comic.comic.home.db.ComicHomeAppDatabase appDatabase) {
        return null;
    }
}