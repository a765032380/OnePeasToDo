package pub.gll.onepeas.libbase.di.http;

import java.lang.System;

/**
 * Created by Superman. 19/5/27
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/OkHttpBuild;", "", "()V", "DEFAULT_TIMEOUT", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "createSSLSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "LibBase_debug"})
public final class OkHttpBuild {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.di.http.OkHttpBuild INSTANCE = null;
    
    /**
     * 请求超时时间
     */
    private static final int DEFAULT_TIMEOUT = 30000;
    
    private OkHttpBuild() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.SSLSocketFactory createSSLSocketFactory() {
        return null;
    }
}