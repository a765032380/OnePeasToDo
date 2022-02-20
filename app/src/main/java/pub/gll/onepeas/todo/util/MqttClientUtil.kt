package pub.gll.onepeas.todo.util

import android.util.Log
import com.google.gson.Gson
import pub.gll.onepeas.todo.util.MqttClientUtil.TAG
import org.eclipse.paho.client.mqttv3.*
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence
import pub.gll.onepeas.todo.test.Instructions
import kotlin.system.exitProcess

object MqttClientUtil {
    const val TAG = "MqttClientUtil"

    private const val TOPIC = "lottopic_gll"
    fun pubTopic():String{
        return PUB_TOPIC + CacheUtil.getUID()//这里需要加上UserId
    }
    private val persistence = MemoryPersistence()
    //订阅专题
    private const val SUB_TOPIC = "$TOPIC/#"
    //发送时带的专题 需要加上userId
    private const val PUB_TOPIC = "$TOPIC/"
    //连接质量
    private const val QOS = 2
    //连接地址
    private const val BROKER = "ws://gll.pub:8083"
    //客户端id
    private val CLIENT_ID : String by lazy { "lot_zyf_"+CacheUtil.getUID() }
    private val client :MqttClient by lazy {
        MqttClient(BROKER, CLIENT_ID, persistence)
    }

    private fun options():MqttConnectOptions{
        val connOpts = MqttConnectOptions()
        connOpts.userName = "lot"+CacheUtil.getUID()
        connOpts.password = "lot_password".toCharArray()
        // 保留会话
        connOpts.isCleanSession = true
        return connOpts
    }
    fun isConnected() = client.isConnected


    fun mqttClient(onMessageCallback: (topic: String, message: MqttMessage)->Unit){
        try {
            // MQTT 连接选项
            // 设置回调
            client.setCallback(MessageCallback(onMessageCallback))
            // 建立连接
            Log.e(TAG,"Connecting to broker: $BROKER")
            client.connect(options())
            subscribe()
            Log.e(TAG,"Connected")
        } catch (me: MqttException) {
            Log.e(TAG,"reason " + me.reasonCode)
            Log.e(TAG,"msg " + me.message)
            Log.e(TAG,"loc " + me.localizedMessage)
            Log.e(TAG,"cause " + me.cause)
            Log.e(TAG,"excep $me")
            me.printStackTrace()
        }
    }

    fun reClient(){
        try {
            client.connect(options())
            subscribe()
            Log.e(TAG,"reConnected")
        }catch (e:Exception){
            Thread.sleep(200)
            reClient()
        }
    }

    fun disconnect(){
        client.disconnect()
        Log.e(TAG,"Disconnected")
        client.close()
        exitProcess(0)
    }

    fun subscribe(){
        // 订阅
        client.subscribe(SUB_TOPIC)
    }
    fun publish(instructions: Instructions){
        publish(Gson().toJson(instructions))
    }
    fun publishEnd(end: Int){
        publish(Gson().toJson(Instructions(0,0, end)))
    }
    fun publishStart2End(start:Int,end: Int){
        publish(Gson().toJson(Instructions(1,start, end)))
    }

    fun publish(content:String){
        try {
            Log.e(TAG,"Publishing message: $content")
            // 消息发布所需参数
            val message = MqttMessage(content.toByteArray())
            message.qos = QOS
            client.publish(pubTopic(), message)
            Log.e(TAG,"Message published")
        }catch (e:Exception){
            showToast("发送失败")
            reClient()
        }
    }
}

class MessageCallback(private val onMessageCallback: (topic: String, message: MqttMessage)->Unit) : MqttCallback {
    override fun connectionLost(cause: Throwable) {
        // 连接丢失后，一般在这里面进行重连
        Log.e(TAG,"连接断开，可以做重连")
//        MqttClientUtil.reClient()
    }
    override fun messageArrived(topic: String, message: MqttMessage) {
        //如果这个专题是自己的，就移除掉
        if (MqttClientUtil.pubTopic() == topic){
            return
        }
        // subscribe后得到的消息会执行到这里面
        onMessageCallback.invoke(topic, message)
    }

    override fun deliveryComplete(token: IMqttDeliveryToken) {
        Log.e(TAG,"deliveryComplete---------" + token.isComplete)
    }
}
