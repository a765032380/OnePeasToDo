package pub.gll.onepeas.modulesample.rally2.ui.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0003\u001a\b\u0010\f\u001a\u00020\u0006H\u0003\u001a\u0016\u0010\r\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003\u001a\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0003\u001a\u0016\u0010\u0010\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003\u001aG\u0010\u0011\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00160\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00180\nH\u0003\u00f8\u0001\u0000\u001a>\u0010\u0019\u001a\u00020\u00062\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0007\u001a~\u0010\u001c\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00160\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00180\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00142\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\u0002\b H\u0003\u00f8\u0001\u0000\u001a \u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"RallyDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "SHOWN_ITEMS", "", "AccountsCard", "", "onClickSeeAll", "Lkotlin/Function0;", "onAccountClick", "Lkotlin/Function1;", "", "AlertCard", "AlertHeader", "AlertItem", "message", "BillsCard", "OverViewDivider", "T", "data", "", "values", "", "colors", "Landroidx/compose/ui/graphics/Color;", "OverviewBody", "onClickSeeAllAccounts", "onClickSeeAllBills", "OverviewScreenCard", "title", "amount", "row", "Landroidx/compose/runtime/Composable;", "SeeAllButton", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "ModuleSample_debug"})
public final class OverviewScreenKt {
    private static final float RallyDefaultPadding = 0.0F;
    private static final int SHOWN_ITEMS = 3;
    
    @androidx.compose.runtime.Composable()
    public static final void OverviewBody(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickSeeAllAccounts, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClickSeeAllBills, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAccountClick) {
    }
    
    /**
     * The Alerts card within the Rally Overview screen.
     */
    @androidx.compose.runtime.Composable()
    private static final void AlertCard() {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void AlertHeader(kotlin.jvm.functions.Function0<kotlin.Unit> onClickSeeAll) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void AlertItem(java.lang.String message) {
    }
    
    /**
     * Base structure for cards in the Overview screen.
     */
    @androidx.compose.runtime.Composable()
    private static final <T extends java.lang.Object>void OverviewScreenCard(java.lang.String title, float amount, kotlin.jvm.functions.Function0<kotlin.Unit> onClickSeeAll, kotlin.jvm.functions.Function1<? super T, java.lang.Float> values, kotlin.jvm.functions.Function1<? super T, androidx.compose.ui.graphics.Color> colors, java.util.List<? extends T> data, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> row) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final <T extends java.lang.Object>void OverViewDivider(java.util.List<? extends T> data, kotlin.jvm.functions.Function1<? super T, java.lang.Float> values, kotlin.jvm.functions.Function1<? super T, androidx.compose.ui.graphics.Color> colors) {
    }
    
    /**
     * The Accounts card within the Rally Overview screen.
     */
    @androidx.compose.runtime.Composable()
    private static final void AccountsCard(kotlin.jvm.functions.Function0<kotlin.Unit> onClickSeeAll, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAccountClick) {
    }
    
    /**
     * The Bills card within the Rally Overview screen.
     */
    @androidx.compose.runtime.Composable()
    private static final void BillsCard(kotlin.jvm.functions.Function0<kotlin.Unit> onClickSeeAll) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SeeAllButton(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
}