package k01

import org.junit.Test

@Test
fun main() {
    "李连杰".toast()

    "AAA".toast()
    val age : Int = 18
    age.toast()

    // 是所有类型 都可以
    'A'.toast()

    // 可以给android   View的源码， 加扩展函数吗
    /*View.xxx
    ViewGoup.xxx*/
}

// Java 的函数 先有输出 在有输入
// public Object k01.getStudent(String name)

// KT 的函数 先有输入 在有输出 合理
public fun getStudent(name: String) : Any? {

    return null
}