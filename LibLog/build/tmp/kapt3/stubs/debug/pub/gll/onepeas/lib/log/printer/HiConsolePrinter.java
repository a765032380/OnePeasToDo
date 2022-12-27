package pub.gll.onepeas.lib.log.printer;

import java.lang.System;

/**
 * 控制台打印，内置模块内部，不需要由外部添加
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a8\u0006\f"}, d2 = {"Lpub/gll/onepeas/lib/log/printer/HiConsolePrinter;", "Lpub/gll/onepeas/lib/log/printer/HiLogPrinter;", "()V", "print", "", "config", "Lpub/gll/onepeas/lib/log/config/HiLogConfig;", "level", "", "tag", "", "content", "LibLog_debug"})
public final class HiConsolePrinter implements pub.gll.onepeas.lib.log.printer.HiLogPrinter {
    
    public HiConsolePrinter() {
        super();
    }
    
    @java.lang.Override()
    public void print(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.config.HiLogConfig config, int level, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
}