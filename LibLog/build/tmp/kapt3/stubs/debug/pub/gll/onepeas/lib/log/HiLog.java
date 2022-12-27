package pub.gll.onepeas.lib.log;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\tJ\'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\tJ\'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\tJ\'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\fJ\'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\u0016J/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\u0017J7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\u001aJ \u0010\u001b\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001f\u0010\u001d\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\tJ\'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u001f\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\tJ\'\u0010 \u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lpub/gll/onepeas/lib/log/HiLog;", "", "()V", "HI_LOG_PACKAGE", "", "a", "", "contents", "", "([Ljava/lang/Object;)V", "at", "tag", "(Ljava/lang/String;[Ljava/lang/Object;)V", "d", "dt", "e", "et", "i", "it", "log", "type", "", "(I[Ljava/lang/Object;)V", "(ILjava/lang/String;[Ljava/lang/Object;)V", "config", "Lpub/gll/onepeas/lib/log/config/HiLogConfig;", "(Lpub/gll/onepeas/lib/log/config/HiLogConfig;ILjava/lang/String;[Ljava/lang/Object;)V", "parseBody", "", "v", "vt", "w", "wt", "LibLog_debug"})
public final class HiLog {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.lib.log.HiLog INSTANCE = null;
    private static final java.lang.String HI_LOG_PACKAGE = null;
    
    private HiLog() {
        super();
    }
    
    public final void v(@org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void vt(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void dt(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void i(@org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void it(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void w(@org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void wt(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void et(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void a(@org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void at(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void log(@pub.gll.onepeas.lib.log.HiLogType.TYPE()
    int type, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void log(@pub.gll.onepeas.lib.log.HiLogType.TYPE()
    int type, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    public final void log(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.config.HiLogConfig config, @pub.gll.onepeas.lib.log.HiLogType.TYPE()
    int type, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.Object... contents) {
    }
    
    private final java.lang.String parseBody(java.util.List<? extends java.lang.Object> contents, pub.gll.onepeas.lib.log.config.HiLogConfig config) {
        return null;
    }
}