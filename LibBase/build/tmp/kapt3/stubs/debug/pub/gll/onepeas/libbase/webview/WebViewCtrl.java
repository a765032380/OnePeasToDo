package pub.gll.onepeas.libbase.webview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002%&Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b\u0012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010 \u001a\u00020\rJ\u0006\u0010!\u001a\u00020\rJ\u0006\u0010\"\u001a\u00020\rJ\b\u0010#\u001a\u00020\rH\u0002J\b\u0010$\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006\'"}, d2 = {"Lpub/gll/onepeas/libbase/webview/WebViewCtrl;", "", "mView", "Landroid/widget/FrameLayout;", "fullWebView", "linkUrl", "", "onWebCall", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isFinish", "", "onFull", "isFull", "(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "mCustomView", "Landroid/view/View;", "mCustomViewCallBack", "Lcom/tencent/smtt/export/external/interfaces/IX5WebChromeClient$CustomViewCallback;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "Lkotlin/Lazy;", "webView", "Lcom/tencent/smtt/sdk/WebView;", "getWebView", "()Lcom/tencent/smtt/sdk/WebView;", "webView$delegate", "initSettings", "onDestroy", "refresh", "setWebSettings", "setupWebClient", "NewWebViewClient", "ProgressWebViewChromeClient", "LibBase_debug"})
public final class WebViewCtrl {
    private final android.widget.FrameLayout mView = null;
    private final android.widget.FrameLayout fullWebView = null;
    private java.lang.String linkUrl;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onWebCall = null;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onFull = null;
    private final kotlin.Lazy webView$delegate = null;
    private final kotlin.Lazy progressBar$delegate = null;
    private android.view.View mCustomView;
    private com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback mCustomViewCallBack;
    
    public WebViewCtrl(@org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout mView, @org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout fullWebView, @org.jetbrains.annotations.NotNull()
    java.lang.String linkUrl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onWebCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onFull) {
        super();
    }
    
    private final com.tencent.smtt.sdk.WebView getWebView() {
        return null;
    }
    
    private final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void initSettings() {
    }
    
    public final void onDestroy() {
    }
    
    private final void setWebSettings() {
    }
    
    private final void setupWebClient() {
    }
    
    public final void refresh() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016\u00a8\u0006\u0011"}, d2 = {"Lpub/gll/onepeas/libbase/webview/WebViewCtrl$ProgressWebViewChromeClient;", "Lcom/tencent/smtt/sdk/WebChromeClient;", "(Lpub/gll/onepeas/libbase/webview/WebViewCtrl;)V", "onHideCustomView", "", "onProgressChanged", "view", "Lcom/tencent/smtt/sdk/WebView;", "newProgress", "", "onReceivedTitle", "title", "", "onShowCustomView", "Landroid/view/View;", "callback", "Lcom/tencent/smtt/export/external/interfaces/IX5WebChromeClient$CustomViewCallback;", "LibBase_debug"})
    public final class ProgressWebViewChromeClient extends com.tencent.smtt.sdk.WebChromeClient {
        
        public ProgressWebViewChromeClient() {
            super();
        }
        
        @java.lang.Override()
        public void onProgressChanged(@org.jetbrains.annotations.Nullable()
        com.tencent.smtt.sdk.WebView view, int newProgress) {
        }
        
        @java.lang.Override()
        public void onReceivedTitle(@org.jetbrains.annotations.Nullable()
        com.tencent.smtt.sdk.WebView view, @org.jetbrains.annotations.Nullable()
        java.lang.String title) {
        }
        
        @java.lang.Override()
        public void onShowCustomView(@org.jetbrains.annotations.Nullable()
        android.view.View view, @org.jetbrains.annotations.Nullable()
        com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback callback) {
        }
        
        @java.lang.Override()
        public void onHideCustomView() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\u0015"}, d2 = {"Lpub/gll/onepeas/libbase/webview/WebViewCtrl$NewWebViewClient;", "Lcom/tencent/smtt/sdk/WebViewClient;", "(Lpub/gll/onepeas/libbase/webview/WebViewCtrl;)V", "onPageFinished", "", "view", "Lcom/tencent/smtt/sdk/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedSslError", "handler", "Lcom/tencent/smtt/export/external/interfaces/SslErrorHandler;", "p2", "Lcom/tencent/smtt/export/external/interfaces/SslError;", "shouldOverrideUrlLoading", "", "request", "Lcom/tencent/smtt/export/external/interfaces/WebResourceRequest;", "LibBase_debug"})
    public final class NewWebViewClient extends com.tencent.smtt.sdk.WebViewClient {
        
        public NewWebViewClient() {
            super();
        }
        
        @java.lang.Override()
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.Nullable()
        com.tencent.smtt.sdk.WebView view, @org.jetbrains.annotations.Nullable()
        com.tencent.smtt.export.external.interfaces.WebResourceRequest request) {
            return false;
        }
        
        @java.lang.Override()
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.Nullable()
        com.tencent.smtt.sdk.WebView view, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            return false;
        }
        
        @java.lang.Override()
        public void onPageStarted(@org.jetbrains.annotations.Nullable()
        com.tencent.smtt.sdk.WebView view, @org.jetbrains.annotations.Nullable()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap favicon) {
        }
        
        @java.lang.Override()
        public void onPageFinished(@org.jetbrains.annotations.Nullable()
        com.tencent.smtt.sdk.WebView view, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
        }
        
        @java.lang.Override()
        public void onReceivedSslError(@org.jetbrains.annotations.Nullable()
        com.tencent.smtt.sdk.WebView view, @org.jetbrains.annotations.Nullable()
        com.tencent.smtt.export.external.interfaces.SslErrorHandler handler, @org.jetbrains.annotations.Nullable()
        com.tencent.smtt.export.external.interfaces.SslError p2) {
        }
    }
}