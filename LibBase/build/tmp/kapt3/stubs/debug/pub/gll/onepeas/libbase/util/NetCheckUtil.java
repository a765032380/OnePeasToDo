package pub.gll.onepeas.libbase.util;

import java.lang.System;

/**
 * 网络状态
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\r"}, d2 = {"Lpub/gll/onepeas/libbase/util/NetCheckUtil;", "", "()V", "checkNet", "", "context", "Landroid/content/Context;", "getLocalIpAddress", "", "isIPv4Address", "ip", "isMobileConnection", "isWIFIConnection", "LibBase_debug"})
public final class NetCheckUtil {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.NetCheckUtil INSTANCE = null;
    
    private NetCheckUtil() {
        super();
    }
    
    public final boolean checkNet(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 判断手机接入点（APN）是否处于可以使用的状态
     *
     * @param context
     * @return
     */
    private final boolean isMobileConnection(android.content.Context context) {
        return false;
    }
    
    /**
     * 判断当前wifi是否是处于可以使用状态
     *
     * @param context
     * @return
     */
    private final boolean isWIFIConnection(android.content.Context context) {
        return false;
    }
    
    /**
     * 获取本地IP地址
     *
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalIpAddress() {
        return null;
    }
    
    public final boolean isIPv4Address(@org.jetbrains.annotations.NotNull()
    java.lang.String ip) {
        return false;
    }
}