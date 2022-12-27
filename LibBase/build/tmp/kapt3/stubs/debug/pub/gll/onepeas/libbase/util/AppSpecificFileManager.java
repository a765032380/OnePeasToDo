package pub.gll.onepeas.libbase.util;

import java.lang.System;

/**
 * 管理APP专用的（app-specific files） 内部存储空间目录 和 外部存储空间目录下的文件，读写均不需要权限，详情可以参考https://developer.android.google.cn/training/data-storage/app-specific#external
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lpub/gll/onepeas/libbase/util/AppSpecificFileManager;", "", "()V", "AppSpecificFileAccessor", "ExternalAccessor", "InternalAccessor", "LibBase_debug"})
public final class AppSpecificFileManager {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.AppSpecificFileManager INSTANCE = null;
    
    private AppSpecificFileManager() {
        super();
    }
    
    /**
     * 应用专属存储空间访问器
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lpub/gll/onepeas/libbase/util/AppSpecificFileManager$AppSpecificFileAccessor;", "", "cacheDir", "Ljava/io/File;", "createTempFile", "fileName", "", "suffix", "dir", "openCacheFile", "openFile", "LibBase_debug"})
    public static abstract interface AppSpecificFileAccessor {
        
        /**
         * 打开文件
         * @param fileName String 文件名
         */
        @org.jetbrains.annotations.NotNull()
        public abstract java.io.File openFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName);
        
        /**
         * 打开缓存文件
         * @param fileName String 文件名
         */
        @org.jetbrains.annotations.NotNull()
        public abstract java.io.File openCacheFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName);
        
        /**
         * 存储的目录
         * @return File 目录
         */
        @org.jetbrains.annotations.NotNull()
        public abstract java.io.File dir();
        
        /**
         * 缓存的目录
         * @return File 目录
         */
        @org.jetbrains.annotations.NotNull()
        public abstract java.io.File cacheDir();
        
        /**
         * 创建缓存文件
         * @param fileName String 文件名
         * @param suffix String? 后缀，可选
         * @return File 新创建的缓存文件
         */
        @org.jetbrains.annotations.NotNull()
        public abstract java.io.File createTempFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.Nullable()
        java.lang.String suffix);
        
        /**
         * 应用专属存储空间访问器
         */
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class DefaultImpls {
            
            /**
             * 打开文件
             * @param fileName String 文件名
             */
            @org.jetbrains.annotations.NotNull()
            public static java.io.File openFile(@org.jetbrains.annotations.NotNull()
            pub.gll.onepeas.libbase.util.AppSpecificFileManager.AppSpecificFileAccessor $this, @org.jetbrains.annotations.NotNull()
            java.lang.String fileName) {
                return null;
            }
            
            /**
             * 打开缓存文件
             * @param fileName String 文件名
             */
            @org.jetbrains.annotations.NotNull()
            public static java.io.File openCacheFile(@org.jetbrains.annotations.NotNull()
            pub.gll.onepeas.libbase.util.AppSpecificFileManager.AppSpecificFileAccessor $this, @org.jetbrains.annotations.NotNull()
            java.lang.String fileName) {
                return null;
            }
        }
    }
    
    /**
     * 应用专用（内部）存储空间访问器
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lpub/gll/onepeas/libbase/util/AppSpecificFileManager$InternalAccessor;", "Lpub/gll/onepeas/libbase/util/AppSpecificFileManager$AppSpecificFileAccessor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheDir", "Ljava/io/File;", "createTempFile", "fileName", "", "suffix", "dir", "fileList", "", "()[Ljava/lang/String;", "LibBase_debug"})
    @javax.inject.Singleton()
    public static final class InternalAccessor implements pub.gll.onepeas.libbase.util.AppSpecificFileManager.AppSpecificFileAccessor {
        private final android.content.Context context = null;
        
        /**
         * 打开文件
         * @param fileName String 文件名
         */
        @org.jetbrains.annotations.NotNull()
        public java.io.File openFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return null;
        }
        
        /**
         * 打开缓存文件
         * @param fileName String 文件名
         */
        @org.jetbrains.annotations.NotNull()
        public java.io.File openCacheFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return null;
        }
        
        @javax.inject.Inject()
        public InternalAccessor(@org.jetbrains.annotations.NotNull()
        @dagger.hilt.android.qualifiers.ApplicationContext()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.io.File dir() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.io.File cacheDir() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.io.File createTempFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.Nullable()
        java.lang.String suffix) {
            return null;
        }
        
        /**
         * 获取包含 filesDir 目录中所有文件名称的数组
         * @return Array<String> 文件名称的数组
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] fileList() {
            return null;
        }
    }
    
    /**
     * 应用专用（外部）存储空间访问器
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lpub/gll/onepeas/libbase/util/AppSpecificFileManager$ExternalAccessor;", "Lpub/gll/onepeas/libbase/util/AppSpecificFileManager$AppSpecificFileAccessor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheDir", "Ljava/io/File;", "createTempFile", "fileName", "", "suffix", "dir", "LibBase_debug"})
    @javax.inject.Singleton()
    public static final class ExternalAccessor implements pub.gll.onepeas.libbase.util.AppSpecificFileManager.AppSpecificFileAccessor {
        private final android.content.Context context = null;
        
        /**
         * 打开文件
         * @param fileName String 文件名
         */
        @org.jetbrains.annotations.NotNull()
        public java.io.File openFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return null;
        }
        
        /**
         * 打开缓存文件
         * @param fileName String 文件名
         */
        @org.jetbrains.annotations.NotNull()
        public java.io.File openCacheFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName) {
            return null;
        }
        
        @javax.inject.Inject()
        public ExternalAccessor(@org.jetbrains.annotations.NotNull()
        @dagger.hilt.android.qualifiers.ApplicationContext()
        android.content.Context context) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.io.File dir() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.io.File cacheDir() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.io.File createTempFile(@org.jetbrains.annotations.NotNull()
        java.lang.String fileName, @org.jetbrains.annotations.Nullable()
        java.lang.String suffix) {
            return null;
        }
    }
}