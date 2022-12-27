package pub.gll.onepeas.module.car.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lpub/gll/onepeas/module/car/di/CarRoomModule;", "", "()V", "provideCarBrandDao", "Lpub/gll/onepeas/module/car/db/CarBrandDao;", "appDatabase", "Lpub/gll/onepeas/module/car/db/AppDatabase;", "provideCarDatabase", "application", "Landroid/app/Application;", "ModuleCar_debug"})
@dagger.Module()
public final class CarRoomModule {
    
    public CarRoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.onepeas.module.car.db.AppDatabase provideCarDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final pub.gll.onepeas.module.car.db.CarBrandDao provideCarBrandDao(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.car.db.AppDatabase appDatabase) {
        return null;
    }
}