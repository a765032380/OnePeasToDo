package pub.gll.onepeas.module.account;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0004"}, d2 = {"Lpub/gll/onepeas/module/account/VideoService;", "", "getlist", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ModuleAccount_debug"})
public abstract interface VideoService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/%E6%81%8B%E4%B8%8A%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95%28%E7%AC%AC%E4%B8%89%E5%AD%A3%29%E7%AD%89%E5%A4%9A%E4%B8%AA%E6%96%87%E4%BB%B6/%E6%81%8B%E4%B8%8A%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95%28%E7%AC%AC%E4%BA%8C%E5%AD%A3%29/1.%E8%A7%86%E9%A2%91/")
    public abstract java.lang.Object getlist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<java.lang.Object> continuation);
}