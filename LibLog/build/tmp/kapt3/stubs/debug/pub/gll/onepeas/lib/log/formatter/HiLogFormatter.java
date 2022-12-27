package pub.gll.onepeas.lib.log.formatter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/lib/log/formatter/HiLogFormatter;", "T", "", "format", "", "data", "(Ljava/lang/Object;)Ljava/lang/String;", "LibLog_debug"})
public abstract interface HiLogFormatter<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String format(@org.jetbrains.annotations.Nullable()
    T data);
}