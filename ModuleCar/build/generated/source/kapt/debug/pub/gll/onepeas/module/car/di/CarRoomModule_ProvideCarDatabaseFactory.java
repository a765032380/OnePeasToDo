// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.module.car.di;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import pub.gll.onepeas.module.car.db.AppDatabase;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CarRoomModule_ProvideCarDatabaseFactory implements Factory<AppDatabase> {
  private final CarRoomModule module;

  private final Provider<Application> applicationProvider;

  public CarRoomModule_ProvideCarDatabaseFactory(CarRoomModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideCarDatabase(module, applicationProvider.get());
  }

  public static CarRoomModule_ProvideCarDatabaseFactory create(CarRoomModule module,
      Provider<Application> applicationProvider) {
    return new CarRoomModule_ProvideCarDatabaseFactory(module, applicationProvider);
  }

  public static AppDatabase provideCarDatabase(CarRoomModule instance, Application application) {
    return Preconditions.checkNotNullFromProvides(instance.provideCarDatabase(application));
  }
}
