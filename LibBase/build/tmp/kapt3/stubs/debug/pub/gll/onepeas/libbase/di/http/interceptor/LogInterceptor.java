package pub.gll.onepeas.libbase.di.http.interceptor;

import java.lang.System;

/**
 * Created by Superman on 2021/1/29.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J&\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J&\u0010\u0014\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor;", "Lokhttp3/Interceptor;", "()V", "logTag", "", "decodeUrlStr", "url", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logBasic", "", "strb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "request", "Lokhttp3/Request;", "connection", "Lokhttp3/Connection;", "logHeaders", "logRequest", "logResponse", "response", "logThat", "tempLevel", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel;", "ColorLevel", "LogLevel", "LibBase_debug"})
public final class LogInterceptor implements okhttp3.Interceptor {
    private final java.lang.String logTag = "http ## ";
    
    @javax.inject.Inject()
    public LogInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    private final void logResponse(okhttp3.Response response) {
    }
    
    /**
     * 打印日志
     */
    private final void logThat(pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel tempLevel) {
    }
    
    private final void logRequest(okhttp3.Request request, okhttp3.Connection connection) {
    }
    
    private final void logHeaders(java.lang.StringBuilder strb, okhttp3.Request request, okhttp3.Connection connection) {
    }
    
    private final void logBasic(java.lang.StringBuilder strb, okhttp3.Request request, okhttp3.Connection connection) {
    }
    
    /**
     * 对于url编码的string解码
     */
    private final java.lang.String decodeUrlStr(java.lang.String url) {
        return null;
    }
    
    /**
     * 打印日志范围
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$LogLevel;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "LibBase_debug"})
    public static enum LogLevel {
        /*public static final*/ NONE /* = new NONE() */,
        /*public static final*/ BASIC /* = new BASIC() */,
        /*public static final*/ HEADERS /* = new HEADERS() */,
        /*public static final*/ BODY /* = new BODY() */;
        
        LogLevel() {
        }
    }
    
    /**
     * Log颜色等级，应用于android Logcat分为 v、d、i、w、e
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel;", "", "()V", "DEBUG", "ERROR", "INFO", "VERBOSE", "WARN", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$VERBOSE;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$DEBUG;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$INFO;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$WARN;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$ERROR;", "LibBase_debug"})
    public static abstract class ColorLevel {
        
        private ColorLevel() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$VERBOSE;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel;", "logText", "", "(Ljava/lang/String;)V", "getLogText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LibBase_debug"})
        public static final class VERBOSE extends pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String logText = null;
            
            @org.jetbrains.annotations.NotNull()
            public final pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel.VERBOSE copy(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public VERBOSE(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLogText() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$DEBUG;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel;", "logText", "", "(Ljava/lang/String;)V", "getLogText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LibBase_debug"})
        public static final class DEBUG extends pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String logText = null;
            
            @org.jetbrains.annotations.NotNull()
            public final pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel.DEBUG copy(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public DEBUG(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLogText() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$INFO;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel;", "logText", "", "(Ljava/lang/String;)V", "getLogText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LibBase_debug"})
        public static final class INFO extends pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String logText = null;
            
            @org.jetbrains.annotations.NotNull()
            public final pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel.INFO copy(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public INFO(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLogText() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$WARN;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel;", "logText", "", "(Ljava/lang/String;)V", "getLogText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LibBase_debug"})
        public static final class WARN extends pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String logText = null;
            
            @org.jetbrains.annotations.NotNull()
            public final pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel.WARN copy(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public WARN(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLogText() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel$ERROR;", "Lpub/gll/onepeas/libbase/di/http/interceptor/LogInterceptor$ColorLevel;", "logText", "", "(Ljava/lang/String;)V", "getLogText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LibBase_debug"})
        public static final class ERROR extends pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String logText = null;
            
            @org.jetbrains.annotations.NotNull()
            public final pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor.ColorLevel.ERROR copy(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ERROR(@org.jetbrains.annotations.NotNull()
            java.lang.String logText) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLogText() {
                return null;
            }
        }
    }
}