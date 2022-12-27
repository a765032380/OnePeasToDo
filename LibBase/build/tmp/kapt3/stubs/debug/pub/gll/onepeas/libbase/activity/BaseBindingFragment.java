package pub.gll.onepeas.libbase.activity;

import java.lang.System;

/**
 * 自动完成ViewBinding的基类
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lpub/gll/onepeas/libbase/activity/BaseBindingFragment;", "T", "Landroidx/viewbinding/ViewBinding;", "Lpub/gll/onepeas/libbase/activity/BaseFragment;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "lifecycleObserver", "Landroidx/lifecycle/LifecycleObserver;", "getLifecycleObserver", "()Landroidx/lifecycle/LifecycleObserver;", "setLifecycleObserver", "(Landroidx/lifecycle/LifecycleObserver;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "LibBase_debug"})
public abstract class BaseBindingFragment<T extends androidx.viewbinding.ViewBinding> extends pub.gll.onepeas.libbase.activity.BaseFragment {
    private T _binding;
    @javax.inject.Inject()
    public androidx.lifecycle.LifecycleObserver lifecycleObserver;
    
    public BaseBindingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final T getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LifecycleObserver getLifecycleObserver() {
        return null;
    }
    
    public final void setLifecycleObserver(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleObserver p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
}