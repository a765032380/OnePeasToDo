package pub.gll.onepeas.libbase.net.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a)\u0010\u0007\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u00a2\u0006\u0002\u0010\b\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u000f\u00a8\u0006\u0010"}, d2 = {"containMethodAnnotation", "", "T", "", "Lokhttp3/Request;", "annotationClass", "Ljava/lang/Class;", "getMethodAnnotation", "(Lokhttp3/Request;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "handle", "", "Lokhttp3/Request$Builder;", "isHandled", "writeToString", "", "Lokhttp3/RequestBody;", "LibBase_debug"})
public final class ReqeustExtKt {
    
    /**
     * 校验当前的请求是否被其他加解密拦截器处理了
     * @return Boolean 返回true说明被处理了，反之则没被处理
     */
    public static final boolean isHandled(@org.jetbrains.annotations.NotNull()
    okhttp3.Request $this$isHandled) {
        return false;
    }
    
    /**
     * 当前的网络请求被加解密拦截器处理后，添加一个标签，防止后续的拦截器继续处理
     */
    public static final void handle(@org.jetbrains.annotations.NotNull()
    okhttp3.Request.Builder $this$handle) {
    }
    
    /**
     * 返回某个Retrofit定义在方法上的注解，例如[POST],[GET]
     */
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.annotation.Annotation>T getMethodAnnotation(@org.jetbrains.annotations.NotNull()
    okhttp3.Request $this$getMethodAnnotation, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> annotationClass) {
        return null;
    }
    
    public static final <T extends java.lang.annotation.Annotation>boolean containMethodAnnotation(@org.jetbrains.annotations.NotNull()
    okhttp3.Request $this$containMethodAnnotation, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> annotationClass) {
        return false;
    }
    
    /**
     * 将请求体的字节流写入字符串
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public static final java.lang.String writeToString(@org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody $this$writeToString) throws java.io.IOException {
        return null;
    }
}