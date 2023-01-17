package pub.gll.onepeas.modulesample.state.todo.four;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a.\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a~\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0007\u001a\b\u0010\u0013\u001a\u00020\u0014H\u0002\u00a8\u0006\u0015"}, d2 = {"PreviewTodoScreen", "", "TodoRow", "todo", "Lpub/gll/onepeas/modulesample/state/todo/TodoItem;", "onItemClicked", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "TodoScreen", "items", "", "currentlyEditing", "onAddItem", "onRemoveItem", "onStartEdit", "onEditItemChange", "onEditDone", "Lkotlin/Function0;", "randomTint", "", "ModuleSample_debug"})
public final class TodoScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TodoScreen(@org.jetbrains.annotations.NotNull()
    java.util.List<pub.gll.onepeas.modulesample.state.todo.TodoItem> items, @org.jetbrains.annotations.Nullable()
    pub.gll.onepeas.modulesample.state.todo.TodoItem currentlyEditing, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super pub.gll.onepeas.modulesample.state.todo.TodoItem, kotlin.Unit> onAddItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super pub.gll.onepeas.modulesample.state.todo.TodoItem, kotlin.Unit> onRemoveItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super pub.gll.onepeas.modulesample.state.todo.TodoItem, kotlin.Unit> onStartEdit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super pub.gll.onepeas.modulesample.state.todo.TodoItem, kotlin.Unit> onEditItemChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onEditDone) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TodoRow(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.modulesample.state.todo.TodoItem todo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super pub.gll.onepeas.modulesample.state.todo.TodoItem, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    private static final float randomTint() {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void PreviewTodoScreen() {
    }
}