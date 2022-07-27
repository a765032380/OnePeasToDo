package pub.gll.onepeas.modulesample.state.todo.one

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import pub.gll.onepeas.modulesample.state.todo.TodoItem

class TodoViewModel : ViewModel() {
    //todoItems是只读变量，_todoItems是可变变量，只能在TodoViewModel中修改_todoItems
    // state: todoItems
    private var _todoItems = MutableLiveData(listOf<TodoItem>())
    // LiveData中的值是List<TodoItem>
    val todoItems: LiveData<List<TodoItem>> = _todoItems

    // event: addItem
    fun addItem(item: TodoItem) {
        _todoItems.value = _todoItems.value!! + listOf(item)
    }

    // event: removeItem
    fun removeItem(item: TodoItem) {
        _todoItems.value = _todoItems.value!!.toMutableList().also {
            it.remove(item)
        }
    }

}