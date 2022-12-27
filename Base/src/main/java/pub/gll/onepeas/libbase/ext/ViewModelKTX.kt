package pub.gll.onepeas.libbase.ext

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import pub.gll.onepeas.libbase.mvi.ContainerLazy
import pub.gll.onepeas.libbase.mvi.MutableContainer
import pub.gll.onepeas.libbase.mvi.UiEvent
import pub.gll.onepeas.libbase.mvi.UiState

fun <STATE : Any> uiStateFlows(
    initialState: STATE,
): Lazy<MutableStateFlow<STATE>> {
    return object : Lazy<MutableStateFlow<STATE>> {

        private var cached: MutableStateFlow<STATE>? = null

        override val value: MutableStateFlow<STATE>
            get() = cached ?: MutableStateFlow(initialState).also {
                cached = it
            }

        override fun isInitialized() = cached != null

    }
}

/**
 * 构建viewModel的Ui容器，存储Ui状态和一次性事件
 */
fun <STATE : UiState> ViewModel.containers(
    initialState: STATE,
): Lazy<MutableContainer<STATE, UiEvent>> {
    return ContainerLazy(initialState, viewModelScope)
}