package pub.gll.onepeas.lib.log.printer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J(\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\fH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lpub/gll/onepeas/lib/log/printer/HiViewPrinter;", "Lpub/gll/onepeas/lib/log/printer/HiLogPrinter;", "()V", "hiLogViewAdapter", "Lpub/gll/onepeas/lib/log/adapter/HiLogViewAdapter;", "getHiLogViewAdapter", "()Lpub/gll/onepeas/lib/log/adapter/HiLogViewAdapter;", "hiLogViewAdapter$delegate", "Lkotlin/Lazy;", "isShowLogView", "", "mTVClear", "Landroid/widget/TextView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "addData", "", "level", "", "tag", "", "content", "initView", "Landroid/view/View;", "viewGroup", "Landroid/view/ViewGroup;", "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "print", "config", "Lpub/gll/onepeas/lib/log/config/HiLogConfig;", "scrollToPosition", "updateUI", "mTVState", "Companion", "LibLog_debug"})
public final class HiViewPrinter implements pub.gll.onepeas.lib.log.printer.HiLogPrinter {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.lib.log.printer.HiViewPrinter.Companion Companion = null;
    private static final java.lang.String VIEW_TAG = "hi_view_recyclerview_tag";
    private final kotlin.Lazy hiLogViewAdapter$delegate = null;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.widget.TextView mTVClear;
    private boolean isShowLogView = false;
    
    public HiViewPrinter() {
        super();
    }
    
    private final pub.gll.onepeas.lib.log.adapter.HiLogViewAdapter getHiLogViewAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void print(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.config.HiLogConfig config, int level, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
    
    private final void addData(int level, java.lang.String tag, java.lang.String content) {
    }
    
    private final android.view.View initView(android.view.ViewGroup viewGroup) {
        return null;
    }
    
    /**
     * 滚动到底部
     */
    private final void scrollToPosition() {
    }
    
    /**
     * 更新UI
     */
    private final void updateUI(android.widget.TextView mTVState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpub/gll/onepeas/lib/log/printer/HiViewPrinter$Companion;", "", "()V", "VIEW_TAG", "", "LibLog_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}