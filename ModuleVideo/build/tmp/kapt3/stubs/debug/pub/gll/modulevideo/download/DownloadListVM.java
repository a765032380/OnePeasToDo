package pub.gll.modulevideo.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\rJ\u0006\u0010#\u001a\u00020\u001fJ\u0012\u0010$\u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006%"}, d2 = {"Lpub/gll/modulevideo/download/DownloadListVM;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "downloadListener", "Lcom/jeffmony/downloader/listener/DownloadListener;", "iDownloadInfosCallback", "Lcom/jeffmony/downloader/listener/IDownloadInfosCallback;", "list", "", "Lcom/jeffmony/downloader/model/VideoTaskItem;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "mLastProgressTimeStamp", "", "mLastSpeedTimeStamp", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lpub/gll/modulevideo/download/UiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "videoTaskList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getVideoTaskList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "close", "", "delete", "item", "download", "getData", "notifyChanged", "ModuleVideo_debug"})
public final class DownloadListVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "DownloadListVM";
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<pub.gll.modulevideo.download.UiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.jeffmony.downloader.model.VideoTaskItem> list;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.jeffmony.downloader.model.VideoTaskItem> videoTaskList = null;
    private final com.jeffmony.downloader.listener.IDownloadInfosCallback iDownloadInfosCallback = null;
    private long mLastProgressTimeStamp = 0L;
    private long mLastSpeedTimeStamp = 0L;
    private final com.jeffmony.downloader.listener.DownloadListener downloadListener = null;
    
    @javax.inject.Inject()
    public DownloadListVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<pub.gll.modulevideo.download.UiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jeffmony.downloader.model.VideoTaskItem> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.jeffmony.downloader.model.VideoTaskItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.jeffmony.downloader.model.VideoTaskItem> getVideoTaskList() {
        return null;
    }
    
    public final void close() {
    }
    
    public final void getData() {
    }
    
    public final void download(@org.jetbrains.annotations.NotNull()
    com.jeffmony.downloader.model.VideoTaskItem item) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.jeffmony.downloader.model.VideoTaskItem item) {
    }
    
    private final void notifyChanged(com.jeffmony.downloader.model.VideoTaskItem item) {
    }
}