package pub.gll.onepeas.libbase.mqtt

class MqttOptions {
    /**
     * 连接地址
     */
    var broker :String =""

    /**
     * 连接质量
     */
    var qos:Int = 2

    /**
     * 默认发送发送消息到那个专题
     */
    var pushTopic:String = ""

    /**
     * 用户的uid-用于生成连接id
     */
    var uid:Long =0L

    /**
     * 订阅的专题列表，可订阅多个
     */
    var subTopic:List<String> = arrayListOf()

}