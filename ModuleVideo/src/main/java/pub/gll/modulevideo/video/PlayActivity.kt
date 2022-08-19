package pub.gll.modulevideo.video

import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.alibaba.android.arouter.facade.annotation.Route
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.insets.statusBarsPadding
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.upstream.DefaultDataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource
import com.google.android.exoplayer2.upstream.HttpDataSource
import pub.gll.modulevideo.ext.adaptiveSize
import pub.gll.onepeas.libbase.activity.BaseActivity
import pub.gll.onepeas.libbase.arouter.ARouterPath


@Route(path = ARouterPath.VIDEO_PLAY)
class PlayActivity: BaseActivity() {
    companion object{
        private const val PLAY_ACTIVITY_PARAM_URL = "url"
        fun launch(context: Context, url:String){
            val intent = Intent(context, PlayActivity::class.java)
            intent.putExtra(PLAY_ACTIVITY_PARAM_URL,url)
            context.startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)
        val url = intent.getStringExtra(PLAY_ACTIVITY_PARAM_URL)
        url?.let {
            setContent {
                ProvideWindowInsets {
                    val playerState = rememberVideoPlayerState()
                    //返回按钮拦截
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
                        )
                    }

                    LaunchedEffect(Unit) {
                        val s =  if (url.contains(".m3u8")){
                            url.replace(".m3u8",".mp4")
                        }else{
                            url
                        }
                        var mHttpDataSourceFactory: HttpDataSource.Factory= DefaultHttpDataSource.Factory()
                            .setAllowCrossProtocolRedirects(true)
                        mHttpDataSourceFactory.setDefaultRequestProperties(mapOf("Authorization" to "Basic YWRtaW46YWRtaW4="))
                        val defaultDataSource = DefaultDataSource.Factory(this@PlayActivity, mHttpDataSourceFactory)
                        val progressiveMediaSource = ProgressiveMediaSource.Factory(defaultDataSource).createMediaSource(MediaItem.fromUri(Uri.parse(s)))
                        playerState.player.setMediaSource(progressiveMediaSource)
                        playerState.player.prepare()
                        playerState.player.playWhenReady = true
                    }
                }
            }
        }
    }
}