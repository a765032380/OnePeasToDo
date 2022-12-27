package pub.gll.onepeas.lib.log;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lpub/gll/onepeas/lib/log/HiLogType;", "", "()V", "A", "", "D", "E", "I", "V", "W", "TYPE", "LibLog_debug"})
public final class HiLogType {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.lib.log.HiLogType INSTANCE = null;
    public static final int V = android.util.Log.VERBOSE;
    public static final int D = android.util.Log.DEBUG;
    public static final int I = android.util.Log.INFO;
    public static final int W = android.util.Log.WARN;
    public static final int E = android.util.Log.ERROR;
    public static final int A = android.util.Log.ASSERT;
    
    private HiLogType() {
        super();
    }
    
    @androidx.annotation.IntDef(value = {2, 3, 4, 5, 6, 7})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lpub/gll/onepeas/lib/log/HiLogType$TYPE;", "", "LibLog_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface TYPE {
    }
}