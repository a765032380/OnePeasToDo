package pub.gll.modulevideo.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\bH\u0003\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\bH\u0007\u001a+\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0013"}, d2 = {"VideoPlayer", "", "modifier", "Landroidx/compose/ui/Modifier;", "playerState", "Lpub/gll/modulevideo/video/VideoPlayerState;", "controller", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "adaptiveLayout", "aspectRatio", "", "resizeMode", "Lpub/gll/modulevideo/video/ResizeMode;", "adaptiveLayout-0j75-Lw", "(Landroidx/compose/ui/Modifier;FI)Landroidx/compose/ui/Modifier;", "defaultPlayerTapGestures", "ModuleVideo_debug"})
public final class VideoPlayerKt {
    
    private static final androidx.compose.ui.Modifier defaultPlayerTapGestures(androidx.compose.ui.Modifier $this$defaultPlayerTapGestures, pub.gll.modulevideo.video.VideoPlayerState playerState) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    private static final void VideoPlayer(androidx.compose.ui.Modifier modifier, pub.gll.modulevideo.video.VideoPlayerState playerState, kotlin.jvm.functions.Function0<kotlin.Unit> controller) {
    }
    
    /**
     * @param playerState state to attach to this composable.
     * @param lifecycleOwner required to manage the ExoPlayer instance.
     * @param controller you can use [VideoPlayerControl] or alternatively implement your own
     */
    @androidx.compose.runtime.Composable()
    public static final void VideoPlayer(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.video.VideoPlayerState playerState, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> controller) {
    }
}