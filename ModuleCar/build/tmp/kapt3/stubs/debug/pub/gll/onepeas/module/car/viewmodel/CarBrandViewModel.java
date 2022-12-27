package pub.gll.onepeas.module.car.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lpub/gll/onepeas/module/car/viewmodel/CarBrandViewModel;", "Landroidx/lifecycle/ViewModel;", "carBrandRepository", "Lpub/gll/onepeas/module/car/repository/Repository;", "(Lpub/gll/onepeas/module/car/repository/Repository;)V", "data", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Lpub/gll/onepeas/module/car/model/CarBrandItemModel;", "getData", "()Landroidx/lifecycle/LiveData;", "setData", "(Landroidx/lifecycle/LiveData;)V", "dataCompose", "Lkotlinx/coroutines/flow/Flow;", "getDataCompose", "()Lkotlinx/coroutines/flow/Flow;", "setDataCompose", "(Lkotlinx/coroutines/flow/Flow;)V", "ModuleCar_debug"})
public final class CarBrandViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.onepeas.module.car.model.CarBrandItemModel>> dataCompose;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<androidx.paging.PagingData<pub.gll.onepeas.module.car.model.CarBrandItemModel>> data;
    
    @javax.inject.Inject()
    public CarBrandViewModel(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.car.repository.Repository carBrandRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.onepeas.module.car.model.CarBrandItemModel>> getDataCompose() {
        return null;
    }
    
    public final void setDataCompose(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.onepeas.module.car.model.CarBrandItemModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagingData<pub.gll.onepeas.module.car.model.CarBrandItemModel>> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<androidx.paging.PagingData<pub.gll.onepeas.module.car.model.CarBrandItemModel>> p0) {
    }
}