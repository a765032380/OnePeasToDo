package pub.gll.onepeas.libbase.activity;

import java.lang.System;

/**
 * 自动完成ViewBinding的基类
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lpub/gll/onepeas/libbase/activity/BaseBindingActivity;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroidx/activity/ComponentActivity;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "beforeSetContentView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "LibBase_debug"})
public abstract class BaseBindingActivity<T extends androidx.viewbinding.ViewBinding> extends androidx.activity.ComponentActivity {
    private T _binding;
    
    public BaseBindingActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final T getBinding() {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected void beforeSetContentView() {
    }
}