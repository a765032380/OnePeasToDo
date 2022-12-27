package pub.gll.onepeas.module.account.mine;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\u0016\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u001fH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00178F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006+"}, d2 = {"Lpub/gll/onepeas/module/account/mine/UserVM;", "Landroidx/lifecycle/ViewModel;", "service", "Lpub/gll/onepeas/module/account/HttpService;", "videoService", "Lpub/gll/onepeas/module/account/VideoService;", "(Lpub/gll/onepeas/module/account/HttpService;Lpub/gll/onepeas/module/account/VideoService;)V", "_viewEvents", "Lkotlinx/coroutines/channels/Channel;", "Lpub/gll/onepeas/module/account/mine/UserViewEvent;", "<set-?>", "Lpub/gll/onepeas/module/account/mine/EditUserState;", "editUserState", "getEditUserState", "()Lpub/gll/onepeas/module/account/mine/EditUserState;", "setEditUserState", "(Lpub/gll/onepeas/module/account/mine/EditUserState;)V", "editUserState$delegate", "Landroidx/compose/runtime/MutableState;", "viewEvents", "Lkotlinx/coroutines/flow/Flow;", "getViewEvents", "()Lkotlinx/coroutines/flow/Flow;", "Lpub/gll/onepeas/libbase/util/UserInfo;", "viewStates", "getViewStates", "()Lpub/gll/onepeas/libbase/util/UserInfo;", "setViewStates", "(Lpub/gll/onepeas/libbase/util/UserInfo;)V", "viewStates$delegate", "dispatch", "", "action", "Lpub/gll/onepeas/module/account/mine/UserViewAction;", "updateUser", "head_image", "", "upload", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "userInfo", "ModuleAccount_debug"})
public final class UserVM extends androidx.lifecycle.ViewModel {
    private pub.gll.onepeas.module.account.HttpService service;
    private pub.gll.onepeas.module.account.VideoService videoService;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState viewStates$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState editUserState$delegate = null;
    private final kotlinx.coroutines.channels.Channel<pub.gll.onepeas.module.account.mine.UserViewEvent> _viewEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<pub.gll.onepeas.module.account.mine.UserViewEvent> viewEvents = null;
    
    @javax.inject.Inject()
    public UserVM(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.account.HttpService service, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.account.VideoService videoService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.libbase.util.UserInfo getViewStates() {
        return null;
    }
    
    private final void setViewStates(pub.gll.onepeas.libbase.util.UserInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.module.account.mine.EditUserState getEditUserState() {
        return null;
    }
    
    private final void setEditUserState(pub.gll.onepeas.module.account.mine.EditUserState p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<pub.gll.onepeas.module.account.mine.UserViewEvent> getViewEvents() {
        return null;
    }
    
    public final void dispatch(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.account.mine.UserViewAction action) {
    }
    
    public final void upload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    private final void userInfo() {
    }
    
    private final void updateUser(java.lang.String head_image) {
    }
}