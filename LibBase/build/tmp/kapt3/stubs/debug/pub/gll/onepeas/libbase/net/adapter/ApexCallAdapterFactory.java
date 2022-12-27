package pub.gll.onepeas.libbase.net.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096\u0002\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/libbase/net/adapter/ApexCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "interceptor", "Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;", "(Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;)V", "get", "Lpub/gll/onepeas/libbase/net/adapter/ApexCallAdapter;", "returnType", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lpub/gll/onepeas/libbase/net/adapter/ApexCallAdapter;", "Companion", "LibBase_debug"})
public final class ApexCallAdapterFactory extends retrofit2.CallAdapter.Factory {
    private final pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor interceptor = null;
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.net.adapter.ApexCallAdapterFactory.Companion Companion = null;
    
    @javax.inject.Inject()
    public ApexCallAdapterFactory(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor interceptor) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public pub.gll.onepeas.libbase.net.adapter.ApexCallAdapter get(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type returnType, @org.jetbrains.annotations.NotNull()
    java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/libbase/net/adapter/ApexCallAdapterFactory$Companion;", "", "()V", "create", "Lpub/gll/onepeas/libbase/net/adapter/ApexCallAdapterFactory;", "interceptor", "Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;", "LibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.net.adapter.ApexCallAdapterFactory create(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor interceptor) {
            return null;
        }
    }
}