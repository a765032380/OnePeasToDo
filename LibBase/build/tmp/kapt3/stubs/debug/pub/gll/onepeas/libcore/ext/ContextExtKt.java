package pub.gll.onepeas.libcore.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\b\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"layoutInflater", "Landroid/view/LayoutInflater;", "Landroid/content/Context;", "getLayoutInflater", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "getDir", "Ljava/io/File;", "dirName", "", "openExternalCacheFile", "fileName", "openFile", "openFileOutput", "Ljava/io/FileOutputStream;", "LibBase_debug"})
public final class ContextExtKt {
    
    /**
     * 打开filesDir目录下的文件
     * @param fileName String 文件名
     * @return File 打开的文件
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File openFile(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openFile, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.LayoutInflater getLayoutInflater(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$layoutInflater) {
        return null;
    }
    
    /**
     * 获取filesDir目录下的文件流（用于写入）
     * @param fileName String 文件名
     * @return FileOutputStream 用于写入的文件流
     * @see [Context.openFileInput]
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.io.FileOutputStream openFileOutput(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openFileOutput, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    /**
     * 创建嵌套目录或打开内部目录，设计同名扩展方法的原因可以参考[openFileOutput]
     * @param dirName String 目录名
     * @return File 打开的目录
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File getDir(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDir, @org.jetbrains.annotations.NotNull()
    java.lang.String dirName) {
        return null;
    }
    
    /**
     * 打开外部存储空间中的缓存文件
     * @param fileName String 文件名
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File openExternalCacheFile(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openExternalCacheFile, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
}