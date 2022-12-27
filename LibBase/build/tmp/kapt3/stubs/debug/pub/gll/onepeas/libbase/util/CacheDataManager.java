package pub.gll.onepeas.libbase.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014\u00a8\u0006\u0015"}, d2 = {"Lpub/gll/onepeas/libbase/util/CacheDataManager;", "", "()V", "clearAllCache", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "deleteDir", "", "dir", "Ljava/io/File;", "getFolderSize", "", "file", "getFormatSize", "", "size", "", "getTotalCacheSize", "context", "Landroid/content/Context;", "LibBase_debug"})
public final class CacheDataManager {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.CacheDataManager INSTANCE = null;
    
    private CacheDataManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalCacheSize(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void clearAllCache(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    private final boolean deleteDir(java.io.File dir) {
        return false;
    }
    
    /**
     * 获取文件
     * Context.getExternalFilesDir() --> SDCard/Android/data/你的应用的包名/files/
     * 目录，一般放一些长时间保存的数据
     * Context.getExternalCacheDir() -->
     * SDCard/Android/data/你的应用包名/cache/目录，一般存放临时缓存数据
     */
    public final long getFolderSize(@org.jetbrains.annotations.Nullable()
    java.io.File file) {
        return 0L;
    }
    
    /**
     * 格式化单位
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormatSize(double size) {
        return null;
    }
}