// Generated by Dagger (https://dagger.dev).
package pub.gll.onepeas.module.comic.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeAppDatabase;
import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeDao;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ComicRoomModule_ProvideComicHomeDaoFactory implements Factory<ComicHomeDao> {
  private final ComicRoomModule module;

  private final Provider<ComicHomeAppDatabase> appDatabaseProvider;

  public ComicRoomModule_ProvideComicHomeDaoFactory(ComicRoomModule module,
      Provider<ComicHomeAppDatabase> appDatabaseProvider) {
    this.module = module;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public ComicHomeDao get() {
    return provideComicHomeDao(module, appDatabaseProvider.get());
  }

  public static ComicRoomModule_ProvideComicHomeDaoFactory create(ComicRoomModule module,
      Provider<ComicHomeAppDatabase> appDatabaseProvider) {
    return new ComicRoomModule_ProvideComicHomeDaoFactory(module, appDatabaseProvider);
  }

  public static ComicHomeDao provideComicHomeDao(ComicRoomModule instance,
      ComicHomeAppDatabase appDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideComicHomeDao(appDatabase));
  }
}
