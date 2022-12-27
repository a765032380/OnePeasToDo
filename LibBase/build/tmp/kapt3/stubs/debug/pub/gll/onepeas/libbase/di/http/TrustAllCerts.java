package pub.gll.onepeas.libbase.di.http;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CustomX509TrustManager"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/TrustAllCerts;", "Ljavax/net/ssl/X509TrustManager;", "()V", "checkClientTrusted", "", "chain", "", "Ljava/security/cert/X509Certificate;", "authType", "", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "LibBase_debug"})
public final class TrustAllCerts implements javax.net.ssl.X509TrustManager {
    
    public TrustAllCerts() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"TrustAllX509TrustManager"})
    @java.lang.Override()
    public void checkClientTrusted(@org.jetbrains.annotations.Nullable()
    java.security.cert.X509Certificate[] chain, @org.jetbrains.annotations.Nullable()
    java.lang.String authType) {
    }
    
    @android.annotation.SuppressLint(value = {"TrustAllX509TrustManager"})
    @java.lang.Override()
    public void checkServerTrusted(@org.jetbrains.annotations.Nullable()
    java.security.cert.X509Certificate[] chain, @org.jetbrains.annotations.Nullable()
    java.lang.String authType) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}