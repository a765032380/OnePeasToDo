// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.libbase.di.http.interceptor;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LogInterceptor_Factory implements Factory<LogInterceptor> {
  @Override
  public LogInterceptor get() {
    return newInstance();
  }

  public static LogInterceptor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LogInterceptor newInstance() {
    return new LogInterceptor();
  }

  private static final class InstanceHolder {
    private static final LogInterceptor_Factory INSTANCE = new LogInterceptor_Factory();
  }
}
