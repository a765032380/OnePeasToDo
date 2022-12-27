package pub.gll.onepeas.module.account.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001eH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lpub/gll/onepeas/module/account/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "service", "Lpub/gll/onepeas/module/account/HttpService;", "(Lpub/gll/onepeas/module/account/HttpService;)V", "_viewEvents", "Lkotlinx/coroutines/channels/Channel;", "Lpub/gll/onepeas/module/account/login/LoginViewEvent;", "viewEvents", "Lkotlinx/coroutines/flow/Flow;", "getViewEvents", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "Lpub/gll/onepeas/module/account/login/LoginViewState;", "viewStates", "getViewStates", "()Lpub/gll/onepeas/module/account/login/LoginViewState;", "setViewStates", "(Lpub/gll/onepeas/module/account/login/LoginViewState;)V", "viewStates$delegate", "Landroidx/compose/runtime/MutableState;", "clearAccount", "", "clearPassword", "dispatch", "action", "Lpub/gll/onepeas/module/account/login/LoginViewAction;", "login", "updateAccount", "account", "", "updatePassword", "password", "ModuleAccount_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private pub.gll.onepeas.module.account.HttpService service;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState viewStates$delegate = null;
    private final kotlinx.coroutines.channels.Channel<pub.gll.onepeas.module.account.login.LoginViewEvent> _viewEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<pub.gll.onepeas.module.account.login.LoginViewEvent> viewEvents = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.account.HttpService service) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.module.account.login.LoginViewState getViewStates() {
        return null;
    }
    
    private final void setViewStates(pub.gll.onepeas.module.account.login.LoginViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<pub.gll.onepeas.module.account.login.LoginViewEvent> getViewEvents() {
        return null;
    }
    
    public final void dispatch(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.account.login.LoginViewAction action) {
    }
    
    private final void login() {
    }
    
    private final void clearAccount() {
    }
    
    private final void clearPassword() {
    }
    
    private final void updateAccount(java.lang.String account) {
    }
    
    private final void updatePassword(java.lang.String password) {
    }
}