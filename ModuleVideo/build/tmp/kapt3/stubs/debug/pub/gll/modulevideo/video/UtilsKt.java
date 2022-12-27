package pub.gll.modulevideo.video;

import java.lang.System;

@kotlin.Suppress(names = {"NOTHING_TO_INLINE"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0080\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\t\u001a\u00020\n*\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a%\u0010\u000f\u001a\u00020\n*\u00060\u000bj\u0002`\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0013H\u0080\b\u001a*\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u001a"}, d2 = {"MAX_ASPECT_RATIO_DIFFERENCE_FRACTION", "", "prettyVideoTimestamp", "", "duration", "Lkotlin/time/Duration;", "position", "prettyVideoTimestamp-QTBD994", "(JJ)Ljava/lang/String;", "appendDoubleDigit", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", "appendMinutesAndSeconds", "appendMinutesAndSeconds-HG0u8IE", "(Ljava/lang/StringBuilder;J)V", "aspectRatio", "Lcom/google/android/exoplayer2/video/VideoSize;", "resizeForVideo", "Landroidx/compose/ui/unit/Constraints;", "mode", "Lpub/gll/modulevideo/video/ResizeMode;", "resizeForVideo-Fdhn5dE", "(JIF)J", "ModuleVideo_debug"})
public final class UtilsKt {
    
    /**
     * The [FrameLayout] will not resize itself if the fractional difference between its natural
     * aspect ratio and the requested aspect ratio falls below this threshold.
     *
     *
     * This tolerance allows the view to occupy the whole of the screen when the requested aspect
     * ratio is very close, but not exactly equal to, the aspect ratio of the screen. This may reduce
     * the number of view layers that need to be composited by the underlying system, which can help
     * to reduce power consumption.
     */
    private static final float MAX_ASPECT_RATIO_DIFFERENCE_FRACTION = 0.01F;
    
    public static final float aspectRatio(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.video.VideoSize $this$aspectRatio) {
        return 0.0F;
    }
    
    /**
     * Will append [value] as double digit to [this].
     * If a single digit value is passed, ex: 4 then a 0 will be added as prefix resulting in 04
     */
    private static final void appendDoubleDigit(java.lang.StringBuilder $this$appendDoubleDigit, long value) {
    }
}