package pub.gll.modulevideo.video

import android.os.Build
import android.util.Log
import android.view.SurfaceView
import android.view.ViewGroup
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

@JvmInline
value class ResizeMode private constructor(val value: Int) {
    companion object {
        val Fit = ResizeMode(0)
        val FixedWidth = ResizeMode(1)
        val FixedHeight = ResizeMode(2)
        val Fill = ResizeMode(3)
        val Zoom = ResizeMode(4)
    }
}

private fun Modifier.adaptiveLayout(
    aspectRatio: Float,
    resizeMode: ResizeMode = ResizeMode.Fit
) = layout { measurable, constraints ->
    val resizedConstraint = constraints.resizeForVideo(resizeMode, aspectRatio)
    val placeable = measurable.measure(resizedConstraint)
    layout(constraints.maxWidth, constraints.maxHeight) {
        // Center x and y axis relative to the layout
        placeable.placeRelative(
            x = (constraints.maxWidth - resizedConstraint.maxWidth) / 2,
            y = (constraints.maxHeight - resizedConstraint.maxHeight) / 2
        )
    }
}

private fun Modifier.defaultPlayerTapGestures(playerState: VideoPlayerState) = pointerInput(Unit) {
    detectTapGestures(
        onDoubleTap = {
            if (playerState.videoResizeMode.value == ResizeMode.Zoom) {
                playerState.control.setVideoResize(ResizeMode.Fit)
            } else {
                playerState.control.setVideoResize(ResizeMode.Zoom)
            }
        },
        onTap = {
            if (playerState.isControlUiVisible.value) {
                playerState.hideControlUi()
            } else {
                playerState.showControlUi()
            }
        }
    )
}

@Composable
private fun VideoPlayer(
    modifier: Modifier,
    playerState: VideoPlayerState,
    controller: @Composable () -> Unit
) {

    val speed = remember { mutableStateOf(1f) }
    val isLongPress = remember { mutableStateOf(false) }

    Box(modifier = modifier.defaultPlayerTapGestures(playerState)) {
        AndroidView(
            modifier = Modifier
                .adaptiveLayout(
                    aspectRatio = playerState.videoSize.value.aspectRatio(),
                    resizeMode = playerState.videoResizeMode.value
                )
                .pointerInput(Unit) {
                    detectTapGestures(
                        //长按事件
                        onLongPress = {
                            speed.value = playerState.player.playbackParameters.speed
                            isLongPress.value = true
                            playerState.control.speed(3f)
                            Log.e("VideoPlayer", "onLongPress")
                        },
                        //双击事件
                        onDoubleTap = {
                            if (playerState.isPlaying.value) playerState.player.pause() else playerState.player.play()
                            Log.e("VideoPlayer", "onDoubleTap")
                        },
                        //释放事件 this.tryAwaitRelease() 是否等待，这个方法是挂起方法，如果调用该方法，会挂起，等松手的时候才会继续执行
                        onPress = {
                            if (this.tryAwaitRelease()) {
                                if (isLongPress.value) {
                                    isLongPress.value = false
                                    playerState.control.speed(speed.value)
                                    Log.e("VideoPlayer", "onPress=${speed.value}")
                                }
                            }
                        },
                        //单击事件 只要点击就会触发该事件
                        onTap = {
                            if (playerState.isControlUiVisible.value) {
                                playerState.hideControlUi()
                            } else {
                                playerState.showControlUi()
                            }
                            Log.e("VideoPlayer", "onTap")
                        }
                    )
                }
            ,

            factory = { context ->
                SurfaceView(context).apply {
                    layoutParams = ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                    )
                }.also {
                    playerState.player.setVideoSurfaceView(it)
                }
            }
        )

        AnimatedVisibility(
            visible = playerState.isControlUiVisible.value,
            enter = fadeIn(),//淡入动画
            exit = fadeOut()//淡出动画
        ) {
            controller()
        }
    }
}

/**
 * @param playerState state to attach to this composable.
 * @param lifecycleOwner required to manage the ExoPlayer instance.
 * @param controller you can use [VideoPlayerControl] or alternatively implement your own
 * */
@Composable
fun VideoPlayer(
    modifier: Modifier = Modifier,
    playerState: VideoPlayerState,
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
    controller: @Composable () -> Unit,
) {
    VideoPlayer(
        modifier = modifier,
        playerState = playerState,
        controller = controller
    )

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.M) {
                when (event) {
                    Lifecycle.Event.ON_RESUME -> playerState.showControlUi()
                    Lifecycle.Event.ON_STOP -> playerState.player.pause()
                    else -> Unit
                }
            } else {
                when (event) {
                    Lifecycle.Event.ON_START -> playerState.showControlUi()
                    Lifecycle.Event.ON_STOP -> playerState.player.pause()
                    else -> Unit
                }
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
            playerState.player.release()
        }
    }
}