package pub.gll.onepeas.lib.log.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0006\u0010\u0015\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lpub/gll/onepeas/lib/log/adapter/HiLogViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpub/gll/onepeas/lib/log/adapter/HiLogViewAdapter$HiLogViewViewHolder;", "()V", "mData", "Ljava/util/ArrayList;", "Lpub/gll/onepeas/lib/log/adapter/LogBean;", "addData", "", "logBean", "getHighlightColor", "", "logLevel", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeAll", "HiLogViewViewHolder", "LibLog_debug"})
public final class HiLogViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<pub.gll.onepeas.lib.log.adapter.HiLogViewAdapter.HiLogViewViewHolder> {
    private final java.util.ArrayList<pub.gll.onepeas.lib.log.adapter.LogBean> mData = null;
    
    public HiLogViewAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public pub.gll.onepeas.lib.log.adapter.HiLogViewAdapter.HiLogViewViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.adapter.HiLogViewAdapter.HiLogViewViewHolder holder, int position) {
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.adapter.LogBean logBean) {
    }
    
    public final void removeAll() {
    }
    
    /**
     * 跟进log级别获取不同的高了颜色
     *
     * @param logLevel log 级别
     * @return 高亮的颜色
     */
    private final int getHighlightColor(int logLevel) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lpub/gll/onepeas/lib/log/adapter/HiLogViewAdapter$HiLogViewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "tagView", "Landroid/widget/TextView;", "getTagView", "()Landroid/widget/TextView;", "setTagView", "(Landroid/widget/TextView;)V", "LibLog_debug"})
    public static final class HiLogViewViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tagView;
        
        public HiLogViewViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTagView() {
            return null;
        }
        
        public final void setTagView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}