package pub.gll.onepeas.module.car.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lpub/gll/onepeas/module/car/remote/CarBrandService;", "", "fetchCarBrand", "Lpub/gll/onepeas/module/car/remote/Car;", "page", "", "maxResult", "appKey", "", "time", "(IILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ModuleCar_debug"})
public abstract interface CarBrandService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tpxh")
    public abstract java.lang.Object fetchCarBrand(@retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "maxResult")
    int maxResult, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appkey")
    java.lang.String appKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "time")
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super pub.gll.onepeas.module.car.remote.Car> continuation);
}