package pub.gll.onepeas.modulesample.state.todo.four;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lpub/gll/onepeas/modulesample/state/todo/four/TodoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentEditItem", "Lpub/gll/onepeas/modulesample/state/todo/TodoItem;", "getCurrentEditItem", "()Lpub/gll/onepeas/modulesample/state/todo/TodoItem;", "<set-?>", "", "currentEditPosition", "getCurrentEditPosition", "()I", "setCurrentEditPosition", "(I)V", "currentEditPosition$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "todoItems", "getTodoItems", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "addItem", "", "item", "onEditDone", "onEditItemChange", "onEditItemSelected", "removeItem", "ModuleSample_debug"})
public final class TodoViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.compose.runtime.MutableState currentEditPosition$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.compose.runtime.snapshots.SnapshotStateList<pub.gll.onepeas.modulesample.state.todo.TodoItem> todoItems;
    
    public TodoViewModel() {
        super();
    }
    
    private final int getCurrentEditPosition() {
        return 0;
    }
    
    private final void setCurrentEditPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.snapshots.SnapshotStateList<pub.gll.onepeas.modulesample.state.todo.TodoItem> getTodoItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final pub.gll.onepeas.modulesample.state.todo.TodoItem getCurrentEditItem() {
        return null;
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.modulesample.state.todo.TodoItem item) {
    }
    
    public final void removeItem(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.modulesample.state.todo.TodoItem item) {
    }
    
    public final void onEditItemSelected(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.modulesample.state.todo.TodoItem item) {
    }
    
    public final void onEditDone() {
    }
    
    public final void onEditItemChange(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.modulesample.state.todo.TodoItem item) {
    }
}