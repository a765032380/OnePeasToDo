package pub.gll.onepeas.libbase.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u001a]\u0010\u0007\u001a\u00020\u0001\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012\u00a2\u0006\u0002\b\u0014H\u0007\u00a8\u0006\u0015"}, d2 = {"ErrorContent", "", "retry", "Lkotlin/Function0;", "ErrorItem", "LoadingItem", "NoMoreItem", "RefreshList", "T", "", "lazyPagingItems", "Landroidx/paging/compose/LazyPagingItems;", "isRefreshing", "", "onRefresh", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "itemContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "LibBase_debug"})
public final class RefreshListKt {
    
    @androidx.compose.runtime.Composable()
    public static final <T extends java.lang.Object>void RefreshList(@org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<T> lazyPagingItems, boolean isRefreshing, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListState listState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> itemContent) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ErrorContent(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ErrorItem(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> retry) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void NoMoreItem() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void LoadingItem() {
    }
}