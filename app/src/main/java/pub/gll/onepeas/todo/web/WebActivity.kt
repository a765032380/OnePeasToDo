package pub.gll.onepeas.todo.web

import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.alibaba.android.arouter.facade.annotation.Route
import com.jeffmony.downloader.VideoDownloadManager
import com.jeffmony.downloader.model.VideoTaskItem
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
import com.tencent.smtt.export.external.interfaces.WebResourceRequest
import com.tencent.smtt.export.external.interfaces.WebResourceResponse
import com.tencent.smtt.sdk.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pub.gll.onepeas.libbase.arouter.ArouterPath
import pub.gll.onepeas.libbase.util.StatusBarUtil
import pub.gll.onepeas.todo.R
import pub.gll.onepeas.todo.web.download.DownloadListActivity


@Route(path = ArouterPath.WEB_ACTIVITY)
class WebActivity : AppCompatActivity() {
    private var mCustomView: View? = null
    private var mCustomViewCallBack: IX5WebChromeClient.CustomViewCallback? = null
    lateinit var mWebView: WebView
    lateinit var mFlVideo: FrameLayout
    lateinit var mBTDownload: Button
    lateinit var mBTDownloadList: Button
    val TAG = "LLLLLLLL"

    private fun startDownload(url:String){
        val item = VideoTaskItem(
            url,
            "",
            "test1",
            "group-1"
        )
        if (item.isInitialTask) {
            VideoDownloadManager.getInstance().startDownload(item)
        } else if (item.isRunningTask) {
            VideoDownloadManager.getInstance().pauseDownloadTask(item.url)
        } else if (item.isInterruptTask) {
            VideoDownloadManager.getInstance().resumeDownload(item.url)
        }
    }
    private val list = arrayListOf (
        "https://jx.parwix.com:4433/player/?url=",
        "https://jx.bozrc.com:4433/player/?url=",
        "https://www.mtosz.com/m3u8.php?url=",
        "https://vip.bljiex.com/?v=",
        "https://z1.m1907.cn/?jx=",
        "https://www.administratorw.com/video.php?url=",
        "http://17kyun.com/api.php?url=",
        "https://vip.66parse.club/?url=",
        "http://jx.rdhk.net/?v=",
        "https://www.8090g.cn/?url=",
        "https://www.8090g.cn/jiexi/?url=",
        "http://www.1717yun.com/jx/vip/index.php?url=",
        "https://www.ckmov.vip/api.php?url=",
        "http://jx.yparse.com/?url=",
        "https://jx.m3u8.tv/jiexi/?url=",
        "https://www.kpezp.cn/jlexi.php?url=",
        "https://www.xymav.com/?url=",
        "https://2.08bk.com/?url=",
        "https://okjx.cc/?url=",
        "https://api.v6.chat/?url="
    )

    private fun intercept(request: WebResourceRequest?){
        val url = request?.url.toString()
        if (url.contains(".m3u8")||url.contains(".mp4")){
            lifecycleScope.launch(Dispatchers.Main){
                mBTDownload.visibility = View.VISIBLE
                mBTDownload.setOnClickListener {
                    startDownload(request?.url.toString())
                }
            }
        }else {
            list.forEach {
                if (url.contains(it)){
                    lifecycleScope.launch(Dispatchers.Main){
                        mBTDownload.visibility = View.GONE
                    }
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        StatusBarUtil.setStatusBarDarkTheme(this,true)
        mWebView = findViewById(R.id.web_view)
        mFlVideo = findViewById(R.id.fl_video)
        mBTDownload = findViewById(R.id.mBTDownload)
        mBTDownloadList = findViewById(R.id.mBTDownloadList)
        mBTDownloadList.setOnClickListener {
            startActivity(Intent(this,DownloadListActivity::class.java))
        }

        mWebView.webViewClient = object :WebViewClient(){
            // API 21 开始引入
            override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? {
                Log.e(TAG,"url=${request?.url.toString()}")
                intercept(request)
                return super.shouldInterceptRequest(view, request)
            }
        }
        mWebView.webChromeClient = object : WebChromeClient() {
            override fun onShowCustomView(view: View?, callback: IX5WebChromeClient.CustomViewCallback?) {
                super.onShowCustomView(view, callback)
                if (mCustomView != null) {
                    callback?.onCustomViewHidden()
                    return
                }
                mCustomView = view
                mCustomView?.visibility = View.VISIBLE
                mCustomViewCallBack = callback
                mFlVideo.addView(mCustomView)
                mFlVideo.visibility = View.VISIBLE
                mFlVideo.bringToFront()
                //设置横屏
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            }

            override fun onHideCustomView() {
                super.onHideCustomView()
                if (mCustomView == null) {
                    return
                }
                mCustomView?.visibility = View.GONE
                mFlVideo.removeView(mCustomView)
                mCustomView = null
                mFlVideo.visibility = View.GONE
                mCustomViewCallBack?.onCustomViewHidden()
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            }
        }

        val webSettings = mWebView.settings
        webSettings.apply {
            loadWithOverviewMode = true
            builtInZoomControls = true
            javaScriptEnabled = true
            useWideViewPort = true
            setSupportZoom(true)
            javaScriptCanOpenWindowsAutomatically = true
            cacheMode = WebSettings.LOAD_DEFAULT
            mixedContentMode = MIXED_CONTENT_ALWAYS_ALLOW
            setGeolocationEnabled(true)
            domStorageEnabled = true
            databaseEnabled = true
            useWideViewPort = true
            allowFileAccess = true
            loadsImagesAutomatically = true
            loadWithOverviewMode = true
            pluginState = WebSettings.PluginState.ON
            cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        }
        mWebView.loadUrl("http://49.232.198.163/video.html")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN)
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
            mBTDownload.visibility = View.GONE
            mBTDownloadList.visibility = View.GONE
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
            window.addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN)
            mBTDownload.visibility = View.VISIBLE
            mBTDownloadList.visibility = View.VISIBLE
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        //清空所有cookie
        //清空所有cookie
        CookieSyncManager.createInstance(this)
        val cookieManager: CookieManager = CookieManager.getInstance()
        cookieManager.removeAllCookie()
        CookieSyncManager.getInstance().sync()
        mWebView.webChromeClient = null
        mWebView.settings.javaScriptEnabled = false
        mWebView.clearCache(true)
        mWebView.destroy()
    }
}