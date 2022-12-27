package pub.gll.onepeas.libbase.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/libbase/net/NetworkResult;", "T", "", "()V", "Failure", "ResponseGetter", "Success", "Lpub/gll/onepeas/libbase/net/NetworkResult$Success;", "Lpub/gll/onepeas/libbase/net/NetworkResult$Failure;", "LibBase_debug"})
public abstract class NetworkResult<T extends java.lang.Object> {
    
    private NetworkResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lpub/gll/onepeas/libbase/net/NetworkResult$ResponseGetter;", "", "code", "", "getCode", "()I", "headers", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "LibBase_debug"})
    static abstract interface ResponseGetter {
        
        public abstract int getCode();
        
        @org.jetbrains.annotations.NotNull()
        public abstract okhttp3.Headers getHeaders();
    }
    
    /**
     * 网络请求成功
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00028\u00018FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lpub/gll/onepeas/libbase/net/NetworkResult$Success;", "T", "Lpub/gll/onepeas/libbase/net/NetworkResult;", "Lpub/gll/onepeas/libbase/net/NetworkResult$ResponseGetter;", "response", "Lretrofit2/Response;", "(Lretrofit2/Response;)V", "code", "", "getCode", "()I", "code$delegate", "Lkotlin/Lazy;", "headers", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "headers$delegate", "responseBody", "getResponseBody", "()Ljava/lang/Object;", "responseBody$delegate", "LibBase_debug"})
    public static final class Success<T extends java.lang.Object> extends pub.gll.onepeas.libbase.net.NetworkResult<T> implements pub.gll.onepeas.libbase.net.NetworkResult.ResponseGetter {
        private final retrofit2.Response<T> response = null;
        private final kotlin.Lazy responseBody$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy code$delegate = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy headers$delegate = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        retrofit2.Response<T> response) {
            super();
        }
        
        public final T getResponseBody() {
            return null;
        }
        
        @java.lang.Override()
        public int getCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.Headers getHeaders() {
            return null;
        }
    }
    
    /**
     * 网络请求失败
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lpub/gll/onepeas/libbase/net/NetworkResult$Failure;", "T", "Lpub/gll/onepeas/libbase/net/NetworkResult;", "()V", "Exception", "ServerError", "Lpub/gll/onepeas/libbase/net/NetworkResult$Failure$ServerError;", "Lpub/gll/onepeas/libbase/net/NetworkResult$Failure$Exception;", "LibBase_debug"})
    public static abstract class Failure<T extends java.lang.Object> extends pub.gll.onepeas.libbase.net.NetworkResult<T> {
        
        private Failure() {
            super();
        }
        
        /**
         * HTTP协议错误
         */
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u00c6\u0003J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001J\t\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u001b\u0010\u0007\u001a\u00020\b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006!"}, d2 = {"Lpub/gll/onepeas/libbase/net/NetworkResult$Failure$ServerError;", "T", "Lpub/gll/onepeas/libbase/net/NetworkResult$Failure;", "Lpub/gll/onepeas/libbase/net/NetworkResult$ResponseGetter;", "response", "Lretrofit2/Response;", "(Lretrofit2/Response;)V", "code", "", "getCode", "()I", "code$delegate", "Lkotlin/Lazy;", "headers", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "headers$delegate", "getResponse", "()Lretrofit2/Response;", "responseErrorMessage", "", "getResponseErrorMessage", "()Ljava/lang/String;", "responseErrorMessage$delegate", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "LibBase_debug"})
        public static final class ServerError<T extends java.lang.Object> extends pub.gll.onepeas.libbase.net.NetworkResult.Failure<T> implements pub.gll.onepeas.libbase.net.NetworkResult.ResponseGetter {
            @org.jetbrains.annotations.NotNull()
            private final retrofit2.Response<T> response = null;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy responseErrorMessage$delegate = null;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy code$delegate = null;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy headers$delegate = null;
            
            /**
             * HTTP协议错误
             */
            @org.jetbrains.annotations.NotNull()
            public final pub.gll.onepeas.libbase.net.NetworkResult.Failure.ServerError<T> copy(@org.jetbrains.annotations.NotNull()
            retrofit2.Response<T> response) {
                return null;
            }
            
            /**
             * HTTP协议错误
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * HTTP协议错误
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * HTTP协议错误
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public ServerError(@org.jetbrains.annotations.NotNull()
            retrofit2.Response<T> response) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final retrofit2.Response<T> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final retrofit2.Response<T> getResponse() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getResponseErrorMessage() {
                return null;
            }
            
            @java.lang.Override()
            public int getCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public okhttp3.Headers getHeaders() {
                return null;
            }
        }
        
        /**
         * 网络请求出现异常
         */
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lpub/gll/onepeas/libbase/net/NetworkResult$Failure$Exception;", "T", "Lpub/gll/onepeas/libbase/net/NetworkResult$Failure;", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "exceptionMessage", "", "getExceptionMessage", "()Ljava/lang/String;", "exceptionMessage$delegate", "Lkotlin/Lazy;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "LibBase_debug"})
        public static final class Exception<T extends java.lang.Object> extends pub.gll.onepeas.libbase.net.NetworkResult.Failure<T> {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable exception = null;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Lazy exceptionMessage$delegate = null;
            
            /**
             * 网络请求出现异常
             */
            @org.jetbrains.annotations.NotNull()
            public final pub.gll.onepeas.libbase.net.NetworkResult.Failure.Exception<T> copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable exception) {
                return null;
            }
            
            /**
             * 网络请求出现异常
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * 网络请求出现异常
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * 网络请求出现异常
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Exception(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable exception) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getException() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getExceptionMessage() {
                return null;
            }
        }
    }
}