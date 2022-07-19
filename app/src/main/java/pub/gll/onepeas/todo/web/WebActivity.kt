package pub.gll.onepeas.todo.web

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
import com.tencent.smtt.sdk.*
import pub.gll.onepeas.libcore.util.StatusBarUtil
import pub.gll.onepeas.todo.R

class WebActivity : AppCompatActivity() {
    private var mCustomView: View? = null
    private var mCustomViewCallBack: IX5WebChromeClient.CustomViewCallback? = null
    lateinit var mWebView: WebView
    lateinit var mFlVideo: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        StatusBarUtil.setStatusBarDarkTheme(this,true)
        mWebView = findViewById(R.id.web_view)
        mFlVideo = findViewById(R.id.fl_video)
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