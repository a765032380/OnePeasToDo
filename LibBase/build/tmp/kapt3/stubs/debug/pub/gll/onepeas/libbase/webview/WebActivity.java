package pub.gll.onepeas.libbase.webview;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/web/activity")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020#H\u0014J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006/"}, d2 = {"Lpub/gll/onepeas/libbase/webview/WebActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "list", "Ljava/util/ArrayList;", "mBTDownload", "Landroid/widget/Button;", "getMBTDownload", "()Landroid/widget/Button;", "setMBTDownload", "(Landroid/widget/Button;)V", "mBTDownloadList", "getMBTDownloadList", "setMBTDownloadList", "mCustomView", "Landroid/view/View;", "mCustomViewCallBack", "Lcom/tencent/smtt/export/external/interfaces/IX5WebChromeClient$CustomViewCallback;", "mFlVideo", "Landroid/widget/FrameLayout;", "getMFlVideo", "()Landroid/widget/FrameLayout;", "setMFlVideo", "(Landroid/widget/FrameLayout;)V", "mWebView", "Lcom/tencent/smtt/sdk/WebView;", "getMWebView", "()Lcom/tencent/smtt/sdk/WebView;", "setMWebView", "(Lcom/tencent/smtt/sdk/WebView;)V", "intercept", "", "request", "Lcom/tencent/smtt/export/external/interfaces/WebResourceRequest;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "startDownload", "url", "LibBase_debug"})
public final class WebActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.view.View mCustomView;
    private com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback mCustomViewCallBack;
    public com.tencent.smtt.sdk.WebView mWebView;
    public android.widget.FrameLayout mFlVideo;
    public android.widget.Button mBTDownload;
    public android.widget.Button mBTDownloadList;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "WebActivity";
    private final java.util.ArrayList<java.lang.String> list = null;
    
    public WebActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tencent.smtt.sdk.WebView getMWebView() {
        return null;
    }
    
    public final void setMWebView(@org.jetbrains.annotations.NotNull()
    com.tencent.smtt.sdk.WebView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.FrameLayout getMFlVideo() {
        return null;
    }
    
    public final void setMFlVideo(@org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getMBTDownload() {
        return null;
    }
    
    public final void setMBTDownload(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getMBTDownloadList() {
        return null;
    }
    
    public final void setMBTDownloadList(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    private final void startDownload(java.lang.String url) {
    }
    
    private final void intercept(com.tencent.smtt.export.external.interfaces.WebResourceRequest request) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}