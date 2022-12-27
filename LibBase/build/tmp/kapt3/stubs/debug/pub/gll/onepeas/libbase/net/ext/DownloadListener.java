package pub.gll.onepeas.libbase.net.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J(\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lpub/gll/onepeas/libbase/net/ext/DownloadListener;", "", "onFinish", "", "downloadBytes", "", "totalBytes", "onProgressChange", "onStop", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LibBase_debug"})
public abstract interface DownloadListener {
    
    public abstract void onProgressChange(long downloadBytes, long totalBytes);
    
    public abstract void onFinish(long downloadBytes, long totalBytes);
    
    public abstract void onStop(long downloadBytes, long totalBytes, @org.jetbrains.annotations.Nullable()
    java.lang.Exception exception);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void onFinish(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.net.ext.DownloadListener $this, long downloadBytes, long totalBytes) {
        }
        
        public static void onStop(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.net.ext.DownloadListener $this, long downloadBytes, long totalBytes, @org.jetbrains.annotations.Nullable()
        java.lang.Exception exception) {
        }
    }
}