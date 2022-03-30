package pub.gll.onepeas.todo.util

import com.google.gson.Gson
import pub.gll.onepeas.libmqtt.MqttManager
import pub.gll.onepeas.libmqtt.MqttOptions
import pub.gll.onepeas.todo.test.Instructions

object MqttClientUtil {
    private const val TOPIC = "lottopic_gll_test"
    fun client(){
        MqttManager.client(MqttOptions().apply {
            broker = "ws://gll.pub:8083"
            pushTopic = TOPIC
            uid = 12
            subTopic = arrayListOf(TOPIC)
        })
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
        MqttManager.publish(content)
    }
}