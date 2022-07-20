package pub.gll.onepeas.todo.web

import android.annotation.SuppressLint
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
import com.jeffmony.downloader.VideoDownloadManager
import com.jeffmony.downloader.listener.DownloadListener
import com.jeffmony.downloader.model.VideoTaskItem
import com.jeffmony.downloader.utils.LogUtils
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
import com.tencent.smtt.export.external.interfaces.WebResourceRequest
import com.tencent.smtt.export.external.interfaces.WebResourceResponse
import com.tencent.smtt.sdk.*
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pub.gll.onepeas.libcore.util.StatusBarUtil
import pub.gll.onepeas.todo.R
import pub.gll.onepeas.todo.web.download.DownloadListActivity
import kotlin.coroutines.CoroutineContext


class WebActivity : AppCompatActivity() {
    private var mCustomView: View? = null
    private var mCustomViewCallBack: IX5WebChromeClient.CustomViewCallback? = null
    lateinit var mWebView: WebView
    lateinit var mFlVideo: FrameLayout
    lateinit var mBTDownload: Button
    lateinit var mBTDownloadList: Button
    val TAG = "LLLLLLLL"

    private var mLastProgressTimeStamp: Long = 0
    private var mLastSpeedTimeStamp: Long = 0

    private fun startDownload(url:String){
        VideoDownloadManager.getInstance().setGlobalDownloadListener(object : DownloadListener() {
            override fun onDownloadDefault(item: VideoTaskItem) {
                LogUtils.w(TAG, "onDownloadDefault: $item")
//                notifyChanged(item)
            }

            override fun onDownloadPending(item: VideoTaskItem) {
                LogUtils.w(TAG, "onDownloadPending: $item")
//                notifyChanged(item)
            }

            override fun onDownloadPrepare(item: VideoTaskItem) {
                LogUtils.w(TAG, "onDownloadPrepare: $item")
//                notifyChanged(item)
            }

            override fun onDownloadStart(item: VideoTaskItem) {
                LogUtils.w(TAG, "onDownloadStart: $item")
//                notifyChanged(item)
            }

            override fun onDownloadProgress(item: VideoTaskItem) {
                val currentTimeStamp = System.currentTimeMillis()
                if (currentTimeStamp - mLastProgressTimeStamp > 1000) {
                    LogUtils.w(
                        TAG,
                        "onDownloadProgress: " + item.percentString + ", curTs=" + item.curTs + ", totalTs=" + item.totalTs
                    )
//                    notifyChanged(item)
                    mLastProgressTimeStamp = currentTimeStamp
                }
            }

            override fun onDownloadSpeed(item: VideoTaskItem?) {
                val currentTimeStamp = System.currentTimeMillis()
                if (currentTimeStamp - mLastSpeedTimeStamp > 1000) {
//                    notifyChanged(item)
                    mLastSpeedTimeStamp = currentTimeStamp
                }
            }

            override fun onDownloadPause(item: VideoTaskItem) {
                LogUtils.w(TAG, "onDownloadPause: " + item.url)
//                notifyChanged(item)
            }

            override fun onDownloadError(item: VideoTaskItem) {
                LogUtils.w(TAG, "onDownloadError: " + item.url)
//                notifyChanged(item)
            }

            override fun onDownloadSuccess(item: VideoTaskItem) {
                LogUtils.w(TAG, "onDownloadSuccess: $item")
//                notifyChanged(item)
            }
        })
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
                if (request?.url.toString().contains(".m3u8")){
                    lifecycleScope.launch(Dispatchers.Main){
                        mBTDownload.visibility = View.VISIBLE
                        mBTDownload.setOnClickListener {
                            startDownload(request?.url.toString())
                        }
                    }
                }
                if (request?.url.toString().contains(".mp4")) {
                    lifecycleScope.launch(Dispatchers.Main){
                        mBTDownload.visibility = View.VISIBLE
                        mBTDownload.setOnClickListener {
                            startDownload(request?.url.toString())
                        }
                    }
                }
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
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            window.addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
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