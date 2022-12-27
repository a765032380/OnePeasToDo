package pub.gll.onepeas.libbase.net.exception;

import java.lang.System;

/**
 * 一种为了传递字符串信息的异常，用于在Retrofit或者OkHttp处理过程中抛出
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/libbase/net/exception/MsgException;", "Ljava/io/IOException;", "tip", "", "(Ljava/lang/String;)V", "getTip", "()Ljava/lang/String;", "LibBase_debug"})
public final class MsgException extends java.io.IOException {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tip = null;
    
    public MsgException(@org.jetbrains.annotations.NotNull()
    java.lang.String tip) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTip() {
        return null;
    }
}