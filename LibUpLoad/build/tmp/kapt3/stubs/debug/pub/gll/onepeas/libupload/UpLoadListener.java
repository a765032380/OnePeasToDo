package pub.gll.onepeas.libupload;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Lpub/gll/onepeas/libupload/UpLoadListener;", "", "uploadProgress", "", "progress", "", "uploadState", "upLoadState", "Lpub/gll/onepeas/libupload/UpLoadState;", "urlPath", "", "LibUpLoad_debug"})
public abstract interface UpLoadListener {
    
    public abstract void uploadState(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libupload.UpLoadState upLoadState, @org.jetbrains.annotations.Nullable()
    java.lang.String urlPath);
    
    public abstract void uploadProgress(int progress);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}