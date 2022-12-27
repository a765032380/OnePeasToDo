package pub.gll.onepeas.libbase.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005\"\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001aH\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aR\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a8\u0006\u0012"}, d2 = {"InfoDialog", "", "title", "", "content", "", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "SampleAlertDialog", "cancelText", "confirmText", "onConfirmClick", "SelectAlertDialog", "primaryButtonText", "secondButtonText", "onPrimaryButtonClick", "onSecondButtonClick", "LibBase_debug"})
public final class DialogKt {
    
    @androidx.compose.runtime.Composable()
    public static final void SampleAlertDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String cancelText, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onConfirmClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SelectAlertDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String primaryButtonText, @org.jetbrains.annotations.NotNull()
    java.lang.String secondButtonText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSecondButtonClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void InfoDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String[] content, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
}