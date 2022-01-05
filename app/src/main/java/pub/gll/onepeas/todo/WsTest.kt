package pub.gll.onepeas.todo

import com.google.gson.Gson
import org.eclipse.paho.client.mqttv3.MqttMessage
import pub.gll.onepeas.todo.Code.CLOSE
import pub.gll.onepeas.todo.Code.CLOSE_RECEIVED
import pub.gll.onepeas.todo.Code.NOT_ONLINE
import pub.gll.onepeas.todo.Code.ONLINE
import pub.gll.onepeas.todo.Code.OPEN
import pub.gll.onepeas.todo.Code.OPEN_RECEIVED
import pub.gll.onepeas.todo.Code.PROGRESS
import pub.gll.onepeas.todo.Code.PROGRESS_RECEIVED


object Code{
    const val NOT_ONLINE = 0//询问当前设备是否在线
    const val ONLINE = 1//设备在线

    const val OPEN = 2//开
    const val OPEN_RECEIVED = 3//开的回调

    const val CLOSE = 4//开
    const val CLOSE_RECEIVED = 5//开的回调

    const val PROGRESS = 6//设置旋转角度
    const val PROGRESS_RECEIVED = 7//旋转角度的回调
}

fun main(args: Array<String>) {
    val gson = Gson()
    MqttClientUtil.mqttClient{ topic: String, mqttMessage: MqttMessage ->
        println(topic)
        try {
            val instructions = gson.fromJson(String(mqttMessage.payload),Instructions::class.java)
            when(instructions.code){
                OPEN->{
                    openReceived()
                }
                CLOSE->{
                    closeReceived()
                }
                NOT_ONLINE->{
                    online()
                }
                PROGRESS->{
                    publishSeekReceived(instructions.content)
                }
            }
        }catch (e:Exception){

        }

    }
    MqttClientUtil.subscribe()
}

private fun online(){
    MqttClientUtil.publish(Gson().toJson(Instructions(ONLINE,45)))
}
private fun openReceived(){
    MqttClientUtil.publish(Gson().toJson(Instructions(OPEN_RECEIVED,45)))
}
private fun publishSeekReceived(seek: Int){
    MqttClientUtil.publish(Gson().toJson(Instructions(PROGRESS_RECEIVED,seek)))
}

private fun closeReceived(){
    MqttClientUtil.publish(Gson().toJson(Instructions(CLOSE_RECEIVED,45)))
}



data class Instructions(val code:Int,val content:Int)
