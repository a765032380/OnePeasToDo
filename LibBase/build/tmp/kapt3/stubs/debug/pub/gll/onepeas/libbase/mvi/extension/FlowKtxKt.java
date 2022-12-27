package pub.gll.onepeas.libbase.mvi.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aZ\u0010\b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\t\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0000\u001a|\u0010\b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00120\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00010\u0014H\u0000\u001a\u009c\u0001\u0010\b\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u0012\"\u0004\b\u0003\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00120\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u00020\u00010\u0017H\u0000\u001a@\u0010\u0018\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0019*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007\u001aK\u0010\u001a\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\t*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001d\u0010\u0011\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\u001c\u00a8\u0006\u001d"}, d2 = {"collectAsEffect", "", "T", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function1;", "collectPartial", "Lpub/gll/onepeas/libbase/mvi/UiState;", "A", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "prop1", "Lkotlin/reflect/KProperty1;", "state", "Landroidx/lifecycle/Lifecycle$State;", "action", "B", "prop2", "Lkotlin/Function2;", "C", "prop3", "Lkotlin/Function3;", "collectSingleEvent", "Lpub/gll/onepeas/libbase/mvi/UiEvent;", "collectState", "Lpub/gll/onepeas/libbase/mvi/extension/StateCollector;", "Lkotlin/ExtensionFunctionType;", "LibBase_debug"})
public final class FlowKtxKt {
    
    @androidx.compose.runtime.Composable()
    public static final <T extends java.lang.Object>void collectAsEffect(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$collectAsEffect, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
    }
    
    public static final <T extends pub.gll.onepeas.libbase.mvi.UiState>void collectState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$collectState, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle.State state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super pub.gll.onepeas.libbase.mvi.extension.StateCollector<T>, kotlin.Unit> action) {
    }
    
    public static final <T extends pub.gll.onepeas.libbase.mvi.UiEvent>void collectSingleEvent(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$collectSingleEvent, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle.State state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    public static final <T extends pub.gll.onepeas.libbase.mvi.UiState, A extends java.lang.Object>void collectPartial(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$collectPartial, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends A> prop1, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle.State state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super A, kotlin.Unit> action) {
    }
    
    public static final <T extends pub.gll.onepeas.libbase.mvi.UiState, A extends java.lang.Object, B extends java.lang.Object>void collectPartial(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$collectPartial, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends A> prop1, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends B> prop2, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle.State state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super A, ? super B, kotlin.Unit> action) {
    }
    
    public static final <T extends pub.gll.onepeas.libbase.mvi.UiState, A extends java.lang.Object, B extends java.lang.Object, C extends java.lang.Object>void collectPartial(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$collectPartial, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends A> prop1, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends B> prop2, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty1<T, ? extends C> prop3, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Lifecycle.State state, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super A, ? super B, ? super C, kotlin.Unit> action) {
    }
}