package pub.gll.onepeas.module.car.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\'J\u001f\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lpub/gll/onepeas/module/car/db/CarBrandDao;", "", "clearCarBrand", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCarBrand", "Landroidx/paging/PagingSource;", "", "Lpub/gll/onepeas/module/car/db/CarBrandEntity;", "insertCarBrand", "carBrandList", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ModuleCar_debug"})
public abstract interface CarBrandDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM CarBrandEntity")
    public abstract java.lang.Object clearCarBrand(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCarBrand(@org.jetbrains.annotations.NotNull()
    java.util.List<pub.gll.onepeas.module.car.db.CarBrandEntity> carBrandList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CarBrandEntity")
    public abstract androidx.paging.PagingSource<java.lang.Integer, pub.gll.onepeas.module.car.db.CarBrandEntity> getCarBrand();
}