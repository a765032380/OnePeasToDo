package pub.gll.onepeas.libupload;

import java.lang.System;

/**
 * 上传状态枚举类型
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lpub/gll/onepeas/libupload/UpLoadState;", "", "(Ljava/lang/String;I)V", "START", "UPLOADING", "COMPLETED", "FAILED", "LibUpLoad_debug"})
public enum UpLoadState {
    /*public static final*/ START /* = new START() */,
    /*public static final*/ UPLOADING /* = new UPLOADING() */,
    /*public static final*/ COMPLETED /* = new COMPLETED() */,
    /*public static final*/ FAILED /* = new FAILED() */;
    
    UpLoadState() {
    }
}