package pub.gll.libaptannotation



fun Any.log(message:String){
    println("className:${this::class.java.name} message:${message}")
}