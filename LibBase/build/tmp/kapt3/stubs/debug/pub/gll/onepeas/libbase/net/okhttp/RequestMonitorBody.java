package pub.gll.onepeas.libbase.net.okhttp;

import java.lang.System;

/**
 * 上传进度监听器
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012BG\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00126\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u0003\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lpub/gll/onepeas/libbase/net/okhttp/RequestMonitorBody;", "Lokhttp3/RequestBody;", "delegate", "updateProgress", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "hasWrittenLen", "totalLen", "", "(Lokhttp3/RequestBody;Lkotlin/jvm/functions/Function2;)V", "contentLength", "contentType", "Lokhttp3/MediaType;", "writeTo", "sink", "Lokio/BufferedSink;", "CountingSink", "LibBase_debug"})
public final class RequestMonitorBody extends okhttp3.RequestBody {
    private final okhttp3.RequestBody delegate = null;
    private final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Long, kotlin.Unit> updateProgress = null;
    
    public RequestMonitorBody(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody delegate, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> updateProgress) {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public long contentLength() throws java.io.IOException {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    public void writeTo(@org.jetbrains.annotations.NotNull()
    okio.BufferedSink sink) throws java.io.IOException {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lpub/gll/onepeas/libbase/net/okhttp/RequestMonitorBody$CountingSink;", "Lokio/ForwardingSink;", "delegate", "Lokio/Sink;", "(Lpub/gll/onepeas/libbase/net/okhttp/RequestMonitorBody;Lokio/Sink;)V", "bytesWritten", "", "write", "", "source", "Lokio/Buffer;", "byteCount", "LibBase_debug"})
    public final class CountingSink extends okio.ForwardingSink {
        private long bytesWritten = 0L;
        
        public CountingSink(@org.jetbrains.annotations.NotNull()
        okio.Sink delegate) {
            super(null);
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @java.lang.Override()
        public void write(@org.jetbrains.annotations.NotNull()
        okio.Buffer source, long byteCount) throws java.io.IOException {
        }
    }
}