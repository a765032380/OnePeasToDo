// Generated by Dagger (https://dagger.dev).
package pub.gll.modulevideo.download;

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
public final class DownloadListVM_Factory implements Factory<DownloadListVM> {
  @Override
  public DownloadListVM get() {
    return newInstance();
  }

  public static DownloadListVM_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DownloadListVM newInstance() {
    return new DownloadListVM();
  }

  private static final class InstanceHolder {
    private static final DownloadListVM_Factory INSTANCE = new DownloadListVM_Factory();
  }
}