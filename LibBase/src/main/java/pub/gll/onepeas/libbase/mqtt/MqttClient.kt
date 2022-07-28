package pub.gll.onepeas.libbase.mqtt

import android.util.Log
import org.eclipse.paho.client.mqttv3.*
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence

internal object MqttClient {
    private const val TAG = "MqttClientUtil"

    private val persistence = MemoryPersistence()
    private var mMqttOptions: MqttOptions?=null

    private val client :MqttAsyncClient by lazy {
        MqttAsyncClient(mMqttOptions?.broker, "Client_${mMqttOptions?.uid}", persistence)
    }

    /**
     * 获取最终发送消息的专题
     */
    private fun pubTopic():String{
        return "${mMqttOptions?.pushTopic}/${mMqttOptions?.uid}"//这里需要加上UserId
    }

    private fun options(): MqttConnectOptions {
        val connOpts = MqttConnectOptions()
        connOpts.userName = "lot"+ mMqttOptions?.uid
        connOpts.password = "lot_password".toCharArray()
        // 保留会话
        connOpts.isCleanSession = true
        return connOpts
    }
    fun isConnected() = client.isConnected


    fun mqttClient(mqttOptions: MqttOptions){
        if (mqttOptions.uid==0L){
            MqttManager.notifyGoLoginListener()
            return
        }
        if (mMqttOptions !=null){
            disconnect()
        }
        mMqttOptions = mqttOptions
        MqttManager.notifyClintStateListener(ClientState.ConnectedStart)
        try {
            // MQTT 连接选项
            // 设置回调
            client.setCallback(MMqttCallback())
            // 建立连接
            Log.e(TAG,"Connecting to broker: ${mMqttOptions?.broker}")
            client.connect(options(), "${mMqttOptions?.uid}",object :IMqttActionListener{
                override fun onSuccess(asyncActionToken: IMqttToken?) {
                    mqttOptions.subTopic.forEach {
                        client.subscribe(it, mqttOptions.qos)
                    }
                    Log.e(TAG,"Connected")
                    MqttManager.notifyClintStateListener(ClientState.ConnectedSuccess)
                }

                override fun onFailure(asyncActionToken: IMqttToken?, exception: Throwable?) {
                    MqttManager.notifyClintStateListener(ClientState.ConnectedFail)
                }
            })
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
            Log.e(TAG,"reConnected")
        }catch (e:Exception){
            Thread.sleep(200)
            reClient()
        }
    }

    fun disconnect(){
        try{
            mMqttOptions = null
            client.disconnect()
            Log.e(TAG,"Disconnected")
            client.close()
        }catch(e:Exception){

        }
    }


    fun publish(content:String,pubTopic:String = pubTopic()){
        if (mMqttOptions?.uid==0L){
            MqttManager.notifyGoLoginListener()
            return
        }
        try {
            Log.e(TAG,"Publishing message: $content")
            // 消息发布所需参数
            val message = MqttMessage(content.toByteArray())
            message.qos = mMqttOptions?.qos?:2
            client.publish(pubTopic, message)
            Log.e(TAG,"Message published")
        }catch (e:Exception){
            reClient()
        }
    }
}
class MMqttCallback:MqttCallback{
    override fun connectionLost(cause: Throwable?) {
        MqttClient.reClient()
    }

    override fun messageArrived(topic: String?, message: MqttMessage?) {
        topic?:return
        message?:return
        MqttManager.notifyMessageListener(topic, message)
    }

    override fun deliveryComplete(token: IMqttDeliveryToken?) {
    }

}
