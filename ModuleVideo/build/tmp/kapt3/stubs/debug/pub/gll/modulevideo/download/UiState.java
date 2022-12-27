package pub.gll.modulevideo.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lpub/gll/modulevideo/download/UiState;", "", "Error", "Loading", "Success", "Lpub/gll/modulevideo/download/UiState$Success;", "Lpub/gll/modulevideo/download/UiState$Error;", "Lpub/gll/modulevideo/download/UiState$Loading;", "ModuleVideo_debug"})
public abstract interface UiState {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lpub/gll/modulevideo/download/UiState$Success;", "Lpub/gll/modulevideo/download/UiState;", "list", "", "Lcom/jeffmony/downloader/model/VideoTaskItem;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ModuleVideo_debug"})
    public static final class Success implements pub.gll.modulevideo.download.UiState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.jeffmony.downloader.model.VideoTaskItem> list = null;
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.modulevideo.download.UiState.Success copy(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.jeffmony.downloader.model.VideoTaskItem> list) {
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
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.jeffmony.downloader.model.VideoTaskItem> list) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.jeffmony.downloader.model.VideoTaskItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.jeffmony.downloader.model.VideoTaskItem> getList() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/modulevideo/download/UiState$Error;", "Lpub/gll/modulevideo/download/UiState;", "()V", "ModuleVideo_debug"})
    public static final class Error implements pub.gll.modulevideo.download.UiState {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.modulevideo.download.UiState.Error INSTANCE = null;
        
        private Error() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/modulevideo/download/UiState$Loading;", "Lpub/gll/modulevideo/download/UiState;", "()V", "ModuleVideo_debug"})
    public static final class Loading implements pub.gll.modulevideo.download.UiState {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.modulevideo.download.UiState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}