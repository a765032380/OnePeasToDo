package pub.gll.onepeas.libbase.mqtt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lpub/gll/onepeas/libbase/mqtt/MqttClient;", "", "()V", "TAG", "", "client", "Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;", "getClient", "()Lorg/eclipse/paho/client/mqttv3/MqttAsyncClient;", "client$delegate", "Lkotlin/Lazy;", "mMqttOptions", "Lpub/gll/onepeas/libbase/mqtt/MqttOptions;", "persistence", "Lorg/eclipse/paho/client/mqttv3/persist/MemoryPersistence;", "disconnect", "", "isConnected", "", "mqttClient", "mqttOptions", "options", "Lorg/eclipse/paho/client/mqttv3/MqttConnectOptions;", "pubTopic", "publish", "content", "reClient", "LibBase_debug"})
public final class MqttClient {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.mqtt.MqttClient INSTANCE = null;
    private static final java.lang.String TAG = "MqttClientUtil";
    private static final org.eclipse.paho.client.mqttv3.persist.MemoryPersistence persistence = null;
    private static pub.gll.onepeas.libbase.mqtt.MqttOptions mMqttOptions;
    private static final kotlin.Lazy client$delegate = null;
    
    private MqttClient() {
        super();
    }
    
    private final org.eclipse.paho.client.mqttv3.MqttAsyncClient getClient() {
        return null;
    }
    
    /**
     * 获取最终发送消息的专题
     */
    private final java.lang.String pubTopic() {
        return null;
    }
    
    private final org.eclipse.paho.client.mqttv3.MqttConnectOptions options() {
        return null;
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    public final void mqttClient(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.mqtt.MqttOptions mqttOptions) {
    }
    
    public final void reClient() {
    }
    
    public final void disconnect() {
    }
    
    public final void publish(@org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String pubTopic) {
    }
}