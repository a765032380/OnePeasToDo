package pub.gll.onepeas.libbase.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003H\u0016\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;", "", "onIntercept", "Lpub/gll/onepeas/libbase/net/NetworkResult;", "T", "networkResult", "DefaultGlobalNetworkResultInterceptor", "LibBase_debug"})
public abstract interface GlobalNetworkResultInterceptor {
    
    /**
     * 拦截网络请求，
     */
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends java.lang.Object>pub.gll.onepeas.libbase.net.NetworkResult<T> onIntercept(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.net.NetworkResult<T> networkResult);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor$DefaultGlobalNetworkResultInterceptor;", "Lpub/gll/onepeas/libbase/net/GlobalNetworkResultInterceptor;", "()V", "LibBase_debug"})
    public static final class DefaultGlobalNetworkResultInterceptor implements pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor.DefaultGlobalNetworkResultInterceptor INSTANCE = null;
        
        /**
         * 拦截网络请求，
         */
        @org.jetbrains.annotations.NotNull()
        public <T extends java.lang.Object>pub.gll.onepeas.libbase.net.NetworkResult<T> onIntercept(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.net.NetworkResult<T> networkResult) {
            return null;
        }
        
        private DefaultGlobalNetworkResultInterceptor() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        /**
         * 拦截网络请求，
         */
        @org.jetbrains.annotations.NotNull()
        public static <T extends java.lang.Object>pub.gll.onepeas.libbase.net.NetworkResult<T> onIntercept(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor $this, @org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.net.NetworkResult<T> networkResult) {
            return null;
        }
    }
}