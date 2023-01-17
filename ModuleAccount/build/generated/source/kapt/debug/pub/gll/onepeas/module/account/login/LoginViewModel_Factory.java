// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.module.account.login;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import pub.gll.onepeas.module.account.HttpService;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<HttpService> serviceProvider;

  public LoginViewModel_Factory(Provider<HttpService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(serviceProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<HttpService> serviceProvider) {
    return new LoginViewModel_Factory(serviceProvider);
  }

  public static LoginViewModel newInstance(HttpService service) {
    return new LoginViewModel(service);
  }
}