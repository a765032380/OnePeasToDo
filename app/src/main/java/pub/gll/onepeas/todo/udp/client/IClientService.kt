package pub.gll.onepeas.todo.udp.client

interface IClientService {

    /**
     * 初始化对象
     *
     * @param ip 服务端ip
     * @param port 约定端口
     */
    public fun udpClient(ip:String ,port:Int)

    /**
     * 发送消息
     *
     * @param message 字符串消息
     * @param charsetName 字符集，如  TcpConfig.UTF_8 或 TcpConfig.GBK,为null时采用编译器默认字符集
     */
    public fun sendMessage(message:String ,charsetName:String)

    /***
     * 接收消息
     *
     * @param charsetName 字符集，如  TcpConfig.UTF_8 或 TcpConfig.GBK,为null时采用编译器默认字符集
     * @return 收到的消息
     */
    public fun  receiveMessage(charsetName:String):String

    /**关闭客户端数据报文**/
    public fun close()
}