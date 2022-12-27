package pub.gll.onepeas.lib.log.printer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u000f"}, d2 = {"Lpub/gll/onepeas/lib/log/printer/IActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "LibLog_debug"})
public abstract interface IActivityLifecycleCallbacks extends android.app.Application.ActivityLifecycleCallbacks {
    
    @java.lang.Override()
    public abstract void onActivityCreated(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    @java.lang.Override()
    public abstract void onActivityStarted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    @java.lang.Override()
    public abstract void onActivityResumed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    @java.lang.Override()
    public abstract void onActivityPaused(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    @java.lang.Override()
    public abstract void onActivityStopped(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    @java.lang.Override()
    public abstract void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.os.Bundle outState);
    
    @java.lang.Override()
    public abstract void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void onActivityCreated(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.IActivityLifecycleCallbacks $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override()
        public static void onActivityStarted(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.IActivityLifecycleCallbacks $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        @java.lang.Override()
        public static void onActivityResumed(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.IActivityLifecycleCallbacks $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        @java.lang.Override()
        public static void onActivityPaused(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.IActivityLifecycleCallbacks $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        @java.lang.Override()
        public static void onActivityStopped(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.IActivityLifecycleCallbacks $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        @java.lang.Override()
        public static void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.IActivityLifecycleCallbacks $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        android.os.Bundle outState) {
        }
        
        @java.lang.Override()
        public static void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.IActivityLifecycleCallbacks $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
    }
}