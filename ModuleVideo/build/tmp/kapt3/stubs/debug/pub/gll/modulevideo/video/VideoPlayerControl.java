package pub.gll.modulevideo.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0018"}, d2 = {"Lpub/gll/modulevideo/video/VideoPlayerControl;", "", "forward", "", "pause", "play", "rewind", "seekTo", "positionMs", "", "setFullscreen", "value", "", "setVideoDurationMs", "videoDurationMs", "setVideoPositionMs", "videoPositionMs", "setVideoResize", "mode", "Lpub/gll/modulevideo/video/ResizeMode;", "setVideoResize-873sZC8", "(I)V", "speed", "", "ModuleVideo_debug"})
public abstract interface VideoPlayerControl {
    
    public abstract void play();
    
    public abstract void pause();
    
    public abstract void forward();
    
    public abstract void rewind();
    
    public abstract void setFullscreen(boolean value);
    
    public abstract void setVideoDurationMs(long videoDurationMs);
    
    public abstract void setVideoPositionMs(long videoPositionMs);
    
    public abstract void seekTo(long positionMs);
    
    public abstract void speed(float speed);
}