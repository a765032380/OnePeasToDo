package pub.gll.onepeas.libupload;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lpub/gll/onepeas/libupload/TXUploadManager;", "", "()V", "BUCKET", "", "KEY_DURATION", "", "REGION", "SECRET_ID", "SECRET_KEY", "upLoadListener", "Lpub/gll/onepeas/libupload/UpLoadListener;", "getUpLoadListener", "()Lpub/gll/onepeas/libupload/UpLoadListener;", "setUpLoadListener", "(Lpub/gll/onepeas/libupload/UpLoadListener;)V", "initCos", "", "context", "Landroid/content/Context;", "sourceFile", "Ljava/io/File;", "upload", "uploadFile", "cosXmlService", "Lcom/tencent/cos/xml/CosXmlSimpleService;", "LibUpLoad_debug"})
public final class TXUploadManager {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libupload.TXUploadManager INSTANCE = null;
    @org.jetbrains.annotations.Nullable()
    private static pub.gll.onepeas.libupload.UpLoadListener upLoadListener;
    private static final java.lang.String SECRET_ID = "AKIDtDIyShFpKcfS2VGojTEl37qMfnZDYjfP";
    private static final java.lang.String SECRET_KEY = "jHeeV7TaVRGr5E8lAGBtOky0mKdkjqQx";
    private static final java.lang.String BUCKET = "test-1251228670";
    private static final java.lang.String REGION = "ap-beijing-1";
    private static final long KEY_DURATION = 3000L;
    
    private TXUploadManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final pub.gll.onepeas.libupload.UpLoadListener getUpLoadListener() {
        return null;
    }
    
    public final void setUpLoadListener(@org.jetbrains.annotations.Nullable()
    pub.gll.onepeas.libupload.UpLoadListener p0) {
    }
    
    private final void initCos(android.content.Context context, java.io.File sourceFile) {
    }
    
    public final void upload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File sourceFile) {
    }
    
    private final void uploadFile(com.tencent.cos.xml.CosXmlSimpleService cosXmlService, java.io.File sourceFile) {
    }
}