package pub.gll.onepeas.libui.mvi.extension


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import pub.gll.onepeas.libui.mvi.ContainerLazy
import pub.gll.onepeas.libui.mvi.MutableContainer
import pub.gll.onepeas.libui.mvi.UiEvent
import pub.gll.onepeas.libui.mvi.UiState

/**
 * 构建viewModel的Ui容器，存储Ui状态和一次性事件
 */
fun <STATE : UiState> ViewModel.containers(
    initialState: STATE,
): Lazy<MutableContainer<STATE, UiEvent>> {
    return ContainerLazy(initialState, viewModelScope)
}