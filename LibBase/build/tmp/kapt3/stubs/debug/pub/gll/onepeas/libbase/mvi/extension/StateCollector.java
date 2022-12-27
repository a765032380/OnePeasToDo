package pub.gll.onepeas.libbase.mvi.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ4\u0010\u000b\u001a\u00020\f\"\u0004\b\u0001\u0010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\r0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\f0\u0011JT\u0010\u000b\u001a\u00020\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\r0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00120\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\f0\u0014Jt\u0010\u000b\u001a\u00020\f\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0012\"\u0004\b\u0003\u0010\u00152\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\r0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00120\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00150\u000f2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u00020\f0\u0017R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lpub/gll/onepeas/libbase/mvi/extension/StateCollector;", "T", "Lpub/gll/onepeas/libbase/mvi/UiState;", "", "flow", "Lkotlinx/coroutines/flow/Flow;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "state", "Landroidx/lifecycle/Lifecycle$State;", "(Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "collectPartial", "", "A", "prop1", "Lkotlin/reflect/KProperty1;", "action", "Lkotlin/Function1;", "B", "prop2", "Lkotlin/Function2;", "C", "prop3", "Lkotlin/Function3;", "LibBase_debug"})
public final class StateCollector<T extends pub.gll.onepeas.libbase.mvi.UiState> {
    private final kotlinx.coroutines.flow.Flow<T> flow = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    private final androidx.lifecycle.Lifecycle.State state = null;
    
    public StateCollector(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> flow, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle.State state) {
        super();
    }
    
    public final <A extends java.lang.Object>void collectPartial(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends A> prop1, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, kotlin.Unit> action) {
    }
    
    public final <A extends java.lang.Object, B extends java.lang.Object>void collectPartial(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends A> prop1, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends B> prop2, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super B, kotlin.Unit> action) {
    }
    
    public final <A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object>void collectPartial(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends A> prop1, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends B> prop2, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends C> prop3, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super A, ? super B, ? super C, kotlin.Unit> action) {
    }
}