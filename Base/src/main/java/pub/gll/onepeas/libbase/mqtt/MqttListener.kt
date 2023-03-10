package pub.gll.onepeas.libbase.mqtt

interface MqttListener{
    fun onMessage(topic: String, message: String){}
    fun onClientState(clientState: ClientState){}
    fun goLogin(){}
}
enum class ClientState{
    ConnectedStart,//正在连接中
    ConnectedSuccess,//已连接
    ConnectedDisconnect,//已断开连接
    ConnectedFail,//连接失败
}