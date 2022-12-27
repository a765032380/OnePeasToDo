package pub.gll.onepeas.libbase.mqtt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u00a2\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\b\u0012J\u001d\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\b\u0018J\u001a\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lpub/gll/onepeas/libbase/mqtt/MqttManager;", "", "()V", "mMqttListenerList", "Ljava/util/ArrayList;", "Lpub/gll/onepeas/libbase/mqtt/MqttListener;", "client", "", "mqttOptions", "Lpub/gll/onepeas/libbase/mqtt/MqttOptions;", "disconnect", "isConnected", "", "notifyClintStateListener", "clientState", "Lpub/gll/onepeas/libbase/mqtt/ClientState;", "notifyClintStateListener$LibBase_debug", "notifyGoLoginListener", "notifyGoLoginListener$LibBase_debug", "notifyMessageListener", "topic", "", "message", "Lorg/eclipse/paho/client/mqttv3/MqttMessage;", "notifyMessageListener$LibBase_debug", "publish", "str", "pubTopic", "reClient", "registerMqttListener", "messageCallback", "unRegisterMqttListener", "LibBase_debug"})
public final class MqttManager {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.mqtt.MqttManager INSTANCE = null;
    private static final java.util.ArrayList<pub.gll.onepeas.libbase.mqtt.MqttListener> mMqttListenerList = null;
    
    private MqttManager() {
        super();
    }
    
    public final void registerMqttListener(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.mqtt.MqttListener messageCallback) {
    }
    
    public final void unRegisterMqttListener(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.mqtt.MqttListener messageCallback) {
    }
    
    public final void notifyMessageListener$LibBase_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    org.eclipse.paho.client.mqttv3.MqttMessage message) {
    }
    
    public final void notifyClintStateListener$LibBase_debug(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.mqtt.ClientState clientState) {
    }
    
    public final void notifyGoLoginListener$LibBase_debug() {
    }
    
    /**
     * 连接
     */
    public final void client(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.mqtt.MqttOptions mqttOptions) {
    }
    
    /**
     * 重新连接
     */
    public final void reClient() {
    }
    
    /**
     * 断开连接
     */
    public final void disconnect() {
    }
    
    /**
     * 判断是否是在连接状态
     */
    public final boolean isConnected() {
        return false;
    }
    
    /**
     * 发送数据
     * [str] 发送的数据内容
     * [pubTopic] 发送到那个专题上，可以不传，不传走默认的
     */
    public final void publish(@org.jetbrains.annotations.NotNull()
    java.lang.String str, @org.jetbrains.annotations.Nullable()
    java.lang.String pubTopic) {
    }
}