package pub.gll.onepeas.todo

import org.eclipse.paho.client.mqttv3.*
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence
import kotlin.system.exitProcess

object MqttClientUtil {
    fun pubTopic():String{
        return PUB_TOPIC//这里需要加上UserId
    }
    private val persistence = MemoryPersistence()
    //订阅专题
    private const val SUB_TOPIC = "testtopic/#"
    //发送时带的专题 需要加上userId
    private const val PUB_TOPIC = "testtopic/"
    //连接质量
    private const val QOS = 2
    //连接地址
    private const val BROKER = "ws://gll.pub:8083"
    //客户端id
    private const val CLIENT_ID = "emqx_test"
    private val client = MqttClient(BROKER, CLIENT_ID, persistence)

    private fun options():MqttConnectOptions{
        val connOpts = MqttConnectOptions()
        connOpts.userName = "emqx_test"
        connOpts.password = "emqx_test_password".toCharArray()
        // 保留会话
        connOpts.isCleanSession = true
        return connOpts
    }
    fun mqttClient(onMessageCallback: (topic: String, message: MqttMessage)->Unit){
        try {
            // MQTT 连接选项
            // 设置回调
            client.setCallback(MessageCallback(onMessageCallback))
            // 建立连接
            println("Connecting to broker: $BROKER")
            client.connect(options())
            println("Connected")
        } catch (me: MqttException) {
            println("reason " + me.reasonCode)
            println("msg " + me.message)
            println("loc " + me.localizedMessage)
            println("cause " + me.cause)
            println("excep $me")
            me.printStackTrace()
        }
    }

    fun reClient(){
        client.connect(options())
    }

    fun disconnect(){
        client.disconnect()
        println("Disconnected")
        client.close()
        exitProcess(0)
    }

    fun subscribe(){
        // 订阅
        client.subscribe(SUB_TOPIC)
    }

    fun publish(content:String){
        println("Publishing message: $content")
        // 消息发布所需参数
        val message = MqttMessage(content.toByteArray())
        message.qos = QOS
        client.publish(pubTopic(), message)
        println("Message published")
    }
}

class MessageCallback(private val onMessageCallback: (topic: String, message: MqttMessage)->Unit) : MqttCallback {
    override fun connectionLost(cause: Throwable) {
        // 连接丢失后，一般在这里面进行重连
        println("连接断开，可以做重连")
        MqttClientUtil.reClient()
    }

    @Throws(Exception::class)
    override fun messageArrived(topic: String, message: MqttMessage) {
        //如果这个专题是自己的，就移除掉
        if (MqttClientUtil.pubTopic() == topic){
            return
        }
        // subscribe后得到的消息会执行到这里面
        onMessageCallback.invoke(topic, message)
    }

    override fun deliveryComplete(token: IMqttDeliveryToken) {
        println("deliveryComplete---------" + token.isComplete)
    }
}
