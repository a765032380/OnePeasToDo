package pub.gll.onepeas.libbase.mvi.internal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0015\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001c\u00a2\u0006\u0002\b\u001dH\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lpub/gll/onepeas/libbase/mvi/internal/RealContainer;", "STATE", "Lpub/gll/onepeas/libbase/mvi/UiState;", "SINGLE_EVENT", "Lpub/gll/onepeas/libbase/mvi/UiEvent;", "Lpub/gll/onepeas/libbase/mvi/MutableContainer;", "initialState", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lpub/gll/onepeas/libbase/mvi/UiState;Lkotlinx/coroutines/CoroutineScope;)V", "_internalSingleEventSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_internalStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "singleEventFlow", "Lkotlinx/coroutines/flow/Flow;", "getSingleEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "sendEvent", "", "event", "(Lpub/gll/onepeas/libbase/mvi/UiEvent;)V", "updateState", "action", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "LibBase_debug"})
public final class RealContainer<STATE extends pub.gll.onepeas.libbase.mvi.UiState, SINGLE_EVENT extends pub.gll.onepeas.libbase.mvi.UiEvent> implements pub.gll.onepeas.libbase.mvi.MutableContainer<STATE, SINGLE_EVENT> {
    private final kotlinx.coroutines.CoroutineScope parentScope = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<STATE> _internalStateFlow = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<SINGLE_EVENT> _internalSingleEventSharedFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<STATE> uiStateFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<SINGLE_EVENT> singleEventFlow = null;
    
    public RealContainer(@org.jetbrains.annotations.NotNull()
    STATE initialState, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope parentScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.StateFlow<STATE> getUiStateFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<SINGLE_EVENT> getSingleEventFlow() {
        return null;
    }
    
    @java.lang.Override()
    public void updateState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super STATE, ? extends STATE> action) {
    }
    
    @java.lang.Override()
    public void sendEvent(@org.jetbrains.annotations.NotNull()
    SINGLE_EVENT event) {
    }
}