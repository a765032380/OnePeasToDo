package pub.gll.onepeas.libbase.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a6\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"SNACK_ERROR", "", "SNACK_INFO", "SNACK_SUCCESS", "SNACK_WARN", "AppSnackBar", "", "data", "Landroidx/compose/material/SnackbarData;", "popupSnackBar", "scope", "Lkotlinx/coroutines/CoroutineScope;", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "label", "message", "onDismissCallback", "Lkotlin/Function0;", "LibBase_debug"})
public final class SnackBarKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SNACK_INFO = "";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SNACK_WARN = " ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SNACK_ERROR = "  ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SNACK_SUCCESS = "OK";
    
    @androidx.compose.runtime.Composable()
    public static final void AppSnackBar(@org.jetbrains.annotations.NotNull()
    androidx.compose.material.SnackbarData data) {
    }
    
    public static final void popupSnackBar(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    androidx.compose.material.ScaffoldState scaffoldState, @org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissCallback) {
    }
}