package pub.gll.onepeas.libbase.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00060\u0005B\u0015\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lpub/gll/onepeas/libbase/mvi/ContainerLazy;", "STATE", "Lpub/gll/onepeas/libbase/mvi/UiState;", "SINGLE_EVENT", "Lpub/gll/onepeas/libbase/mvi/UiEvent;", "Lkotlin/Lazy;", "Lpub/gll/onepeas/libbase/mvi/MutableContainer;", "initialState", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lpub/gll/onepeas/libbase/mvi/UiState;Lkotlinx/coroutines/CoroutineScope;)V", "cached", "value", "getValue", "()Lpub/gll/onepeas/libbase/mvi/MutableContainer;", "isInitialized", "", "LibBase_debug"})
public final class ContainerLazy<STATE extends pub.gll.onepeas.libbase.mvi.UiState, SINGLE_EVENT extends pub.gll.onepeas.libbase.mvi.UiEvent> implements kotlin.Lazy<pub.gll.onepeas.libbase.mvi.MutableContainer<STATE, SINGLE_EVENT>> {
    private pub.gll.onepeas.libbase.mvi.MutableContainer<STATE, SINGLE_EVENT> cached;
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.onepeas.libbase.mvi.MutableContainer<STATE, SINGLE_EVENT> value = null;
    
    public ContainerLazy(@org.jetbrains.annotations.NotNull()
    STATE initialState, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope parentScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public pub.gll.onepeas.libbase.mvi.MutableContainer<STATE, SINGLE_EVENT> getValue() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isInitialized() {
        return false;
    }
}