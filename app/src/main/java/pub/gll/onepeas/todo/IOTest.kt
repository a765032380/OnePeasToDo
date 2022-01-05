package pub.gll.onepeas.todo

import java.io.*


fun main() {
    val file = File("./app/src/main/java/pub/gll/onepeas/todo/Auto.kt")
    //写数据
    val outputStream = DataOutputStream(
        BufferedOutputStream(
            FileOutputStream(file)
        )
    )
    val fileContext = "package pub.gll.onepeas.todo\n" +
            "\n" +
            "data class Auto(val a:String)"
    outputStream.write(fileContext.toByteArray())
//    outputStream.writeBoolean(true)
//    outputStream.writeUTF("ssss今天")
//    outputStream.writeInt(222)
//    outputStream.writeDouble(222.4)
//    outputStream.writeLong(20000002L)
    outputStream.close()

    //读数据
    val inputStream  = DataInputStream(
        BufferedInputStream(
            FileInputStream(file)
        )
    )
//    println(inputStream.read())
//    println(inputStream.readBoolean())
//    println(inputStream.readUTF())
//    println(inputStream.readInt())
//    println(inputStream.readDouble())
//    println(inputStream.readLong())
    inputStream.close()

}