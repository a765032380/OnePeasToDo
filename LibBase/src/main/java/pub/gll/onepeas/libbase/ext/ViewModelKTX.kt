package pub.gll.onepeas.libcore.ext

import kotlinx.coroutines.flow.MutableStateFlow

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