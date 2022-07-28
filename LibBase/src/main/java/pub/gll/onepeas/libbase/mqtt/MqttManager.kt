package pub.gll.onepeas.libbase.mqtt

import org.eclipse.paho.client.mqttv3.MqttMessage

object MqttManager {
    private val mMqttListenerList = arrayListOf<MqttListener>()

    fun registerMqttListener(messageCallback: MqttListener){
        mMqttListenerList.add(messageCallback)
    }
    fun unRegisterMqttListener(messageCallback: MqttListener){
        mMqttListenerList.remove(messageCallback)
    }
    internal fun notifyMessageListener(topic: String, message: MqttMessage){
        val messageStr = String(message.payload)
        mMqttListenerList.forEach {
            it.onMessage(topic, messageStr)
        }
    }
    internal fun notifyClintStateListener(clientState: ClientState){
        mMqttListenerList.forEach {
            it.onClientState(clientState)
        }
    }
    internal fun notifyGoLoginListener(){
        mMqttListenerList.forEach {
            it.goLogin()
        }
    }

    /**
     * 连接
     */
    fun client(mqttOptions: MqttOptions){
        MqttClient.mqttClient(mqttOptions)
    }

    /**
     * 重新连接
     */
    fun reClient(){
        MqttClient.reClient()
    }

    /**
     * 断开连接
     */
    fun disconnect(){
        MqttClient.disconnect()
    }

    /**
     * 判断是否是在连接状态
     */
    fun isConnected() = MqttClient.isConnected()


    /**
     * 发送数据
     * [str] 发送的数据内容
     * [pubTopic] 发送到那个专题上，可以不传，不传走默认的
     */
    fun publish(str:String,pubTopic:String?=null){
        if (pubTopic==null){
            MqttClient.publish(str)
        }else{
            MqttClient.publish(str, pubTopic)
        }
    }
}