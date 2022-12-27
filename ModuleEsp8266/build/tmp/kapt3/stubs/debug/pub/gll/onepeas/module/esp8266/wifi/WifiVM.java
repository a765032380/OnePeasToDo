package pub.gll.onepeas.module.esp8266.wifi;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lpub/gll/onepeas/module/esp8266/wifi/WifiVM;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "receiveJob", "Lkotlinx/coroutines/Job;", "sendJob", "wifiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getWifiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setWifiState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "sendWifi", "", "ssid", "password", "startReceive", "airKissEncoder", "Lpub/gll/onepeas/module/esp8266/airkiss/AirKissEncoder;", "stop", "ModuleEsp8266_debug"})
public final class WifiVM extends androidx.lifecycle.ViewModel {
    private final java.lang.String TAG = "WifiVM";
    private kotlinx.coroutines.Job sendJob;
    private kotlinx.coroutines.Job receiveJob;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> wifiState;
    
    @javax.inject.Inject()
    public WifiVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getWifiState() {
        return null;
    }
    
    public final void setWifiState(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> p0) {
    }
    
    public final void sendWifi(@org.jetbrains.annotations.NotNull()
    java.lang.String ssid, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final void startReceive(pub.gll.onepeas.module.esp8266.airkiss.AirKissEncoder airKissEncoder) {
    }
    
    public final void stop() {
    }
}