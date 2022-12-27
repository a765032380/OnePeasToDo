package pub.gll.onepeas.libbase.arouter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/libbase/arouter/ARouterPath;", "", "()V", "VIDEO_DOWNLOAD_LIST", "", "VIDEO_LIST", "VIDEO_PATH", "VIDEO_PLAY", "WEB_ACTIVITY", "LibBase_debug"})
public final class ARouterPath {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.arouter.ARouterPath INSTANCE = null;
    
    /**
     * *********** Video组件
     */
    private static final java.lang.String VIDEO_PATH = "/video";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIDEO_DOWNLOAD_LIST = "/video/download_list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIDEO_PLAY = "/video/play";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIDEO_LIST = "/video/video";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WEB_ACTIVITY = "/web/activity";
    
    private ARouterPath() {
        super();
    }
}