// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.libbase.net.adapter;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApexCallAdapterFactory_Factory implements Factory<ApexCallAdapterFactory> {
  private final Provider<GlobalNetworkResultInterceptor> interceptorProvider;

  public ApexCallAdapterFactory_Factory(
      Provider<GlobalNetworkResultInterceptor> interceptorProvider) {
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public ApexCallAdapterFactory get() {
    return newInstance(interceptorProvider.get());
  }

  public static ApexCallAdapterFactory_Factory create(
      Provider<GlobalNetworkResultInterceptor> interceptorProvider) {
    return new ApexCallAdapterFactory_Factory(interceptorProvider);
  }

  public static ApexCallAdapterFactory newInstance(GlobalNetworkResultInterceptor interceptor) {
    return new ApexCallAdapterFactory(interceptor);
  }
}
