package pub.gll.onepeas.todo.udp.client

interface IClientService {

    /**
     * 初始化对象
     *
     * @param ip 服务端ip
     * @param port 约定端口
     */
    fun udpClient(ip:String ,port:Int)

    /**
     * 发送消息
     *
     * @param message 字符串消息
     */
    fun sendMessage(message:String )

    /***
     * 接收消息
     *
     * @return 收到的消息
     */
    fun receiveMessage():String

    /**关闭客户端数据报文**/
    fun close()
}