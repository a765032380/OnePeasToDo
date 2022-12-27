package pub.gll.onepeas.module.car.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lpub/gll/onepeas/module/car/activity/CarActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mCarBrandAdapter", "Lpub/gll/onepeas/module/car/adapter/CarBrandAdapter;", "getMCarBrandAdapter", "()Lpub/gll/onepeas/module/car/adapter/CarBrandAdapter;", "mCarBrandAdapter$delegate", "Lkotlin/Lazy;", "mViewBinding", "Lpub/gll/onepeas/module/car/databinding/ActivityCarBinding;", "getMViewBinding", "()Lpub/gll/onepeas/module/car/databinding/ActivityCarBinding;", "mViewBinding$delegate", "mViewModel", "Lpub/gll/onepeas/module/car/viewmodel/CarBrandViewModel;", "getMViewModel", "()Lpub/gll/onepeas/module/car/viewmodel/CarBrandViewModel;", "setMViewModel", "(Lpub/gll/onepeas/module/car/viewmodel/CarBrandViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ModuleCar_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CarActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy mViewBinding$delegate = null;
    @javax.inject.Inject()
    public pub.gll.onepeas.module.car.viewmodel.CarBrandViewModel mViewModel;
    private final kotlin.Lazy mCarBrandAdapter$delegate = null;
    
    public CarActivity() {
        super();
    }
    
    private final pub.gll.onepeas.module.car.databinding.ActivityCarBinding getMViewBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.module.car.viewmodel.CarBrandViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.car.viewmodel.CarBrandViewModel p0) {
    }
    
    private final pub.gll.onepeas.module.car.adapter.CarBrandAdapter getMCarBrandAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}