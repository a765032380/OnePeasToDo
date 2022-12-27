package pub.gll.onepeas.libbase.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lpub/gll/onepeas/libbase/util/AppUserUtil;", "", "()V", "LOGGED_FLAG", "", "USER_INFO", "value", "", "isLogged", "()Z", "setLogged", "(Z)V", "Lpub/gll/onepeas/libbase/util/UserInfo;", "userInfo", "getUserInfo", "()Lpub/gll/onepeas/libbase/util/UserInfo;", "setUserInfo", "(Lpub/gll/onepeas/libbase/util/UserInfo;)V", "onLogOut", "", "onLogin", "LibBase_debug"})
public final class AppUserUtil {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.AppUserUtil INSTANCE = null;
    private static final java.lang.String LOGGED_FLAG = "logged_flag";
    private static final java.lang.String USER_INFO = "user_info";
    
    private AppUserUtil() {
        super();
    }
    
    public final boolean isLogged() {
        return false;
    }
    
    public final void setLogged(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final pub.gll.onepeas.libbase.util.UserInfo getUserInfo() {
        return null;
    }
    
    public final void setUserInfo(@org.jetbrains.annotations.Nullable()
    pub.gll.onepeas.libbase.util.UserInfo value) {
    }
    
    public final void onLogin(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.util.UserInfo userInfo) {
    }
    
    public final void onLogOut() {
    }
}