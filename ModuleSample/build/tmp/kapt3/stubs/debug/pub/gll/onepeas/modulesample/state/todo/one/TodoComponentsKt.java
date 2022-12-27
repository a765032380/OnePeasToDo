package pub.gll.onepeas.modulesample.state.todo.one;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a.\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u001c\u0010\r\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\b\u0010\u0010\u001a\u00020\u0001H\u0007\u00a8\u0006\u0011"}, d2 = {"TodoEditButton", "", "onClick", "Lkotlin/Function0;", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "TodoInputText", "onTextChange", "Lkotlin/Function1;", "TodoItemInput", "onItemComplete", "Lpub/gll/onepeas/modulesample/state/todo/TodoItem;", "TodoItemInputPreview", "ModuleSample_debug"})
public final class TodoComponentsKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TodoInputText(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChange, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TodoEditButton(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TodoItemInput(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super pub.gll.onepeas.modulesample.state.todo.TodoItem, kotlin.Unit> onItemComplete) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void TodoItemInputPreview() {
    }
}