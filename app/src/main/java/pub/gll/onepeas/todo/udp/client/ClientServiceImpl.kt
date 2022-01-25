package pub.gll.onepeas.todo.udp.client

import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress


class ClientServiceImpl:IClientService {

    private lateinit var socket: DatagramSocket
    private lateinit var serverAddress: InetAddress

    override fun udpClient(ip: String, port: Int) {
        socket = DatagramSocket(port)
        serverAddress = InetAddress.getByName(ip)
    }

    override fun sendMessage(message: String, charsetName: String) {
        val data = message.toByteArray()
        val packet = DatagramPacket(data, data.size, serverAddress, socket.port)
        socket.send(packet)
    }

    override fun receiveMessage(charsetName: String): String {
        val data = byteArrayOf()
        val packet = DatagramPacket(data, data.size)
        socket.receive(packet)
        return String(packet.data, packet.offset, packet.length)
    }

    override fun close() {
        socket.close()
    }
}