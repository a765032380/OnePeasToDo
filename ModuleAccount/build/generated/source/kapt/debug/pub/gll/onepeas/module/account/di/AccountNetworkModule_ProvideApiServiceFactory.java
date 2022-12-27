// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.module.account.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import pub.gll.onepeas.module.account.HttpService;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AccountNetworkModule_ProvideApiServiceFactory implements Factory<HttpService> {
  private final AccountNetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AccountNetworkModule_ProvideApiServiceFactory(AccountNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public HttpService get() {
    return provideApiService(module, retrofitProvider.get());
  }

  public static AccountNetworkModule_ProvideApiServiceFactory create(AccountNetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    return new AccountNetworkModule_ProvideApiServiceFactory(module, retrofitProvider);
  }

  public static HttpService provideApiService(AccountNetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideApiService(retrofit));
  }
}
