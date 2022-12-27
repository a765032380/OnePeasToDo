package pub.gll.onepeas.module.comic.comic.home.db;

import java.lang.System;

@androidx.room.Database(entities = {pub.gll.onepeas.module.comic.comic.home.db.ComicHomeEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lpub/gll/onepeas/module/comic/comic/home/db/ComicHomeAppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getComicHomeDao", "Lpub/gll/onepeas/module/comic/comic/home/db/ComicHomeDao;", "ModuleComic_debug"})
public abstract class ComicHomeAppDatabase extends androidx.room.RoomDatabase {
    
    public ComicHomeAppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract pub.gll.onepeas.module.comic.comic.home.db.ComicHomeDao getComicHomeDao();
}