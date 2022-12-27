package pub.gll.onepeas.libbase.net.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t*\u00020\n\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\f\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\t0\u0011\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\r\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\t0\u0013\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\r\u00a8\u0006\u0014"}, d2 = {"downloadAndCount", "", "Lokhttp3/ResponseBody;", "dest", "Ljava/io/File;", "onDownloadListener", "Lpub/gll/onepeas/libbase/net/ext/DownloadListener;", "toExceptionResult", "Lpub/gll/onepeas/libbase/net/NetworkResult$Failure$Exception;", "T", "", "toNetworkResult", "Lpub/gll/onepeas/libbase/net/NetworkResult;", "Lretrofit2/Response;", "interceptor", "Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;", "toServerErrorResult", "Lpub/gll/onepeas/libbase/net/NetworkResult$Failure$ServerError;", "toSuccessResult", "Lpub/gll/onepeas/libbase/net/NetworkResult$Success;", "LibBase_debug"})
public final class ResponseExtKt {
    
    public static final void downloadAndCount(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody $this$downloadAndCount, @org.jetbrains.annotations.NotNull()
    java.io.File dest, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.net.ext.DownloadListener onDownloadListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>pub.gll.onepeas.libbase.net.NetworkResult<T> toNetworkResult(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$toNetworkResult, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor interceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>pub.gll.onepeas.libbase.net.NetworkResult.Success<T> toSuccessResult(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$toSuccessResult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>pub.gll.onepeas.libbase.net.NetworkResult.Failure.ServerError<T> toServerErrorResult(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$toServerErrorResult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>pub.gll.onepeas.libbase.net.NetworkResult.Failure.Exception<T> toExceptionResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable $this$toExceptionResult) {
        return null;
    }
}