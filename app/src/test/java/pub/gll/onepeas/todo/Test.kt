package pub.gll.onepeas.todo

import java.io.*

fun main() {
    val list = arrayListOf<Int>(1, 3, 4, 5, 6, 7, 8, 34, 5)
    val result = list.sum {
        println("it=$it")
    }
    println("result=$result")

    val listString = arrayListOf<String>("1", "3", "4", "5")
    val result1 = listString.sumString()(2)
    println("result=$result1")
    testClosure(1)(2){
        println("testClosure=$it")
    }
    test11()
}

/**
 * IO相关的
 */
fun io(){
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


/**
 * 解构
 */

data class Result(val message:String,val code:Int)
fun test11(){
    val result = Result("success",200)
    val (message,code) = result
    println("message=$message code=$code")
}


fun testClosure(v1:Int):(v2:Int,printer:(Int)->Unit)->Unit{
    return fun (v2:Int,printer:(Int)->Unit){
        printer(v1+v2)
    }
}



fun List<String>.sumString(): (score: Int) -> Float {
    println("这是第一层")
    return fun(score: Int): Float {
        var result = 0f
        this.forEach {
            result += it.toInt() * score
        }
        return result
    }
}


fun List<Int>.sum(callback: (Int) -> Unit): Int {
    var result = 0
    this.forEach {
        result += it
        callback(it)
    }
    return result
}


interface A{
    fun a(){

    }
}
interface B{
    fun a(){

    }
}

class T:A,B{
    override fun a() {
        super<A>.a()
        super<B>.a()
    }
}

