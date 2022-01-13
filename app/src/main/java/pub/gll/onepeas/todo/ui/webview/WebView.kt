package pub.gll.onepeas.todo.ui.webview

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import pub.gll.onepeas.todo.R
import pub.gll.onepeas.todo.bean.WebData
import pub.gll.onepeas.todo.ui.theme.ToolBarHeight
import pub.gll.onepeas.todo.ui.widgets.AppToolsBar
import pub.gll.onepeas.todo.util.RouteUtils.back

@SuppressLint("UseCompatLoadingForDrawables")
@Composable
fun WebViewPage(
    webData: WebData,
    navCtrl: NavHostController
) {
    var ctrl: WebViewCtrl? by remember { mutableStateOf(null) }
    Box {
        var isRefreshing: Boolean by remember { mutableStateOf(false) }
        val refreshState = rememberSwipeRefreshState(isRefreshing)
        AndroidView(
            modifier = Modifier
                .padding(top = ToolBarHeight)
                .fillMaxSize(),
            factory = { context ->
                FrameLayout(context).apply {
                    layoutParams = FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT
                    )
                    val progressView = ProgressBar(context).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            2
                        )
                        progressDrawable =
                            context.resources.getDrawable(R.drawable.horizontal_progressbar)
                        indeterminateTintList =
                            ColorStateList.valueOf(context.resources.getColor(R.color.teal_200))
                    }
                    val webView = WebView(context).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
                        )
                    }
                    addView(webView)
                    addView(progressView)
                    ctrl = WebViewCtrl(this, webData.url, onWebCall = { isFinish ->
                        isRefreshing = !isFinish
                    })
                    ctrl?.initSettings()
                }

            },
            update = {

            }
        )

        AppToolsBar(title = webData.title ?: "标题", onBack = {
            ctrl?.onDestroy()
            navCtrl.back()
        })
    }
}