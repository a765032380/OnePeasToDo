package pub.gll.modulevideo.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\rH\u0007\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"rememberVideoPlayerState", "Lpub/gll/modulevideo/video/VideoPlayerState;", "hideControllerAfterMs", "", "videoPositionPollInterval", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "config", "Lkotlin/Function1;", "Lcom/google/android/exoplayer2/ExoPlayer$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Long;JLkotlinx/coroutines/CoroutineScope;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Lpub/gll/modulevideo/video/VideoPlayerState;", "ModuleVideo_debug"})
public final class VideoPlayerStateKt {
    
    /**
     * Build and remember default implementation of [VideoPlayerState]
     *
     * @param hideControllerAfterMs time after which [VideoPlayerState.isControlUiVisible] will be set to false.
     * interactions with [VideoPlayerState.control] will reset the internal counter.
     * if null is provided the controller wont be hidden until [VideoPlayerState.hideControlUi] is called again
     * @param videoPositionPollInterval interval on which the [VideoPlayerState.videoPositionMs] will be updated,
     * you can set a lower number to update the ui faster though it will consume more cpu resources.
     * Take in consideration that this value is updated only when [VideoPlayerState.isControlUiVisible] is set to true,
     * if you need to get the last value use [ExoPlayer.getCurrentPosition].
     * @param coroutineScope this scope will be used to poll for [VideoPlayerState.videoPositionMs] updates
     * @param context used to build an [ExoPlayer] instance
     * @param config you can use this to configure [ExoPlayer]
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.compose.runtime.Composable()
    public static final pub.gll.modulevideo.video.VideoPlayerState rememberVideoPlayerState(@org.jetbrains.annotations.Nullable()
    java.lang.Long hideControllerAfterMs, long videoPositionPollInterval, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.android.exoplayer2.ExoPlayer.Builder, kotlin.Unit> config) {
        return null;
    }
}