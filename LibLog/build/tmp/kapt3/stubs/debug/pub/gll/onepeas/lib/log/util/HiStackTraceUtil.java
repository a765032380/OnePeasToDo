package pub.gll.onepeas.lib.log.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002\u00a2\u0006\u0002\u0010\tJ3\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lpub/gll/onepeas/lib/log/util/HiStackTraceUtil;", "", "()V", "cropStackTrace", "", "Ljava/lang/StackTraceElement;", "callStack", "maxDepth", "", "([Ljava/lang/StackTraceElement;I)[Ljava/lang/StackTraceElement;", "getCroppedRealStackTrack", "stackTrace", "ignorePackage", "", "([Ljava/lang/StackTraceElement;Ljava/lang/String;I)[Ljava/lang/StackTraceElement;", "getRealStackTrack", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)[Ljava/lang/StackTraceElement;", "LibLog_debug"})
public final class HiStackTraceUtil {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.lib.log.util.HiStackTraceUtil INSTANCE = null;
    
    private HiStackTraceUtil() {
        super();
    }
    
    /**
     * Get the real stack trace and then crop it with a max depth.
     *
     * @param stackTrace the full stack trace
     * @param maxDepth   the max depth of real stack trace that will be cropped, 0 means no limitation
     * @return the cropped real stack trace
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.StackTraceElement[] getCroppedRealStackTrack(@org.jetbrains.annotations.NotNull()
    java.lang.StackTraceElement[] stackTrace, @org.jetbrains.annotations.Nullable()
    java.lang.String ignorePackage, int maxDepth) {
        return null;
    }
    
    /**
     * Get the real stack trace, all elements that come from XLog library would be dropped.
     *
     * @param stackTrace the full stack trace
     * @return the real stack trace, all elements come from system and library user
     */
    private final java.lang.StackTraceElement[] getRealStackTrack(java.lang.StackTraceElement[] stackTrace, java.lang.String ignorePackage) {
        return null;
    }
    
    /**
     * Crop the stack trace with a max depth.
     *
     * @param callStack the original stack trace
     * @param maxDepth  the max depth of real stack trace that will be cropped,
     * 0 means no limitation
     * @return the cropped stack trace
     */
    private final java.lang.StackTraceElement[] cropStackTrace(java.lang.StackTraceElement[] callStack, int maxDepth) {
        return null;
    }
}