package pub.gll.onepeas.todo.web.video

import android.util.Log
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.drag
import androidx.compose.foundation.gestures.forEachGesture
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.interaction.Interaction
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import pub.gll.onepeas.todo.R
import pub.gll.onepeas.todo.web.video.icons.*
import pub.gll.onepeas.todo.web.video.icons.Forward10
import pub.gll.onepeas.todo.web.video.icons.Fullscreen
import pub.gll.onepeas.todo.web.video.icons.FullscreenExit
import pub.gll.onepeas.todo.web.video.icons.MoreVert
import kotlin.math.roundToLong
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun VideoPlayerControl(
    state: VideoPlayerState,
    title: String,
    subtitle: String? = null,
    background: Color = Color.Black.copy(0.30f),
    contentColor: Color = Color.White,
    onOptionsClick: (() -> Unit)? = null,
    onBackClick: (() -> Unit)? = null,
) {

    var speed by remember { mutableStateOf(state.player.playbackParameters.speed) }
    CompositionLocalProvider(LocalContentColor provides contentColor) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(background)
                .padding(16.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            ControlHeader(
                modifier = Modifier.fillMaxWidth(),
                title = title,
                subtitle = subtitle,
                onBackClick  = onBackClick,
                onOptionsClick = onOptionsClick
            )
            PlaybackControl(
                isPlaying = state.isPlaying.value,
                control = state.control
            )
            TimelineControl(
                modifier = Modifier.fillMaxWidth(),
                isFullScreen = state.isFullscreen.value,
                videoDurationMs = state.videoDurationMs.value,
                videoPositionMs = state.videoPositionMs.value,
                speed = speed,
                control = state.control,
                onFullScreenToggle = {state.control.setFullscreen(!state.isFullscreen.value)},
                onProgress = { state.control.seekTo(it.roundToLong()) },
            )
        }
    }
}

@Composable
private fun ControlHeader(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String?,
    onBackClick: (() -> Unit)?,
    onOptionsClick: (() -> Unit)?,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (onBackClick != null) {
            AdaptiveIconButton(
                modifier = Modifier.size(SmallIconButtonSize),
                onClick = {onBackClick()}
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                    contentDescription = ""
                )
            }
        }
        Column(verticalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = title,
                color = LocalContentColor.current,
                style = MaterialTheme.typography.subtitle1,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            if (subtitle != null) {
                Text(
                    text = subtitle,
                    color = LocalContentColor.current.copy(0.80f),
                    style = MaterialTheme.typography.body1,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        if (onOptionsClick != null) {
            AdaptiveIconButton(
                modifier = Modifier.size(SmallIconButtonSize),
                onClick = onOptionsClick
            ) {
                Icon(
                    imageVector = Icons.Rounded.MoreVert,
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
private fun PlaybackControl(
    modifier: Modifier = Modifier,
    isPlaying: Boolean,
    control: VideoPlayerControl
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
//        IconButton(
//            modifier = Modifier
//                .size(BigIconButtonSize)
//                .padding(10.dp),
//            onClick = control::rewind
//        ) {
//            Icon(
//                modifier = Modifier.fillMaxSize(),
//                imageVector = Icons.Rounded.Replay10,
//                contentDescription = null
//            )
//        }
        IconButton(
            modifier = Modifier.size(BigIconButtonSize),
            onClick = {
                if (isPlaying) control.pause() else control.play()
            }
        ) {
            Icon(
                modifier = Modifier.fillMaxSize(),
                imageVector = if (isPlaying) Icons.Rounded.Pause else Icons.Rounded.PlayArrow,
                contentDescription = null
            )
        }
//        IconButton(
//            modifier = Modifier
//                .size(BigIconButtonSize)
//                .padding(10.dp),
//            onClick = control::forward
//        ) {
//            Icon(
//                modifier = Modifier.fillMaxSize(),
//                imageVector = Icons.Rounded.Forward10,
//                contentDescription = null
//            )
//        }
    }
}

@Composable
private fun TimelineControl(
    modifier: Modifier,
    isFullScreen: Boolean,
    videoDurationMs: Long,
    videoPositionMs: Long,
    speed: Float,
    control: VideoPlayerControl,
    onFullScreenToggle: () -> Unit,
    onProgress: (progress:Float) -> Unit,
) {
    // videoDurationMs 总时长
    // videoPositionMs 已播放时长
    val timestamp = remember(videoDurationMs, videoPositionMs.milliseconds.inWholeSeconds) {
        prettyVideoTimestamp(videoDurationMs.milliseconds, videoPositionMs.milliseconds)
    }

    var text by remember { mutableStateOf(speed) }

    Column(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = timestamp)
            Spacer(modifier = Modifier.weight(1.0f))

            NiaDropdownMenuButton(
                modifier = Modifier.size(BigIconButtonSize),
                items = listOf(1.0f, 1.25f, 1.5f, 2f),
                onItemClick = {
                    text = it
                    control.speed(text)
                },
                text = "x$text",
                itemText = { item ->
                    Text("$item",
                        color=Color.White
                    )
                }
            )
            AdaptiveIconButton(
                modifier = Modifier.size(SmallIconButtonSize),
                onClick = onFullScreenToggle
            ) {
                Icon(
                    imageVector = if (isFullScreen) Icons.Rounded.FullscreenExit else Icons.Rounded.Fullscreen,
                    contentDescription = null
                )
            }
        }
        Slider(
            value = videoPositionMs.toFloat(),
            valueRange = 0f..videoDurationMs.toFloat(),
            colors = SliderDefaults.colors(
                thumbColor = Color.White, // 圆圈的颜色
                activeTrackColor = Color(0xFF0079D3)
            ),
            onValueChange = {
                onProgress(it)
            },
        )
    }
}


/**
 * Allow the button to be any size instead of constraining it to 48dp
 * **/
@Composable
private fun AdaptiveIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable(
                onClick = onClick,
                enabled = enabled,
                interactionSource = interactionSource,
                indication = LocalIndication.current
            ),
        contentAlignment = Alignment.Center
    ) {
        val contentAlpha = if (enabled) LocalContentAlpha.current else ContentAlpha.disabled
        CompositionLocalProvider(LocalContentAlpha provides contentAlpha, content = content)
    }
}
val BigIconButtonSize = 52.dp
val SmallIconButtonSize = 32.dp


