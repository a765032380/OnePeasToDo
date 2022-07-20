package pub.gll.onepeas.todo.web.download

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.LaunchedEffect
import com.google.android.exoplayer2.MediaItem
import com.imherrera.videoplayer.VideoPlayer
import com.imherrera.videoplayer.VideoPlayerControl
import com.imherrera.videoplayer.rememberVideoPlayerState
import pub.gll.onepeas.libbase.activity.BaseActivity

class M3U8PlayActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val url = intent.getStringExtra("url")
        url?.let {
            setContent {
                val playerState = rememberVideoPlayerState()

                VideoPlayer(playerState = playerState) {
                    VideoPlayerControl(
                        state = playerState,
                        title = "",
                    )
                }

                LaunchedEffect(Unit) {
//                    val s = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"
                    val s = url.replace(".m3u8",".mp4")
                    playerState.player.setMediaItem(MediaItem.fromUri(Uri.parse(s)))
                    playerState.player.prepare()
                    playerState.player.playWhenReady = true
                }
            }
        }
    }
}