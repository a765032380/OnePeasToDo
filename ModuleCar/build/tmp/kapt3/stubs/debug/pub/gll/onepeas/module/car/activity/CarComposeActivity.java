package pub.gll.onepeas.module.car.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0015R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lpub/gll/onepeas/module/car/activity/CarComposeActivity;", "Lpub/gll/onepeas/libbase/activity/BaseActivity;", "()V", "mViewModel", "Lpub/gll/onepeas/module/car/viewmodel/CarBrandViewModel;", "getMViewModel", "()Lpub/gll/onepeas/module/car/viewmodel/CarBrandViewModel;", "setMViewModel", "(Lpub/gll/onepeas/module/car/viewmodel/CarBrandViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ModuleCar_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CarComposeActivity extends pub.gll.onepeas.libbase.activity.BaseActivity {
    @javax.inject.Inject()
    public pub.gll.onepeas.module.car.viewmodel.CarBrandViewModel mViewModel;
    
    public CarComposeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.module.car.viewmodel.CarBrandViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.car.viewmodel.CarBrandViewModel p0) {
    }
    
    @android.annotation.SuppressLint(value = {"UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter"})
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}