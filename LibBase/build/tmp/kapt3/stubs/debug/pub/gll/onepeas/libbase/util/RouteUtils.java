package pub.gll.onepeas.libbase.util;

import java.lang.System;

/**
 * 路由名称
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011JB\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018J\n\u0010\u001a\u001a\u00020\u0013*\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lpub/gll/onepeas/libbase/util/RouteUtils;", "", "()V", "ARGS", "", "STEAD_SYMBOL", "getArguments", "T", "navCtrl", "Landroidx/navigation/NavHostController;", "(Landroidx/navigation/NavHostController;)Ljava/lang/Object;", "getPopUpId", "", "routeName", "initBundle", "Landroid/os/Bundle;", "params", "Landroid/os/Parcelable;", "navTo", "", "destinationName", "args", "backStackRouteName", "isLaunchSingleTop", "", "needToRestoreState", "back", "LibBase_debug"})
public final class RouteUtils {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.RouteUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STEAD_SYMBOL = "^0^";
    
    /**
     * 各个序列化的参数类的key名
     */
    private static final java.lang.String ARGS = "args";
    
    private RouteUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle initBundle(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable params) {
        return null;
    }
    
    /**
     * 导航到某个页面
     */
    public final void navTo(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navCtrl, @org.jetbrains.annotations.NotNull()
    java.lang.String destinationName, @org.jetbrains.annotations.Nullable()
    java.lang.Object args, @org.jetbrains.annotations.Nullable()
    java.lang.String backStackRouteName, boolean isLaunchSingleTop, boolean needToRestoreState) {
    }
    
    public final void back(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController $this$back) {
    }
    
    private final int getPopUpId(androidx.navigation.NavHostController navCtrl, java.lang.String routeName) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getArguments(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navCtrl) {
        return null;
    }
}