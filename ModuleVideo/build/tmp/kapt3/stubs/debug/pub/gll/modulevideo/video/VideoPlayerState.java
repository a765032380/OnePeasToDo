package pub.gll.modulevideo.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020 H&J\b\u0010\"\u001a\u00020 H&J\b\u0010#\u001a\u00020 H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007X\u00a6\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lpub/gll/modulevideo/video/VideoPlayerState;", "", "control", "Lpub/gll/modulevideo/video/VideoPlayerControl;", "getControl", "()Lpub/gll/modulevideo/video/VideoPlayerControl;", "isControlUiVisible", "Landroidx/compose/runtime/State;", "", "()Landroidx/compose/runtime/State;", "isFullscreen", "isOptionsUiVisible", "isPlaying", "player", "Lcom/google/android/exoplayer2/ExoPlayer;", "getPlayer", "()Lcom/google/android/exoplayer2/ExoPlayer;", "playerState", "", "getPlayerState", "videoDurationMs", "", "getVideoDurationMs", "videoPositionMs", "getVideoPositionMs", "videoResizeMode", "Lpub/gll/modulevideo/video/ResizeMode;", "getVideoResizeMode", "videoSize", "Lcom/google/android/exoplayer2/video/VideoSize;", "getVideoSize", "hideControlUi", "", "hideOptionsUi", "showControlUi", "showOptionsUi", "ModuleVideo_debug"})
public abstract interface VideoPlayerState {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.exoplayer2.ExoPlayer getPlayer();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<com.google.android.exoplayer2.video.VideoSize> getVideoSize();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<pub.gll.modulevideo.video.ResizeMode> getVideoResizeMode();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<java.lang.Long> getVideoPositionMs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<java.lang.Long> getVideoDurationMs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<java.lang.Boolean> isFullscreen();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<java.lang.Boolean> isPlaying();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<java.lang.Integer> getPlayerState();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<java.lang.Boolean> isOptionsUiVisible();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.compose.runtime.State<java.lang.Boolean> isControlUiVisible();
    
    @org.jetbrains.annotations.NotNull()
    public abstract pub.gll.modulevideo.video.VideoPlayerControl getControl();
    
    public abstract void hideOptionsUi();
    
    public abstract void showOptionsUi();
    
    public abstract void hideControlUi();
    
    public abstract void showControlUi();
}