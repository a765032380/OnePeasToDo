package pub.gll.onepeas.todo.web.download

import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.PlaybackParameters
import pub.gll.onepeas.libbase.activity.BaseActivity
import pub.gll.onepeas.todo.web.video.*

class M3U8PlayActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)

        val url = intent.getStringExtra("url")
        url?.let {
            setContent {
                ProvideWindowInsets {
                    val playerState = rememberVideoPlayerState()

                    val callback = remember {
                        object : OnBackPressedCallback(true) {
                            override fun handleOnBackPressed() {
                                if(playerState.isFullscreen.value){
                                    playerState.control.setFullscreen(!playerState.isFullscreen.value)
                                }else{
                                    finish()
                                }
                            }
                        }
                    }
                    val dispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
                    DisposableEffect(key1 = Unit, effect = {
                        dispatcher?.addCallback(callback)
                        onDispose {
                            callback.remove()
                        }
                    })
                    var text by remember { mutableStateOf("x1.0") }
                    if(playerState.isFullscreen.value){
                        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                    }else{
                        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                    }
                    VideoPlayer(
                        modifier = Modifier
                            .background(Color.Black)
                            .statusBarsPadding()
                            .adaptiveSize(playerState.isFullscreen.value, LocalView.current),
                        playerState = playerState,
                    ) {
                        VideoPlayerControl(
                            state = playerState,
                            title = "",
                            onOptionsClick = {

                            },
                            onBackClick = {
                                if(playerState.isFullscreen.value){
                                    playerState.control.setFullscreen(!playerState.isFullscreen.value)
                                }else{
                                    onBackPressed()
                                }
                            }
                        ){
                            NiaDropdownMenuButton(
                                modifier = Modifier.size(BigIconButtonSize),
                                items = listOf("x1.0", "x1.25", "x1.5", "x2"),
                                onItemClick = {
                                    text = it
                                    val playbackParameters = PlaybackParameters(text.replace("x","").toFloat())
                                    playerState.player.playbackParameters = playbackParameters
                                },
                                text = text,
                                itemText = { item ->
                                    androidx.compose.material.Text(item,
                                        color=Color.White
                                    )
                                }
                            )
                        }
                    }

                    LaunchedEffect(Unit) {
                        val s = url.replace(".m3u8",".mp4")
                        playerState.player.setMediaItem(MediaItem.fromUri(Uri.parse(s)))
                        playerState.player.prepare()
                        playerState.player.playWhenReady = true
                    }
                }
            }
        }
    }
}

private fun Modifier.adaptiveSize(fullscreen: Boolean, view: View): Modifier {
    return if (fullscreen) {
        hideSystemBars(view)
        fillMaxSize()
    } else {
        showSystemBars(view)
        fillMaxWidth().height(250.dp)
    }
}


private fun hideSystemBars(view: View) {
    val windowInsetsController = ViewCompat.getWindowInsetsController(view) ?: return
    // Configure the behavior of the hidden system bars
    windowInsetsController.systemBarsBehavior =
        WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    // Hide both the status bar and the navigation bar
    windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
}

private fun showSystemBars(view: View) {
    val windowInsetsController = ViewCompat.getWindowInsetsController(view) ?: return
    // Show both the status bar and the navigation bar
    windowInsetsController.show(WindowInsetsCompat.Type.systemBars())
}