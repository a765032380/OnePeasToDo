package pub.gll.onepeas.libbase.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\f\u00a2\u0006\u0002\b\rH&\u00a8\u0006\u000e"}, d2 = {"Lpub/gll/onepeas/libbase/mvi/MutableContainer;", "STATE", "Lpub/gll/onepeas/libbase/mvi/UiState;", "SINGLE_EVENT", "Lpub/gll/onepeas/libbase/mvi/UiEvent;", "Lpub/gll/onepeas/libbase/mvi/Container;", "sendEvent", "", "event", "(Lpub/gll/onepeas/libbase/mvi/UiEvent;)V", "updateState", "action", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "LibBase_debug"})
public abstract interface MutableContainer<STATE extends pub.gll.onepeas.libbase.mvi.UiState, SINGLE_EVENT extends pub.gll.onepeas.libbase.mvi.UiEvent> extends pub.gll.onepeas.libbase.mvi.Container<STATE, SINGLE_EVENT> {
    
    public abstract void updateState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super STATE, ? extends STATE> action);
    
    public abstract void sendEvent(@org.jetbrains.annotations.NotNull()
    SINGLE_EVENT event);
}