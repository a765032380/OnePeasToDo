package pub.gll.onepeas.module.comic.comic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0001\u0003\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute;", "", "routeName", "", "stringId", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Ljava/lang/String;ILandroidx/compose/ui/graphics/vector/ImageVector;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "setIcon", "(Landroidx/compose/ui/graphics/vector/ImageVector;)V", "getRouteName", "()Ljava/lang/String;", "setRouteName", "(Ljava/lang/String;)V", "getStringId", "()I", "setStringId", "(I)V", "BOOKSHELF", "Home", "MINE", "Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute$Home;", "Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute$BOOKSHELF;", "Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute$MINE;", "ModuleComic_debug"})
public abstract class ComicBottomNavRoute {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String routeName;
    private int stringId;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.ui.graphics.vector.ImageVector icon;
    
    private ComicBottomNavRoute(java.lang.String routeName, @androidx.annotation.StringRes()
    int stringId, androidx.compose.ui.graphics.vector.ImageVector icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRouteName() {
        return null;
    }
    
    public final void setRouteName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStringId() {
        return 0;
    }
    
    public final void setStringId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.ui.graphics.vector.ImageVector getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute$Home;", "Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute;", "()V", "ModuleComic_debug"})
    public static final class Home extends pub.gll.onepeas.module.comic.comic.ComicBottomNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.module.comic.comic.ComicBottomNavRoute.Home INSTANCE = null;
        
        private Home() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute$BOOKSHELF;", "Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute;", "()V", "ModuleComic_debug"})
    public static final class BOOKSHELF extends pub.gll.onepeas.module.comic.comic.ComicBottomNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.module.comic.comic.ComicBottomNavRoute.BOOKSHELF INSTANCE = null;
        
        private BOOKSHELF() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute$MINE;", "Lpub/gll/onepeas/module/comic/comic/ComicBottomNavRoute;", "()V", "ModuleComic_debug"})
    public static final class MINE extends pub.gll.onepeas.module.comic.comic.ComicBottomNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.module.comic.comic.ComicBottomNavRoute.MINE INSTANCE = null;
        
        private MINE() {
            super(null, 0, null);
        }
    }
}