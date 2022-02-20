package pub.gll.onepeas.todo.ui.wifi

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import pub.gll.onepeas.todo.airkiss.AirKissEncoder
import java.io.IOException
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress
import java.net.SocketException
import javax.inject.Inject

@HiltViewModel
class WifiVM @Inject constructor() : ViewModel() {
    private var sendJob:Job?=null
    private var receiveJob:Job?=null

    var wifiState = MutableStateFlow(true)


    fun sendWifi(ssid :String,password:String){
        val airKissEncoder = AirKissEncoder(ssid, password)
        var sendSocket: DatagramSocket? = null
        sendSocket = DatagramSocket()
        sendSocket.broadcast = true
        sendJob = viewModelScope.launch (Dispatchers.IO){
                val dummyData = ByteArray(1500)
                try {
                    while (isActive) {
                        val encodedData: IntArray = airKissEncoder.encodedData
                        for (i in encodedData.indices) {
                            if (isActive) {
                                val pkg = DatagramPacket(
                                    dummyData,
                                    encodedData[i],
                                    InetAddress.getByName("255.255.255.255"),
                                    10000
                                )
                                sendSocket.send(pkg)
                                Thread.sleep(4)
                            }
                        }
                        Log.e("LLLL", "send finish")
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.e("LLLL", "sendWifi-Exception")
                } finally {
                    Log.e("LLLL", "sendWifi-finally")
                    sendSocket?.close()
                    sendSocket?.disconnect()
                }
            }
        startReceive(airKissEncoder)
    }
    fun startReceive(airKissEncoder:AirKissEncoder){

        val buffer = ByteArray(15000)
        var udpServerSocket: DatagramSocket? = null
        val mRandomChar = airKissEncoder.randomChar //获取UDP数据包中的随机字符

        udpServerSocket = DatagramSocket(10000)
        udpServerSocket.soTimeout = 1000 * 60 //设置超时时间

        val packet = DatagramPacket(buffer, buffer.size)
        receiveJob = viewModelScope.launch (Dispatchers.IO){

                try {
                    while (isActive) {
                        var replyByteCounter = 0
                        udpServerSocket.receive(packet)
                        val receivedData = packet.data
                        for (b in receivedData) {
                            Log.e("LLLLLL","b=${b}--------mRandomChar=$mRandomChar -----code=${mRandomChar.code}")
                            if (b == mRandomChar.code.toByte()) replyByteCounter++
                        }
//                        var hexString = Str_Hex.byte2hex(buffer)
//                        if (!TextUtils.isEmpty(hexString) && testStr == hexString) {
//                            Log.e("LLLLLL:", "hexString=$hexString")
//                        }
                        if (replyByteCounter > 5) {
                            Log.e("LLLLL", "success")
//                            break
                        }
                    }
                } catch (e: SocketException) {
                    e.printStackTrace()
                    Log.e("LLLL",e.message?:"")
                } catch (e: IOException) {
                    e.printStackTrace()
                    Log.e("LLLL",e.message?:"")
                } finally {
                    Log.e("LLLL","udpServerSocket.close()")
                    udpServerSocket?.close()
                    udpServerSocket?.disconnect()
                }
            }
    }

    fun stop(){
        viewModelScope.launch (Dispatchers.IO){
            receiveJob?.cancel()
            sendJob?.cancel()
            Log.e("LLLL","stop-cancel")
        }
    }

}