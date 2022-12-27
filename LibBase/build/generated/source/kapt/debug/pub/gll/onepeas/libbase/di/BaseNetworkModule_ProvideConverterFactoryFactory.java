// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.libbase.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import retrofit2.Converter;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseNetworkModule_ProvideConverterFactoryFactory implements Factory<Converter.Factory> {
  private final BaseNetworkModule module;

  public BaseNetworkModule_ProvideConverterFactoryFactory(BaseNetworkModule module) {
    this.module = module;
  }

  @Override
  public Converter.Factory get() {
    return provideConverterFactory(module);
  }

  public static BaseNetworkModule_ProvideConverterFactoryFactory create(BaseNetworkModule module) {
    return new BaseNetworkModule_ProvideConverterFactoryFactory(module);
  }

  public static Converter.Factory provideConverterFactory(BaseNetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideConverterFactory());
  }
}
