package pub.gll.onepeas.libbase;

import java.lang.System;

/**
 * 基础的Application
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H&J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016\u00a8\u0006\u000e"}, d2 = {"Lpub/gll/onepeas/libbase/BaseApp;", "Landroid/app/Application;", "Lcoil/ImageLoaderFactory;", "()V", "initLog", "", "initModuleApp", "application", "initModuleData", "initWebView", "newImageLoader", "Lcoil/ImageLoader;", "onCreate", "Companion", "LibBase_debug"})
public abstract class BaseApp extends android.app.Application implements coil.ImageLoaderFactory {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.BaseApp.Companion Companion = null;
    public static pub.gll.onepeas.libbase.BaseApp instance;
    
    public BaseApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initLog() {
    }
    
    private final void initWebView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public coil.ImageLoader newImageLoader() {
        return null;
    }
    
    /**
     * 当前 Application 初始化完成
     *
     * @param application 上下文
     */
    public abstract void initModuleApp(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    /**
     * 所有 Application 都初始化完成后的自定义操作
     *
     * @param application 上下文
     */
    public abstract void initModuleData(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/libbase/BaseApp$Companion;", "", "()V", "instance", "Lpub/gll/onepeas/libbase/BaseApp;", "getInstance", "()Lpub/gll/onepeas/libbase/BaseApp;", "setInstance", "(Lpub/gll/onepeas/libbase/BaseApp;)V", "LibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.BaseApp getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.BaseApp p0) {
        }
    }
}