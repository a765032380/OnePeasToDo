package pub.gll.modulevideo.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lpub/gll/modulevideo/di/VideoRoomModule;", "", "()V", "provideComicHomeAppDatabase", "Lpub/gll/modulevideo/db/VideoAppDatabase;", "application", "Landroid/app/Application;", "provideComicHomeDao", "Lpub/gll/modulevideo/db/VideoDao;", "appDatabase", "ModuleVideo_debug"})
@dagger.Module()
public final class VideoRoomModule {
    
    public VideoRoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.modulevideo.db.VideoAppDatabase provideComicHomeAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.modulevideo.db.VideoDao provideComicHomeDao(@org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.db.VideoAppDatabase appDatabase) {
        return null;
    }
}