package pub.gll.onepeas.module.cookbook;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a;\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a7\u0010\u000e\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00072#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\tH\u0007\u00a8\u0006\u000f"}, d2 = {"CookBookHome", "", "homeViewModel", "Lpub/gll/onepeas/module/cookbook/vm/CookbookVM;", "Greeting", "data", "Landroidx/paging/compose/LazyPagingItems;", "Lpub/gll/onepeas/module/cookbook/model/CookbookItemModel;", "goImagePreview", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "icon", "Message", "ModuleCookbook_debug"})
public final class CookBookHomeKt {
    
    @androidx.compose.runtime.Composable()
    public static final void CookBookHome(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.cookbook.vm.CookbookVM homeViewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Greeting(@org.jetbrains.annotations.NotNull()
    androidx.paging.compose.LazyPagingItems<pub.gll.onepeas.module.cookbook.model.CookbookItemModel> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> goImagePreview) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {coil.annotation.ExperimentalCoilApi.class})
    public static final void Message(@org.jetbrains.annotations.Nullable()
    pub.gll.onepeas.module.cookbook.model.CookbookItemModel data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> goImagePreview) {
    }
}