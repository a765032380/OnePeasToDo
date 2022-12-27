package pub.gll.onepeas.libbase.mvi;

import java.lang.System;

/**
 * 状态容器，分别存储UI状态和单次事件，如果不包含单次事件，则使用[Nothing]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lpub/gll/onepeas/libbase/mvi/Container;", "STATE", "Lpub/gll/onepeas/libbase/mvi/UiState;", "SINGLE_EVENT", "Lpub/gll/onepeas/libbase/mvi/UiEvent;", "", "singleEventFlow", "Lkotlinx/coroutines/flow/Flow;", "getSingleEventFlow", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "LibBase_debug"})
public abstract interface Container<STATE extends pub.gll.onepeas.libbase.mvi.UiState, SINGLE_EVENT extends pub.gll.onepeas.libbase.mvi.UiEvent> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.StateFlow<STATE> getUiStateFlow();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<SINGLE_EVENT> getSingleEventFlow();
}