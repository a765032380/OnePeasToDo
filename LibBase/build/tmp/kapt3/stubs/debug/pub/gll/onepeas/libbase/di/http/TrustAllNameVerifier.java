package pub.gll.onepeas.libbase.di.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/TrustAllNameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "verify", "", "hostname", "", "session", "Ljavax/net/ssl/SSLSession;", "LibBase_debug"})
public final class TrustAllNameVerifier implements javax.net.ssl.HostnameVerifier {
    
    public TrustAllNameVerifier() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"BadHostnameVerifier"})
    @java.lang.Override()
    public boolean verify(@org.jetbrains.annotations.Nullable()
    java.lang.String hostname, @org.jetbrains.annotations.Nullable()
    javax.net.ssl.SSLSession session) {
        return false;
    }
}