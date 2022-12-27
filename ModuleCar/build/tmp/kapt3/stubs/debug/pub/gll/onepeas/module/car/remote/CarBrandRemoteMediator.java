package pub.gll.onepeas.module.car.remote;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ-\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lpub/gll/onepeas/module/car/remote/CarBrandRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lpub/gll/onepeas/module/car/db/CarBrandEntity;", "api", "Lpub/gll/onepeas/module/car/remote/CarBrandService;", "db", "Lpub/gll/onepeas/module/car/db/AppDatabase;", "(Lpub/gll/onepeas/module/car/remote/CarBrandService;Lpub/gll/onepeas/module/car/db/AppDatabase;)V", "getApi", "()Lpub/gll/onepeas/module/car/remote/CarBrandService;", "getDb", "()Lpub/gll/onepeas/module/car/db/AppDatabase;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "loadType", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ModuleCar_debug"})
public final class CarBrandRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, pub.gll.onepeas.module.car.db.CarBrandEntity> {
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.onepeas.module.car.remote.CarBrandService api = null;
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.onepeas.module.car.db.AppDatabase db = null;
    
    public CarBrandRemoteMediator(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.car.remote.CarBrandService api, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.car.db.AppDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.module.car.remote.CarBrandService getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.module.car.db.AppDatabase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, pub.gll.onepeas.module.car.db.CarBrandEntity> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
}