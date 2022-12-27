package pub.gll.modulevideo.video;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/video/play")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lpub/gll/modulevideo/video/PlayActivity;", "Lpub/gll/onepeas/libbase/activity/BaseActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "ModuleVideo_debug"})
public final class PlayActivity extends pub.gll.onepeas.libbase.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.modulevideo.video.PlayActivity.Companion Companion = null;
    private static final java.lang.String PLAY_ACTIVITY_PARAM_URL = "url";
    
    public PlayActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lpub/gll/modulevideo/video/PlayActivity$Companion;", "", "()V", "PLAY_ACTIVITY_PARAM_URL", "", "launch", "", "context", "Landroid/content/Context;", "url", "ModuleVideo_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
        }
    }
}