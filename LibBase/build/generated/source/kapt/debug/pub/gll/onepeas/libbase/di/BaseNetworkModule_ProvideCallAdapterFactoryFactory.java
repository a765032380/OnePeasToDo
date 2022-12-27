// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.libbase.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import pub.gll.onepeas.libbase.net.adapter.ApexCallAdapterFactory;
import retrofit2.CallAdapter;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseNetworkModule_ProvideCallAdapterFactoryFactory implements Factory<CallAdapter.Factory> {
  private final BaseNetworkModule module;

  private final Provider<ApexCallAdapterFactory> apexCallAdapterFactoryProvider;

  public BaseNetworkModule_ProvideCallAdapterFactoryFactory(BaseNetworkModule module,
      Provider<ApexCallAdapterFactory> apexCallAdapterFactoryProvider) {
    this.module = module;
    this.apexCallAdapterFactoryProvider = apexCallAdapterFactoryProvider;
  }

  @Override
  public CallAdapter.Factory get() {
    return provideCallAdapterFactory(module, apexCallAdapterFactoryProvider.get());
  }

  public static BaseNetworkModule_ProvideCallAdapterFactoryFactory create(BaseNetworkModule module,
      Provider<ApexCallAdapterFactory> apexCallAdapterFactoryProvider) {
    return new BaseNetworkModule_ProvideCallAdapterFactoryFactory(module, apexCallAdapterFactoryProvider);
  }

  public static CallAdapter.Factory provideCallAdapterFactory(BaseNetworkModule instance,
      ApexCallAdapterFactory apexCallAdapterFactory) {
    return Preconditions.checkNotNullFromProvides(instance.provideCallAdapterFactory(apexCallAdapterFactory));
  }
}
