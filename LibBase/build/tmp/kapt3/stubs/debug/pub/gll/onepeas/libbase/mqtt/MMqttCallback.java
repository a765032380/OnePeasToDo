package pub.gll.onepeas.libbase.mqtt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016\u00a8\u0006\u000f"}, d2 = {"Lpub/gll/onepeas/libbase/mqtt/MMqttCallback;", "Lorg/eclipse/paho/client/mqttv3/MqttCallback;", "()V", "connectionLost", "", "cause", "", "deliveryComplete", "token", "Lorg/eclipse/paho/client/mqttv3/IMqttDeliveryToken;", "messageArrived", "topic", "", "message", "Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "LibBase_debug"})
public final class MMqttCallback implements org.eclipse.paho.client.mqttv3.MqttCallback {
    
    public MMqttCallback() {
        super();
    }
    
    @java.lang.Override()
    public void connectionLost(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
    }
    
    @java.lang.Override()
    public void messageArrived(@org.jetbrains.annotations.Nullable()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.MqttMessage message) {
    }
    
    @java.lang.Override()
    public void deliveryComplete(@org.jetbrains.annotations.Nullable()
    org.eclipse.paho.client.mqttv3.IMqttDeliveryToken token) {
    }
}