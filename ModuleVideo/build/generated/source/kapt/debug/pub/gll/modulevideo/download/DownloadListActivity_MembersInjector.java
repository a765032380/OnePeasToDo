// Generated by Dagger (https://dagger.dev).
package pub.gll.modulevideo.download;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DownloadListActivity_MembersInjector implements MembersInjector<DownloadListActivity> {
  private final Provider<DownloadListVM> mViewModelProvider;

  public DownloadListActivity_MembersInjector(Provider<DownloadListVM> mViewModelProvider) {
    this.mViewModelProvider = mViewModelProvider;
  }

  public static MembersInjector<DownloadListActivity> create(
      Provider<DownloadListVM> mViewModelProvider) {
    return new DownloadListActivity_MembersInjector(mViewModelProvider);
  }

  @Override
  public void injectMembers(DownloadListActivity instance) {
    injectMViewModel(instance, mViewModelProvider.get());
  }

  @InjectedFieldSignature("pub.gll.modulevideo.download.DownloadListActivity.mViewModel")
  public static void injectMViewModel(DownloadListActivity instance, DownloadListVM mViewModel) {
    instance.mViewModel = mViewModel;
  }
}
