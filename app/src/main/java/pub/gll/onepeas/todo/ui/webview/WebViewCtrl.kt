package pub.gll.onepeas.todo.ui.webview

import android.graphics.Bitmap
import android.view.View
import android.webkit.WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
import android.widget.FrameLayout
import android.widget.ProgressBar
import com.tencent.smtt.export.external.TbsCoreSettings
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient
import com.tencent.smtt.export.external.interfaces.SslErrorHandler
import com.tencent.smtt.export.external.interfaces.WebResourceRequest
import com.tencent.smtt.sdk.*


class WebViewCtrl(
    private val mView: FrameLayout,
    private val fullWebView: FrameLayout,
    private var linkUrl: String,
    private val onWebCall: (isFinish: Boolean) -> Unit,
    private val onFull: (isFull: Boolean) -> Unit
) {

    private val webView by lazy { mView.getChildAt(0) as WebView }
    private val progressBar by lazy { mView.getChildAt(1) as ProgressBar }

    fun initSettings() {
        onWebCall(false)
        setWebSettings()
        setupWebClient()
    }

    fun onDestroy() {
        mView.removeAllViews()
        webView.destroy()
    }

    private fun setWebSettings() {
        val webSettings = webView.settings
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
        val map = HashMap<String, Any>()
        map[TbsCoreSettings.TBS_SETTINGS_USE_SPEEDY_CLASSLOADER] = true
        map[TbsCoreSettings.TBS_SETTINGS_USE_DEXLOADER_SERVICE] = true
        QbSdk.initTbsSettings(map)
    }


    private fun setupWebClient() {
        webView.webViewClient = NewWebViewClient()
        webView.webChromeClient = ProgressWebViewChromeClient()
        refresh()
    }

    fun refresh() {
        webView.loadUrl(linkUrl)
    }


    private var mCustomView: View? = null
    private var mCustomViewCallBack: IX5WebChromeClient.CustomViewCallback? = null
    inner class ProgressWebViewChromeClient : WebChromeClient() {
        override fun onProgressChanged(view: WebView?, newProgress: Int) {
            super.onProgressChanged(view, newProgress)
            progressBar.progress = newProgress
        }

        override fun onReceivedTitle(view: WebView?, title: String?) {
            super.onReceivedTitle(view, title)
        }

        override fun onShowCustomView(view: View?, callback: IX5WebChromeClient.CustomViewCallback?) {
            super.onShowCustomView(view, callback)
            if (mCustomView != null) {
                callback?.onCustomViewHidden()
                return
            }
            mCustomView = view
            mCustomView?.visibility = View.VISIBLE
            mCustomViewCallBack = callback
            fullWebView.addView(mCustomView)
            fullWebView.visibility = View.VISIBLE
            fullWebView.bringToFront()
            onFull(true)
        }

        override fun onHideCustomView() {
            super.onHideCustomView()
            if (mCustomView == null) {
                return
            }
            mCustomView?.visibility = View.GONE
            fullWebView.removeView(mCustomView)
            mCustomView = null
            fullWebView.visibility = View.GONE
            mCustomViewCallBack?.onCustomViewHidden()
            onFull(false)
        }
    }


    inner class NewWebViewClient : WebViewClient() {

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            linkUrl = request?.url.toString()
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            linkUrl = url?:"NullUrlString"
            return super.shouldOverrideUrlLoading(view, url)
        }

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            progressBar.visibility = View.VISIBLE
            super.onPageStarted(view, url, favicon)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            progressBar.visibility = View.GONE
            onWebCall(true)
            super.onPageFinished(view, url)
        }

        override fun onReceivedSslError(
            view: WebView?,
            handler: SslErrorHandler?,
            p2: com.tencent.smtt.export.external.interfaces.SslError?
        ) {
            handler?.proceed()
        }
    }

}