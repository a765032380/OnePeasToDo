package pub.gll.onepeas.libbase.di.http.internal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u00c6\u0003J[\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u00c6\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0004H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f\u00a8\u0006%"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/internal/ListBean;", "T", "", "curPage", "", "offset", "over", "", "pageCount", "size", "total", "dataList", "", "(IIZIIILjava/util/List;)V", "getCurPage", "()I", "getDataList", "()Ljava/util/List;", "getOffset", "getOver", "()Z", "getPageCount", "getSize", "getTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "LibBase_debug"})
public final class ListBean<T extends java.lang.Object> {
    private final int curPage = 0;
    private final int offset = 0;
    private final boolean over = false;
    private final int pageCount = 0;
    private final int size = 0;
    private final int total = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "datas")
    private final java.util.List<T> dataList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.libbase.di.http.internal.ListBean<T> copy(int curPage, int offset, boolean over, int pageCount, int size, int total, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> dataList) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ListBean() {
        super();
    }
    
    public ListBean(int curPage, int offset, boolean over, int pageCount, int size, int total, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> dataList) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCurPage() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getOffset() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getOver() {
        return false;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPageCount() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getDataList() {
        return null;
    }
}