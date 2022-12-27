package pub.gll.onepeas.libbase.widget

import androidx.compose.animation.*
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.roundToInt


@Composable
fun Draggable(){
    val max = 300.dp
    val min = 0.dp
    val (minPx, maxPx) = with(LocalDensity.current) { min.toPx() to max.toPx() }
    val offsetPosition = remember { mutableStateOf(0f) }
    Box(modifier = Modifier
        .size(100.dp)
        .draggable(
            orientation = Orientation.Horizontal,
            state = rememberDraggableState { delta ->
                val newValue = offsetPosition.value + delta
                offsetPosition.value = newValue.coerceIn(minPx, maxPx)
            }
        )
        .background(Color.Black)
    ) {
        Box(
            Modifier.offset { IntOffset(offsetPosition.value.roundToInt(), 0) }
                .size(50.dp)
                .background(Color.Red)
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Swipeable(){
    val width = 350.dp
    val squareSize = 50.dp

    val swipeableState = rememberSwipeableState("A")
    val sizePx = with(LocalDensity.current) { (width - squareSize).toPx() }
    val anchors = mapOf(0f to "A", sizePx / 2 to "B", sizePx to "C")

    Box(
        modifier = Modifier
            .width(width)
            .swipeable(
                state = swipeableState,
                anchors = anchors,
                thresholds = { _, _ -> FractionalThreshold(0.5f) },
                orientation = Orientation.Horizontal
            )
            .background(Color.Black)
    ) {
        Box(
            Modifier
                .offset { IntOffset(swipeableState.offset.value.roundToInt(), 0) }
                .size(squareSize)
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {
            Text(swipeableState.currentValue, color = Color.White, fontSize = 24.sp)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AnimateItemPlacement(){
    var list by remember { mutableStateOf(listOf("A", "B", "C","D","E","F")) }
    LazyColumn {
        item {
            Button(onClick = { list = list.shuffled() }) {
                Text("Shuffle")
            }
        }
        items(list, key = { it }) {
            Text("Item $it", Modifier.animateItemPlacement())
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimatedVisibilityScope.Item(
    modifier: Modifier,
    backgroundColor: Color
) {
    // Creates a custom enter/exit animation for scale property.
    val scale by transition.animateFloat(label = "") { enterExitState ->
        // Enter transition will be animating the scale from 0.9f to 1.0f
        // (i.e. PreEnter -> Visible). Exit transition will be from 1.0f to
        // 0.5f (i.e. Visible -> PostExit)
        when (enterExitState) {
            EnterExitState.PreEnter -> 0.9f
            EnterExitState.Visible -> 1.0f
            EnterExitState.PostExit -> 0.5f
        }
    }

    // Since we defined `Item` as an extension function on AnimatedVisibilityScope, we can use
    // the `animateEnterExit` modifier to produce an enter/exit animation for it. This will
    // run simultaneously with the `AnimatedVisibility`'s enter/exit.
    Box(
        modifier.fillMaxWidth().padding(5.dp).animateEnterExit(
            // Slide in from below,
            enter = slideInVertically(initialOffsetY = { it }),
            // No slide on the way out. So the exit animation will be scale (from the custom
            // scale animation defined above) and fade (from AnimatedVisibility)
            exit = ExitTransition.None
        ).graphicsLayer {
            scaleX = scale
            scaleY = scale
        }.clip(RoundedCornerShape(20.dp)).background(backgroundColor).fillMaxSize()
    ) {
        // Content of the item goes here...
    }
}

@Composable
fun AnimateMainContent(mainContentVisible: MutableTransitionState<Boolean>) {
    Box {
        // Use the `MutableTransitionState<Boolean>` to specify whether AnimatedVisibility
        // should be visible. This will also allow AnimatedVisibility animation states to be
        // observed externally.
        AnimatedVisibility(
            visibleState = mainContentVisible,
            modifier = Modifier.fillMaxSize(),
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Box {
                Column(Modifier.fillMaxSize()) {
                    // We have created `Item`s below as extension functions on
                    // AnimatedVisibilityScope in this example. So they can define their own
                    // enter/exit to run alongside the enter/exit defined in AnimatedVisibility.
                    Item(Modifier.weight(1f), backgroundColor = Color(0xffff6f69))
                    Item(Modifier.weight(1f), backgroundColor = Color(0xffffcc5c))
                }
                // This FAB will be simply fading in/out as specified by the AnimatedVisibility
                FloatingActionButton(
                    onClick = {},
                    modifier = Modifier.align(Alignment.BottomEnd).padding(20.dp),
                    backgroundColor = MaterialTheme.colors.primary
                ) { Icon(Icons.Default.Favorite, contentDescription = null) }
            }
        }

        // Here we can get a signal for when the Enter/Exit animation of the content above
        // has finished by inspecting the MutableTransitionState passed to the
        // AnimatedVisibility. This allows sequential animation after the enter/exit.
        AnimatedVisibility(
            // Once the main content is visible (i.e. targetState == true), and no pending
            // animations. We will start another enter animation sequentially.
            visible = mainContentVisible.targetState && mainContentVisible.isIdle,
            modifier = Modifier.align(Alignment.Center),
            enter = expandVertically(),
            exit = fadeOut(animationSpec = tween(50))
        ) {
            Text("Transition Finished")
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun FullScreenNotification(visible: Boolean) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(), exit = fadeOut()
    ) {
        // Fade in/out the background and foreground
        Box(Modifier.fillMaxSize().background(Color(0x88000000))) {
            Box(
                Modifier.align(Alignment.TopStart).animateEnterExit(
                    // Slide in/out the rounded rect
                    enter = slideInVertically(),
                    exit = slideOutVertically()
                ).clip(RoundedCornerShape(10.dp)).requiredHeight(100.dp)
                    .fillMaxWidth().background(Color.White)
            ) {
                // Content of the notification goes here
            }
        }
    }
}