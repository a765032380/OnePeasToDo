package pub.gll.onepeas.lib.log.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0013\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0012"}, d2 = {"Lpub/gll/onepeas/lib/log/config/HiLogConfig;", "", "()V", "enable", "", "getGlobalTag", "", "includeThread", "injectJsonParser", "Lpub/gll/onepeas/lib/log/config/HiLogConfig$JsonParser;", "printers", "", "Lpub/gll/onepeas/lib/log/printer/HiLogPrinter;", "()[Lpub/gll/onepeas/lib/log/printer/HiLogPrinter;", "stackTraceDepth", "", "Companion", "JsonParser", "LibLog_debug"})
public final class HiLogConfig {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.lib.log.config.HiLogConfig.Companion Companion = null;
    private static int MAX_LEN = 512;
    @org.jetbrains.annotations.NotNull()
    private static pub.gll.onepeas.lib.log.formatter.HiThreadFormatter HI_THREAD_FORMATTER;
    @org.jetbrains.annotations.NotNull()
    private static pub.gll.onepeas.lib.log.formatter.HiStackTraceFormatter HI_STACK_TRACE_FORMATTER;
    
    public HiLogConfig() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final pub.gll.onepeas.lib.log.config.HiLogConfig.JsonParser injectJsonParser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGlobalTag() {
        return null;
    }
    
    public final boolean enable() {
        return false;
    }
    
    public final boolean includeThread() {
        return false;
    }
    
    public final int stackTraceDepth() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final pub.gll.onepeas.lib.log.printer.HiLogPrinter[] printers() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&\u00a8\u0006\u0005"}, d2 = {"Lpub/gll/onepeas/lib/log/config/HiLogConfig$JsonParser;", "", "toJson", "", "src", "LibLog_debug"})
    public static abstract interface JsonParser {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.String toJson(@org.jetbrains.annotations.Nullable()
        java.lang.Object src);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lpub/gll/onepeas/lib/log/config/HiLogConfig$Companion;", "", "()V", "HI_STACK_TRACE_FORMATTER", "Lpub/gll/onepeas/lib/log/formatter/HiStackTraceFormatter;", "getHI_STACK_TRACE_FORMATTER", "()Lpub/gll/onepeas/lib/log/formatter/HiStackTraceFormatter;", "setHI_STACK_TRACE_FORMATTER", "(Lpub/gll/onepeas/lib/log/formatter/HiStackTraceFormatter;)V", "HI_THREAD_FORMATTER", "Lpub/gll/onepeas/lib/log/formatter/HiThreadFormatter;", "getHI_THREAD_FORMATTER", "()Lpub/gll/onepeas/lib/log/formatter/HiThreadFormatter;", "setHI_THREAD_FORMATTER", "(Lpub/gll/onepeas/lib/log/formatter/HiThreadFormatter;)V", "MAX_LEN", "", "getMAX_LEN", "()I", "setMAX_LEN", "(I)V", "LibLog_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getMAX_LEN() {
            return 0;
        }
        
        public final void setMAX_LEN(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.lib.log.formatter.HiThreadFormatter getHI_THREAD_FORMATTER() {
            return null;
        }
        
        public final void setHI_THREAD_FORMATTER(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.formatter.HiThreadFormatter p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.lib.log.formatter.HiStackTraceFormatter getHI_STACK_TRACE_FORMATTER() {
            return null;
        }
        
        public final void setHI_STACK_TRACE_FORMATTER(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.lib.log.formatter.HiStackTraceFormatter p0) {
        }
    }
}