package pub.gll.onepeas.libbase.mqtt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lpub/gll/onepeas/libbase/mqtt/MqttListener;", "", "goLogin", "", "onClientState", "clientState", "Lpub/gll/onepeas/libbase/mqtt/ClientState;", "onMessage", "topic", "", "message", "LibBase_debug"})
public abstract interface MqttListener {
    
    public abstract void onMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void onClientState(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.mqtt.ClientState clientState);
    
    public abstract void goLogin();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void onMessage(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.mqtt.MqttListener $this, @org.jetbrains.annotations.NotNull()
        java.lang.String topic, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public static void onClientState(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.mqtt.MqttListener $this, @org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.mqtt.ClientState clientState) {
        }
        
        public static void goLogin(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.libbase.mqtt.MqttListener $this) {
        }
    }
}