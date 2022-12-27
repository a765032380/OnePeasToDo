package pub.gll.onepeas.libbase.util;

import java.lang.System;

/**
 * 修改状态栏颜色工具类
 *
 * @author yangjiaming
 * @version 1.0.0
 * @date 2018/12/27
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\rJ\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\tJ\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lpub/gll/onepeas/libbase/util/StatusBarUtil;", "", "()V", "TYPE_FLYME", "", "TYPE_M", "TYPE_MIUI", "getNavigationBarHeight", "context", "Landroid/app/Activity;", "getStatusBarHeight", "Landroid/content/Context;", "setCommonUI", "", "activity", "dark", "setFlymeUI", "setMiuiUI", "setRootViewFitsSystemWindows", "", "fitSystemWindows", "setRootViewPaddingTop", "setStatusBarColor", "colorId", "setStatusBarDarkTheme", "setStatusBarFontIconDark", "type", "setTranslucentStatus", "setTranslucentStatusBar", "hideStatusBarBackground", "ViewType", "LibBase_debug"})
public final class StatusBarUtil {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.StatusBarUtil INSTANCE = null;
    public static final int TYPE_MIUI = 0;
    public static final int TYPE_FLYME = 1;
    public static final int TYPE_M = 3;
    
    private StatusBarUtil() {
        super();
    }
    
    /**
     * 修改状态栏颜色，支持4.4以上版本
     *
     * @param colorId 颜色
     */
    public final void setStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int colorId) {
    }
    
    /**
     * 设置状态栏透明
     */
    public final void setTranslucentStatus(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * 代码实现android:fitsSystemWindows
     *
     * @param activity
     */
    public final void setRootViewFitsSystemWindows(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, boolean fitSystemWindows) {
    }
    
    /**
     * 代码实现android:fitsSystemWindows
     *
     * @param activity
     */
    public final void setRootViewPaddingTop(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * 设置状态栏深色浅色切换
     */
    public final boolean setStatusBarDarkTheme(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, boolean dark) {
        return false;
    }
    
    /**
     * 设置 状态栏深色浅色切换
     */
    public final boolean setStatusBarFontIconDark(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @pub.gll.onepeas.libbase.util.StatusBarUtil.ViewType()
    int type, boolean dark) {
        return false;
    }
    
    public final boolean setMiuiUI(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, boolean dark) {
        return false;
    }
    
    public final boolean setFlymeUI(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, boolean dark) {
        return false;
    }
    
    public final boolean setCommonUI(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, boolean dark) {
        return false;
    }
    
    public final int getStatusBarHeight(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    /**
     * 获得虚拟按键的高度
     *
     * @param context
     * @return
     */
    public final int getNavigationBarHeight(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        return 0;
    }
    
    public final void setTranslucentStatusBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, boolean hideStatusBarBackground) {
    }
    
    @androidx.annotation.IntDef(value = {0, 1, 3})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lpub/gll/onepeas/libbase/util/StatusBarUtil$ViewType;", "", "LibBase_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface ViewType {
    }
}