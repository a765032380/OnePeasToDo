package pub.gll.onepeas.module.cookbook.db;

import java.lang.System;

@androidx.room.Database(entities = {pub.gll.onepeas.module.cookbook.db.CookbookEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lpub/gll/onepeas/module/cookbook/db/CookbookAppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getCookbookDao", "Lpub/gll/onepeas/module/cookbook/db/CookbookDao;", "ModuleCookbook_debug"})
public abstract class CookbookAppDatabase extends androidx.room.RoomDatabase {
    
    public CookbookAppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract pub.gll.onepeas.module.cookbook.db.CookbookDao getCookbookDao();
}