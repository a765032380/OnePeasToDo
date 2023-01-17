// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.libbase.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import pub.gll.onepeas.libbase.di.http.interceptor.ToDoGlobalNetworkResultInterceptor;
import pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseNetworkModule_ProvideGlobalNetworkResultInterceptorFactory implements Factory<GlobalNetworkResultInterceptor> {
  private final BaseNetworkModule module;

  private final Provider<ToDoGlobalNetworkResultInterceptor> wanGlobalNetworkResultInterceptorProvider;

  public BaseNetworkModule_ProvideGlobalNetworkResultInterceptorFactory(BaseNetworkModule module,
      Provider<ToDoGlobalNetworkResultInterceptor> wanGlobalNetworkResultInterceptorProvider) {
    this.module = module;
    this.wanGlobalNetworkResultInterceptorProvider = wanGlobalNetworkResultInterceptorProvider;
  }

  @Override
  public GlobalNetworkResultInterceptor get() {
    return provideGlobalNetworkResultInterceptor(module, wanGlobalNetworkResultInterceptorProvider.get());
  }

  public static BaseNetworkModule_ProvideGlobalNetworkResultInterceptorFactory create(
      BaseNetworkModule module,
      Provider<ToDoGlobalNetworkResultInterceptor> wanGlobalNetworkResultInterceptorProvider) {
    return new BaseNetworkModule_ProvideGlobalNetworkResultInterceptorFactory(module, wanGlobalNetworkResultInterceptorProvider);
  }

  public static GlobalNetworkResultInterceptor provideGlobalNetworkResultInterceptor(
      BaseNetworkModule instance,
      ToDoGlobalNetworkResultInterceptor wanGlobalNetworkResultInterceptor) {
    return Preconditions.checkNotNullFromProvides(instance.provideGlobalNetworkResultInterceptor(wanGlobalNetworkResultInterceptor));
  }
}