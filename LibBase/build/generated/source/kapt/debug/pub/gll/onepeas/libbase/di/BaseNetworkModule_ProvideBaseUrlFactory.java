// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.libbase.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseNetworkModule_ProvideBaseUrlFactory implements Factory<String> {
  private final BaseNetworkModule module;

  public BaseNetworkModule_ProvideBaseUrlFactory(BaseNetworkModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseUrl(module);
  }

  public static BaseNetworkModule_ProvideBaseUrlFactory create(BaseNetworkModule module) {
    return new BaseNetworkModule_ProvideBaseUrlFactory(module);
  }

  public static String provideBaseUrl(BaseNetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBaseUrl());
  }
}