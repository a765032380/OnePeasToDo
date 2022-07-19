package pub.gll.onepeas.todo.test

import pub.gll.onepeas.todo.udp.client.ClientServiceImpl
import pub.gll.onepeas.libcore.util.NetCheckUtil

val mUdpClient = ClientServiceImpl()

fun main() {
    NetCheckUtil.getLocalIpAddress()?.let { mUdpClient.udpClient(it,4322) }
    test()
}


private fun test() {
    Thread{
        Thread.sleep(1000)
        mUdpClient.sendMessage("{\"code\":1,\"end\":94,\"start\":56}")
    }

}