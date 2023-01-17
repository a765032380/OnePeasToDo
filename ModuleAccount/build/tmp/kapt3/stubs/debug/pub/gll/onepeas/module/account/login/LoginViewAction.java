package pub.gll.onepeas.module.account.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lpub/gll/onepeas/module/account/login/LoginViewAction;", "", "()V", "ClearAccount", "ClearPassword", "Login", "UpdateAccount", "UpdatePassword", "Lpub/gll/onepeas/module/account/login/LoginViewAction$Login;", "Lpub/gll/onepeas/module/account/login/LoginViewAction$ClearAccount;", "Lpub/gll/onepeas/module/account/login/LoginViewAction$ClearPassword;", "Lpub/gll/onepeas/module/account/login/LoginViewAction$UpdateAccount;", "Lpub/gll/onepeas/module/account/login/LoginViewAction$UpdatePassword;", "ModuleAccount_debug"})
public abstract class LoginViewAction {
    
    private LoginViewAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/module/account/login/LoginViewAction$Login;", "Lpub/gll/onepeas/module/account/login/LoginViewAction;", "()V", "ModuleAccount_debug"})
    public static final class Login extends pub.gll.onepeas.module.account.login.LoginViewAction {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.module.account.login.LoginViewAction.Login INSTANCE = null;
        
        private Login() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/module/account/login/LoginViewAction$ClearAccount;", "Lpub/gll/onepeas/module/account/login/LoginViewAction;", "()V", "ModuleAccount_debug"})
    public static final class ClearAccount extends pub.gll.onepeas.module.account.login.LoginViewAction {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.module.account.login.LoginViewAction.ClearAccount INSTANCE = null;
        
        private ClearAccount() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/module/account/login/LoginViewAction$ClearPassword;", "Lpub/gll/onepeas/module/account/login/LoginViewAction;", "()V", "ModuleAccount_debug"})
    public static final class ClearPassword extends pub.gll.onepeas.module.account.login.LoginViewAction {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.module.account.login.LoginViewAction.ClearPassword INSTANCE = null;
        
        private ClearPassword() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/module/account/login/LoginViewAction$UpdateAccount;", "Lpub/gll/onepeas/module/account/login/LoginViewAction;", "account", "", "(Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ModuleAccount_debug"})
    public static final class UpdateAccount extends pub.gll.onepeas.module.account.login.LoginViewAction {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String account = null;
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.module.account.login.LoginViewAction.UpdateAccount copy(@org.jetbrains.annotations.NotNull()
        java.lang.String account) {
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
        
        public UpdateAccount(@org.jetbrains.annotations.NotNull()
        java.lang.String account) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAccount() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/onepeas/module/account/login/LoginViewAction$UpdatePassword;", "Lpub/gll/onepeas/module/account/login/LoginViewAction;", "password", "", "(Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ModuleAccount_debug"})
    public static final class UpdatePassword extends pub.gll.onepeas.module.account.login.LoginViewAction {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String password = null;
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.module.account.login.LoginViewAction.UpdatePassword copy(@org.jetbrains.annotations.NotNull()
        java.lang.String password) {
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
        
        public UpdatePassword(@org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPassword() {
            return null;
        }
    }
}