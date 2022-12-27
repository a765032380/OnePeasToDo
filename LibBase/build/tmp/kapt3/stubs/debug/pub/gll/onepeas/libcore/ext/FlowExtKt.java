package pub.gll.onepeas.libcore.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a$\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"immutable", "Lkotlinx/coroutines/flow/SharedFlow;", "T", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "shareWhileObserved", "Lkotlinx/coroutines/flow/Flow;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "LibBase_debug"})
public final class FlowExtKt {
    
    /**
     * 转成[SharedFlow]，同时只在有订阅者时发送数据，且不重复之前发过的数据（即一次性，不包含过去状态）
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.flow.SharedFlow<T> shareWhileObserved(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$shareWhileObserved, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        return null;
    }
    
    /**
     * 转变成不可变流
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.flow.StateFlow<T> immutable(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<T> $this$immutable) {
        return null;
    }
    
    /**
     * 转变成不可变流
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlinx.coroutines.flow.SharedFlow<T> immutable(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableSharedFlow<T> $this$immutable) {
        return null;
    }
}