package pub.gll.onepeas.module.account.mine;

import java.lang.System;

/**
 * 一次性事件
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/module/account/mine/UserViewEvent;", "", "()V", "ErrorMessage", "PopBack", "UserInfoEvent", "Lpub/gll/onepeas/module/account/mine/UserViewEvent$PopBack;", "Lpub/gll/onepeas/module/account/mine/UserViewEvent$ErrorMessage;", "Lpub/gll/onepeas/module/account/mine/UserViewEvent$UserInfoEvent;", "ModuleAccount_debug"})
public abstract class UserViewEvent {
    
    private UserViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/module/account/mine/UserViewEvent$PopBack;", "Lpub/gll/onepeas/module/account/mine/UserViewEvent;", "()V", "ModuleAccount_debug"})
    public static final class PopBack extends pub.gll.onepeas.module.account.mine.UserViewEvent {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.module.account.mine.UserViewEvent.PopBack INSTANCE = null;
        
        private PopBack() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/module/account/mine/UserViewEvent$ErrorMessage;", "Lpub/gll/onepeas/module/account/mine/UserViewEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ModuleAccount_debug"})
    public static final class ErrorMessage extends pub.gll.onepeas.module.account.mine.UserViewEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.module.account.mine.UserViewEvent.ErrorMessage copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ErrorMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lpub/gll/onepeas/module/account/mine/UserViewEvent$UserInfoEvent;", "Lpub/gll/onepeas/module/account/mine/UserViewEvent;", "userInfo", "Lpub/gll/onepeas/libbase/util/UserInfo;", "(Lpub/gll/onepeas/libbase/util/UserInfo;)V", "getUserInfo", "()Lpub/gll/onepeas/libbase/util/UserInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ModuleAccount_debug"})
    public static final class UserInfoEvent extends pub.gll.onepeas.module.account.mine.UserViewEvent {
        @org.jetbrains.annotations.NotNull()
        private final pub.gll.onepeas.libbase.util.UserInfo userInfo = null;
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.module.account.mine.UserViewEvent.UserInfoEvent copy(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.util.UserInfo userInfo) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public UserInfoEvent(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.util.UserInfo userInfo) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.util.UserInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.util.UserInfo getUserInfo() {
            return null;
        }
    }
}