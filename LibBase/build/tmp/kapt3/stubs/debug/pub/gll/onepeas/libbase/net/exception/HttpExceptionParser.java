package pub.gll.onepeas.libbase.net.exception;

import java.lang.System;

/**
 * 网络异常解析器
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/libbase/net/exception/HttpExceptionParser;", "", "parse", "", "throwable", "", "Companion", "LibBase_debug"})
public abstract interface HttpExceptionParser {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.net.exception.HttpExceptionParser.Companion Companion = null;
    
    /**
     * 将一个异常转化为自然语言报错
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String parse(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/libbase/net/exception/HttpExceptionParser$Companion;", "", "()V", "DEFAULT_PARSER", "Lpub/gll/onepeas/libbase/net/exception/HttpExceptionParser;", "getDEFAULT_PARSER", "()Lpub/gll/onepeas/libbase/net/exception/HttpExceptionParser;", "LibBase_debug"})
    public static final class Companion {
        
        /**
         * 默认实现
         */
        @org.jetbrains.annotations.NotNull()
        private static final pub.gll.onepeas.libbase.net.exception.HttpExceptionParser DEFAULT_PARSER = null;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.net.exception.HttpExceptionParser getDEFAULT_PARSER() {
            return null;
        }
    }
}