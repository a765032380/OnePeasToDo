package pub.gll.modulevideo.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lpub/gll/modulevideo/di/VideoRepositoryModule;", "", "()V", "provideCookbookRepository", "Lpub/gll/modulevideo/repository/VideoRepository;", "api", "Lpub/gll/modulevideo/remote/VideoService;", "appDatabase", "Lpub/gll/modulevideo/db/VideoAppDatabase;", "ModuleVideo_debug"})
@dagger.Module()
public final class VideoRepositoryModule {
    
    public VideoRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.modulevideo.repository.VideoRepository provideCookbookRepository(@org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.remote.VideoService api, @org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.db.VideoAppDatabase appDatabase) {
        return null;
    }
}