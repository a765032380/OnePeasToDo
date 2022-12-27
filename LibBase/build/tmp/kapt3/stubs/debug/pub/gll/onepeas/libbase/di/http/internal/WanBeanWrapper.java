package pub.gll.onepeas.libbase.di.http.internal;

import java.lang.System;

/**
 * 带壳的相应bean
 * @param T data实体类
 * @property data T 报文中对应data的部分
 * @property errorCode Int 报文中对应errorCode的部分
 * @property errorMsg String 报文中对应errorMsg的部分
 * @constructor
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB!\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/internal/WanBeanWrapper;", "T", "", "data", "errorCode", "", "errorMsg", "", "(Ljava/lang/Object;ILjava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorCode", "()I", "getErrorMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;ILjava/lang/String;)Lpub/gll/onepeas/libbase/di/http/internal/WanBeanWrapper;", "equals", "", "other", "hashCode", "isLoginError", "isSuccessful", "toString", "Companion", "LibBase_debug"})
public final class WanBeanWrapper<T extends java.lang.Object> {
    private final T data = null;
    private final int errorCode = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String errorMsg = null;
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.di.http.internal.WanBeanWrapper.Companion Companion = null;
    public static final int SUCCESS_CODE = 0;
    public static final int LOGIN_ERROR_CODE = -1001;
    
    /**
     * 带壳的相应bean
     * @param T data实体类
     * @property data T 报文中对应data的部分
     * @property errorCode Int 报文中对应errorCode的部分
     * @property errorMsg String 报文中对应errorMsg的部分
     * @constructor
     */
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.libbase.di.http.internal.WanBeanWrapper<T> copy(T data, int errorCode, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMsg) {
        return null;
    }
    
    /**
     * 带壳的相应bean
     * @param T data实体类
     * @property data T 报文中对应data的部分
     * @property errorCode Int 报文中对应errorCode的部分
     * @property errorMsg String 报文中对应errorMsg的部分
     * @constructor
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * 带壳的相应bean
     * @param T data实体类
     * @property data T 报文中对应data的部分
     * @property errorCode Int 报文中对应errorCode的部分
     * @property errorMsg String 报文中对应errorMsg的部分
     * @constructor
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 带壳的相应bean
     * @param T data实体类
     * @property data T 报文中对应data的部分
     * @property errorCode Int 报文中对应errorCode的部分
     * @property errorMsg String 报文中对应errorMsg的部分
     * @constructor
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WanBeanWrapper(T data, int errorCode, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMsg) {
        super();
    }
    
    public final T component1() {
        return null;
    }
    
    public final T getData() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getErrorCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMsg() {
        return null;
    }
    
    /**
     * 请求是否成功
     * @return Boolean true:成功
     */
    public final boolean isSuccessful() {
        return false;
    }
    
    /**
     * 登陆失败
     * @return Boolean true:登陆失败
     */
    public final boolean isLoginError() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/internal/WanBeanWrapper$Companion;", "", "()V", "LOGIN_ERROR_CODE", "", "SUCCESS_CODE", "LibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}