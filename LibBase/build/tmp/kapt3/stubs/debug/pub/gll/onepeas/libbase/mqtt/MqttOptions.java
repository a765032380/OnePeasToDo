package pub.gll.onepeas.libbase.mqtt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2 = {"Lpub/gll/onepeas/libbase/mqtt/MqttOptions;", "", "()V", "broker", "", "getBroker", "()Ljava/lang/String;", "setBroker", "(Ljava/lang/String;)V", "pushTopic", "getPushTopic", "setPushTopic", "qos", "", "getQos", "()I", "setQos", "(I)V", "subTopic", "", "getSubTopic", "()Ljava/util/List;", "setSubTopic", "(Ljava/util/List;)V", "uid", "", "getUid", "()J", "setUid", "(J)V", "LibBase_debug"})
public final class MqttOptions {
    
    /**
     * 连接地址
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String broker = "";
    
    /**
     * 连接质量
     */
    private int qos = 2;
    
    /**
     * 默认发送发送消息到那个专题
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pushTopic = "";
    
    /**
     * 用户的uid-用于生成连接id
     */
    private long uid = 0L;
    
    /**
     * 订阅的专题列表，可订阅多个
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> subTopic;
    
    public MqttOptions() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBroker() {
        return null;
    }
    
    public final void setBroker(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getQos() {
        return 0;
    }
    
    public final void setQos(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPushTopic() {
        return null;
    }
    
    public final void setPushTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getUid() {
        return 0L;
    }
    
    public final void setUid(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSubTopic() {
        return null;
    }
    
    public final void setSubTopic(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
}