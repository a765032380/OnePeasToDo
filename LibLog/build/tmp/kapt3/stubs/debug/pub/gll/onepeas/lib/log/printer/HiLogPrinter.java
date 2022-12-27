package pub.gll.onepeas.lib.log.printer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lpub/gll/onepeas/lib/log/printer/HiLogPrinter;", "Lpub/gll/onepeas/lib/log/printer/IActivityLifecycleCallbacks;", "print", "", "config", "Lpub/gll/onepeas/lib/log/config/HiLogConfig;", "level", "", "tag", "", "content", "LibLog_debug"})
public abstract interface HiLogPrinter extends pub.gll.onepeas.lib.log.printer.IActivityLifecycleCallbacks {
    
    public abstract void print(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.config.HiLogConfig config, int level, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String content);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void onActivityCreated(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.HiLogPrinter $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override()
        public static void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.HiLogPrinter $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        @java.lang.Override()
        public static void onActivityPaused(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.HiLogPrinter $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        @java.lang.Override()
        public static void onActivityResumed(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.HiLogPrinter $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        @java.lang.Override()
        public static void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.HiLogPrinter $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        android.os.Bundle outState) {
        }
        
        @java.lang.Override()
        public static void onActivityStarted(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.HiLogPrinter $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        @java.lang.Override()
        public static void onActivityStopped(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.printer.HiLogPrinter $this, @org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
    }
}