package pub.gll.onepeas.libbase.util;

import java.lang.System;

/**
 * Class to manage status and navigation bar tint effects when using KitKat
 * translucent system UI modes.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u000223B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001dJ\u0010\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010&\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010\'\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001dJ\u000e\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010*\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010+\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u001dJ\u0018\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J\u0018\u00101\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lpub/gll/onepeas/libbase/util/SystemBarTintManager;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "config", "Lpub/gll/onepeas/libbase/util/SystemBarTintManager$SystemBarConfig;", "getConfig", "()Lpub/gll/onepeas/libbase/util/SystemBarTintManager$SystemBarConfig;", "<set-?>", "", "isNavBarTintEnabled", "()Z", "enabled", "isStatusBarTintEnabled", "setStatusBarTintEnabled", "(Z)V", "mNavBarAvailable", "mNavBarTintView", "Landroid/view/View;", "mStatusBarAvailable", "mStatusBarTintEnabled", "mStatusBarTintView", "setNavigationBarAlpha", "", "alpha", "", "setNavigationBarTintColor", "color", "", "setNavigationBarTintDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setNavigationBarTintEnabled", "setNavigationBarTintResource", "res", "setStatusBarAlpha", "setStatusBarTintColor", "setStatusBarTintDrawable", "setStatusBarTintResource", "setTintAlpha", "setTintColor", "setTintDrawable", "setTintResource", "setupNavBarView", "context", "Landroid/content/Context;", "decorViewGroup", "Landroid/view/ViewGroup;", "setupStatusBarView", "Companion", "SystemBarConfig", "LibBase_debug"})
public final class SystemBarTintManager {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.SystemBarTintManager.Companion Companion = null;
    
    /**
     * The default system bar tint color value.
     */
    public static final int DEFAULT_TINT_COLOR = -1728053248;
    private static java.lang.String sNavBarOverride;
    
    /**
     * Get the system bar configuration.
     *
     * @return The system bar configuration for the current device configuration.
     */
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.onepeas.libbase.util.SystemBarTintManager.SystemBarConfig config = null;
    private boolean mStatusBarAvailable = false;
    private boolean mNavBarAvailable = false;
    private boolean mStatusBarTintEnabled = false;
    
    /**
     * Is tinting enabled for the system navigation bar?
     *
     * @return True if enabled, False otherwise.
     */
    private boolean isNavBarTintEnabled = false;
    private android.view.View mStatusBarTintView;
    private android.view.View mNavBarTintView;
    
    public SystemBarTintManager(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.libbase.util.SystemBarTintManager.SystemBarConfig getConfig() {
        return null;
    }
    
    public final boolean isNavBarTintEnabled() {
        return false;
    }
    
    private final void setupStatusBarView(android.content.Context context, android.view.ViewGroup decorViewGroup) {
    }
    
    private final void setupNavBarView(android.content.Context context, android.view.ViewGroup decorViewGroup) {
    }
    
    /**
     * Enable tinting of the system navigation bar.
     *
     *
     * If the platform does not have soft navigation keys, is running Jelly Bean
     * or earlier, or translucent system UI modes have not been enabled in either
     * the theme or via window flags, then this method does nothing.
     *
     * @param enabled True to enable tinting, false to disable it (default).
     */
    public final void setNavigationBarTintEnabled(boolean enabled) {
    }
    
    /**
     * Apply the specified color tint to all system UI bars.
     *
     * @param color The color of the background tint.
     */
    public final void setTintColor(int color) {
    }
    
    /**
     * Apply the specified color tint to the system status bar.
     *
     * @param color The color of the background tint.
     */
    public final void setStatusBarTintColor(int color) {
    }
    
    /**
     * Apply the specified color tint to the system navigation bar.
     *
     * @param color The color of the background tint.
     */
    public final void setNavigationBarTintColor(int color) {
    }
    
    /**
     * Apply the specified drawable or color resource to all system UI bars.
     *
     * @param res The identifier of the resource.
     */
    public final void setTintResource(int res) {
    }
    
    /**
     * Apply the specified drawable or color resource to the system status bar.
     *
     * @param res The identifier of the resource.
     */
    public final void setStatusBarTintResource(int res) {
    }
    
    /**
     * Apply the specified drawable or color resource to the system navigation bar.
     *
     * @param res The identifier of the resource.
     */
    public final void setNavigationBarTintResource(int res) {
    }
    
    /**
     * Apply the specified drawable to all system UI bars.
     *
     * @param drawable The drawable to use as the background, or null to remove it.
     */
    public final void setTintDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    /**
     * Apply the specified drawable to the system status bar.
     *
     * @param drawable The drawable to use as the background, or null to remove it.
     */
    public final void setStatusBarTintDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    /**
     * Apply the specified drawable to the system navigation bar.
     *
     * @param drawable The drawable to use as the background, or null to remove it.
     */
    public final void setNavigationBarTintDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    /**
     * Apply the specified alpha to all system UI bars.
     *
     * @param alpha The alpha to use
     */
    public final void setTintAlpha(float alpha) {
    }
    
    /**
     * Apply the specified alpha to the system status bar.
     *
     * @param alpha The alpha to use
     */
    @android.annotation.TargetApi(value = 11)
    public final void setStatusBarAlpha(float alpha) {
    }
    
    /**
     * Apply the specified alpha to the system navigation bar.
     *
     * @param alpha The alpha to use
     */
    @android.annotation.TargetApi(value = 11)
    public final void setNavigationBarAlpha(float alpha) {
    }
    
    public final boolean isStatusBarTintEnabled() {
        return false;
    }
    
    public final void setStatusBarTintEnabled(boolean enabled) {
    }
    
    /**
     * Class which describes system bar sizing and other characteristics for the current
     * device configuration.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003J\u0018\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0003J\u000e\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0005J\u0010\u0010\'\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0003J\u0006\u0010)\u001a\u00020\u0005R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000b\u00a8\u0006+"}, d2 = {"Lpub/gll/onepeas/libbase/util/SystemBarTintManager$SystemBarConfig;", "", "activity", "Landroid/app/Activity;", "translucentStatusBar", "", "traslucentNavBar", "(Landroid/app/Activity;ZZ)V", "actionBarHeight", "", "getActionBarHeight", "()I", "isNavigationAtBottom", "()Z", "mHasNavigationBar", "mInPortrait", "mSmallestWidthDp", "", "mTranslucentNavBar", "mTranslucentStatusBar", "navigationBarHeight", "getNavigationBarHeight", "navigationBarWidth", "getNavigationBarWidth", "pixelInsetBottom", "getPixelInsetBottom", "pixelInsetRight", "getPixelInsetRight", "statusBarHeight", "getStatusBarHeight", "context", "Landroid/content/Context;", "getInternalDimensionSize", "res", "Landroid/content/res/Resources;", "key", "", "getPixelInsetTop", "withActionBar", "getSmallestWidthDp", "hasNavBar", "hasNavigtionBar", "Companion", "LibBase_debug"})
    public static final class SystemBarConfig {
        private final boolean mTranslucentStatusBar = false;
        private final boolean mTranslucentNavBar = false;
        
        /**
         * Get the height of the system status bar.
         *
         * @return The height of the status bar (in pixels).
         */
        private final int statusBarHeight = 0;
        
        /**
         * Get the height of the action bar.
         *
         * @return The height of the action bar (in pixels).
         */
        private final int actionBarHeight = 0;
        private final boolean mHasNavigationBar = false;
        
        /**
         * Get the height of the system navigation bar.
         *
         * @return The height of the navigation bar (in pixels). If the device does not have
         * soft navigation keys, this will always return 0.
         */
        private final int navigationBarHeight = 0;
        
        /**
         * Get the width of the system navigation bar when it is placed vertically on the screen.
         *
         * @return The width of the navigation bar (in pixels). If the device does not have
         * soft navigation keys, this will always return 0.
         */
        private final int navigationBarWidth = 0;
        private final boolean mInPortrait = false;
        private final float mSmallestWidthDp = 0.0F;
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.libbase.util.SystemBarTintManager.SystemBarConfig.Companion Companion = null;
        private static final java.lang.String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";
        private static final java.lang.String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
        private static final java.lang.String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";
        private static final java.lang.String NAV_BAR_WIDTH_RES_NAME = "navigation_bar_width";
        private static final java.lang.String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";
        
        public SystemBarConfig(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, boolean translucentStatusBar, boolean traslucentNavBar) {
            super();
        }
        
        public final int getStatusBarHeight() {
            return 0;
        }
        
        public final int getActionBarHeight() {
            return 0;
        }
        
        public final int getNavigationBarHeight() {
            return 0;
        }
        
        public final int getNavigationBarWidth() {
            return 0;
        }
        
        @android.annotation.SuppressLint(value = {"NewApi"})
        private final float getSmallestWidthDp(android.app.Activity activity) {
            return 0.0F;
        }
        
        private final int getInternalDimensionSize(android.content.res.Resources res, java.lang.String key) {
            return 0;
        }
        
        @android.annotation.TargetApi(value = 14)
        private final int getActionBarHeight(android.content.Context context) {
            return 0;
        }
        
        @android.annotation.TargetApi(value = 14)
        private final int getNavigationBarHeight(android.content.Context context) {
            return 0;
        }
        
        @android.annotation.TargetApi(value = 14)
        private final int getNavigationBarWidth(android.content.Context context) {
            return 0;
        }
        
        @android.annotation.TargetApi(value = 14)
        private final boolean hasNavBar(android.content.Context context) {
            return false;
        }
        
        /**
         * Does this device have a system navigation bar?
         *
         * @return True if this device uses soft key navigation, False otherwise.
         */
        public final boolean hasNavigtionBar() {
            return false;
        }
        
        /**
         * Get the layout inset for any system UI that appears at the top of the screen.
         *
         * @param withActionBar True to include the height of the action bar, False otherwise.
         * @return The layout inset (in pixels).
         */
        public final int getPixelInsetTop(boolean withActionBar) {
            return 0;
        }
        
        public final int getPixelInsetBottom() {
            return 0;
        }
        
        public final boolean isNavigationAtBottom() {
            return false;
        }
        
        public final int getPixelInsetRight() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/libbase/util/SystemBarTintManager$SystemBarConfig$Companion;", "", "()V", "NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME", "", "NAV_BAR_HEIGHT_RES_NAME", "NAV_BAR_WIDTH_RES_NAME", "SHOW_NAV_BAR_RES_NAME", "STATUS_BAR_HEIGHT_RES_NAME", "LibBase_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/libbase/util/SystemBarTintManager$Companion;", "", "()V", "DEFAULT_TINT_COLOR", "", "sNavBarOverride", "", "LibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}