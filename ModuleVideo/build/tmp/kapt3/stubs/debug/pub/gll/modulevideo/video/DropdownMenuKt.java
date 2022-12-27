package pub.gll.modulevideo.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u00df\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00042&\u0010\u000f\u001a\"\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n\u00a2\u0006\u0002\b\u00102*\b\u0002\u0010\u0011\u001a$\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u00a2\u0006\u0002\b\u00102*\b\u0002\u0010\u0012\u001a$\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u00a2\u0006\u0002\b\u0010H\u0007\u001a\u00db\u0001\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u00042&\u0010\u000f\u001a\"\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n\u00a2\u0006\u0002\b\u00102*\b\u0002\u0010\u0011\u001a$\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u00a2\u0006\u0002\b\u00102*\b\u0002\u0010\u0012\u001a$\u0012\u0013\u0012\u0011H\u0002\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u00a2\u0006\u0002\b\u0010H\u0007\u00a8\u0006\u0018"}, d2 = {"NiaDropdownMenu", "", "T", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "items", "", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "dismissOnItemClick", "itemText", "Landroidx/compose/runtime/Composable;", "itemLeadingIcon", "itemTrailingIcon", "NiaDropdownMenuButton", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "ModuleVideo_debug"})
public final class DropdownMenuKt {
    
    /**
     * Now in Android dropdown menu button with included trailing icon as well as text label and item
     * content slots.
     *
     * @param items The list of items to display in the menu.
     * @param onItemClick Called when the user clicks on a menu item.
     * @param modifier Modifier to be applied to the button.
     * @param enabled Controls the enabled state of the button. When `false`, this button will not be
     * clickable and will appear disabled to accessibility services.
     * @param dismissOnItemClick Whether the menu should be dismissed when an item is clicked.
     * @param itemText The text label content for a given item.
     * @param itemLeadingIcon The leading icon content for a given item.
     * @param itemTrailingIcon The trailing icon content for a given item.
     */
    @androidx.compose.runtime.Composable()
    public static final <T extends java.lang.Object>void NiaDropdownMenuButton(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.lang.String text, boolean dismissOnItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> itemText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> itemLeadingIcon, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> itemTrailingIcon) {
    }
    
    /**
     * Now in Android dropdown menu with item content slots. Wraps Material 3 [DropdownMenu] and
     * [DropdownMenuItem].
     *
     * @param expanded Whether the menu is currently open and visible to the user.
     * @param onDismissRequest Called when the user requests to dismiss the menu, such as by
     * tapping outside the menu's bounds.
     * @param items The list of items to display in the menu.
     * @param onItemClick Called when the user clicks on a menu item.
     * @param dismissOnItemClick Whether the menu should be dismissed when an item is clicked.
     * @param itemText The text label content for a given item.
     * @param itemLeadingIcon The leading icon content for a given item.
     * @param itemTrailingIcon The trailing icon content for a given item.
     */
    @androidx.compose.runtime.Composable()
    public static final <T extends java.lang.Object>void NiaDropdownMenu(boolean expanded, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onItemClick, boolean dismissOnItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> itemText, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> itemLeadingIcon, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> itemTrailingIcon) {
    }
}