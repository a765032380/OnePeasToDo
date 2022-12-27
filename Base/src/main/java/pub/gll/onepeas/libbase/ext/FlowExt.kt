package pub.gll.onepeas.libbase.ext

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import pub.gll.onepeas.libbase.mvi.UiEvent
import pub.gll.onepeas.libbase.mvi.UiState
import pub.gll.onepeas.libbase.mvi.internal.StateTuple2
import pub.gll.onepeas.libbase.mvi.internal.StateTuple3
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.reflect.KProperty1

/**
 * 转成[SharedFlow]，同时只在有订阅者时发送数据，且不重复之前发过的数据（即一次性，不包含过去状态）
 */
fun <T> Flow<T>.shareWhileObserved(coroutineScope: CoroutineScope) = shareIn(
    scope = coroutineScope,
    started = SharingStarted.WhileSubscribed(),
    replay = 0
)

/**
 * 转变成不可变流
 */
fun <T> MutableStateFlow<T>.immutable(): StateFlow<T> {
    return this
}

/**
 * 转变成不可变流
 */
fun <T> MutableSharedFlow<T>.immutable(): SharedFlow<T> {
    return this
}


@Composable
fun <T> Flow<T>.collectAsEffect(
    context: CoroutineContext = EmptyCoroutineContext,
    block: (T) -> Unit
) {
    LaunchedEffect(Unit) {
        onEach(block).flowOn(context).launchIn(this)
    }
}
fun <T : UiState> Flow<T>.collectState(
    lifecycleOwner: LifecycleOwner,
    state: Lifecycle.State = Lifecycle.State.STARTED,
    action: StateCollector<T>.() -> Unit
) {
    StateCollector(this@collectState, lifecycleOwner, state).action()
}

fun <T : UiEvent> Flow<T>.collectSingleEvent(
    lifecycleOwner: LifecycleOwner,
    state: Lifecycle.State = Lifecycle.State.STARTED,
    action: (T) -> Unit
) {
    lifecycleOwner.lifecycleScope.launch {
        lifecycleOwner.repeatOnLifecycle(state) {
            this@collectSingleEvent.collect {
                action(it)
            }
        }
    }
}

class StateCollector<T : UiState>(
    private val flow: Flow<T>,
    private val lifecycleOwner: LifecycleOwner,
    private val state: Lifecycle.State,
) {

    fun <A> collectPartial(
        prop1: KProperty1<T, A>,
        action: (A) -> Unit
    ) {
        flow.collectPartial(lifecycleOwner, prop1, state, action)
    }

    fun <A, B> collectPartial(
        prop1: KProperty1<T, A>,
        prop2: KProperty1<T, B>,
        action: (A, B) -> Unit
    ) {
        flow.collectPartial(lifecycleOwner, prop1, prop2, state, action)
    }

    fun <A, B, C> collectPartial(
        prop1: KProperty1<T, A>,
        prop2: KProperty1<T, B>,
        prop3: KProperty1<T, C>,
        action: (A, B, C) -> Unit
    ) {
        flow.collectPartial(lifecycleOwner, prop1, prop2, prop3, state, action)
    }

}

internal fun <T : UiState, A> Flow<T>.collectPartial(
    lifecycleOwner: LifecycleOwner,
    prop1: KProperty1<T, A>,
    state: Lifecycle.State,
    action: (A) -> Unit
) {
    lifecycleOwner.lifecycleScope.launch {
        lifecycleOwner.repeatOnLifecycle(state) {
            this@collectPartial
                .map { prop1.get(it) }
                .distinctUntilChanged()
                .collect { partialState ->
                    action(partialState)
                }
        }
    }
}

internal fun <T : UiState, A, B> Flow<T>.collectPartial(
    lifecycleOwner: LifecycleOwner,
    prop1: KProperty1<T, A>,
    prop2: KProperty1<T, B>,
    state: Lifecycle.State = Lifecycle.State.STARTED,
    action: (A, B) -> Unit
) {
    lifecycleOwner.lifecycleScope.launch {
        lifecycleOwner.repeatOnLifecycle(state) {
            this@collectPartial
                .map { StateTuple2(prop1.get(it), prop2.get(it)) }
                .distinctUntilChanged()
                .collect { (partialStateA, partialStateB) ->
                    action(partialStateA, partialStateB)
                }
        }
    }
}

internal fun <T : UiState, A, B, C> Flow<T>.collectPartial(
    lifecycleOwner: LifecycleOwner,
    prop1: KProperty1<T, A>,
    prop2: KProperty1<T, B>,
    prop3: KProperty1<T, C>,
    state: Lifecycle.State = Lifecycle.State.STARTED,
    action: (A, B, C) -> Unit
) {
    lifecycleOwner.lifecycleScope.launch {
        lifecycleOwner.repeatOnLifecycle(state) {
            this@collectPartial
                .map { StateTuple3(prop1.get(it), prop2.get(it), prop3.get(it)) }
                .distinctUntilChanged()
                .collect { (partialStateA, partialStateB, partialStateC) ->
                    action(partialStateA, partialStateB, partialStateC)
                }
        }
    }
}


