package pub.gll.onepeas.libbase.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\u0018\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n\u001a\"\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b\u001a&\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\bH\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"mToast", "Landroid/widget/Toast;", "cancelToast", "", "showLongToast", "context", "Landroid/content/Context;", "resId", "", "text", "", "showToast", "res", "duration", "LibBase_debug"})
public final class ToastUtilsKt {
    private static android.widget.Toast mToast;
    
    /**
     * 显示时间较短的吐司
     *
     * @param text String，显示的内容
     */
    public static final void showToast(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    /**
     * 显示时间较短的吐司
     *
     * @param resId int，显示内容的字符串索引
     */
    public static final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resId) {
    }
    
    /**
     * 显示时间较长的吐司
     *
     * @param text String，显示的内容
     */
    public static final void showLongToast(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    /**
     * 显示时间较长的吐司
     *
     * @param resId int，显示内容的字符串索引
     */
    public static final void showLongToast(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int resId) {
    }
    
    private static final void showToast(android.content.Context context, java.lang.String text, int duration) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int res, int duration) {
    }
    
    public static final void cancelToast() {
    }
}