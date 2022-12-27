package pub.gll.onepeas.module.account;

import java.lang.System;

/**
 * 网络请求接口
 * 注意：接口前无需加斜杠
 * create by Mqz at 4/19
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lpub/gll/onepeas/module/account/HttpService;", "", "login", "Lpub/gll/onepeas/libbase/di/http/result/BasicBean;", "Lpub/gll/onepeas/libbase/util/UserInfo;", "phone", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFriend", "Lpub/gll/onepeas/libbase/net/NetworkResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "select", "uuid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "body", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userInfo", "ModuleAccount_debug"})
public abstract interface HttpService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/login")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "phone")
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super pub.gll.onepeas.libbase.di.http.result.BasicBean<pub.gll.onepeas.libbase.util.UserInfo>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/select")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object select(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "uuid")
    java.lang.String uuid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super pub.gll.onepeas.libbase.di.http.result.BasicBean<pub.gll.onepeas.libbase.util.UserInfo>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/user_info")
    public abstract java.lang.Object userInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super pub.gll.onepeas.libbase.di.http.result.BasicBean<pub.gll.onepeas.libbase.util.UserInfo>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "user/update")
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.Map<java.lang.String, java.lang.String> body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super pub.gll.onepeas.libbase.di.http.result.BasicBean<pub.gll.onepeas.libbase.util.UserInfo>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/friend/list")
    public abstract java.lang.Object requestFriend(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super pub.gll.onepeas.libbase.net.NetworkResult<java.lang.Object>> continuation);
}