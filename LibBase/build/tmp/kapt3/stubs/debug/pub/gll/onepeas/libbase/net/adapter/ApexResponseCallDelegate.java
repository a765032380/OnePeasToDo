package pub.gll.onepeas.libbase.net.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\rH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lpub/gll/onepeas/libbase/net/adapter/ApexResponseCallDelegate;", "T", "Lretrofit2/Call;", "Lpub/gll/onepeas/libbase/net/NetworkResult;", "proxyCall", "interceptor", "Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;", "(Lretrofit2/Call;Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;)V", "cancel", "", "clone", "enqueue", "callback", "Lretrofit2/Callback;", "execute", "Lretrofit2/Response;", "isCanceled", "", "isExecuted", "request", "Lokhttp3/Request;", "timeout", "Lokio/Timeout;", "LibBase_debug"})
public final class ApexResponseCallDelegate<T extends java.lang.Object> implements retrofit2.Call<pub.gll.onepeas.libbase.net.NetworkResult<T>> {
    private final retrofit2.Call<T> proxyCall = null;
    private final pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor interceptor = null;
    
    public ApexResponseCallDelegate(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> proxyCall, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor interceptor) {
        super();
    }
    
    @java.lang.Override()
    public void enqueue(@org.jetbrains.annotations.NotNull()
    retrofit2.Callback<pub.gll.onepeas.libbase.net.NetworkResult<T>> callback) {
    }
    
    @java.lang.Override()
    public boolean isExecuted() {
        return false;
    }
    
    @java.lang.Override()
    public void cancel() {
    }
    
    @java.lang.Override()
    public boolean isCanceled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Request request() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okio.Timeout timeout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Call<pub.gll.onepeas.libbase.net.NetworkResult<T>> clone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.Response<pub.gll.onepeas.libbase.net.NetworkResult<T>> execute() {
        return null;
    }
}