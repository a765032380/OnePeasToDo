package k03

import org.junit.Test

/*
fun main() {
    // 1.定义name集合
    val names = listOf("Zhangsan", "Lisi", "Wangwu")
    // 2.定义age集合
    val ages = listOf(20, 21, 22)
    // names.zip(ages).toMap().map { "you name:${it.key}, you age:${it.value}" }.map { println(it) }

    names.zip(ages).toMap().map { println("you name:${it.key}, you age:${it.value}") }
}*/
@Test
fun main() { // RxJava zip  合并两个集合   map变换每一个元素
    listOf("Zhangsan", "Lisi", "Wangwu").zip(listOf(20, 21, 22)).toMap().map { println("you name:${it.key}, you age:${it.value}") }

    // 可读性差了点  你是熟悉链式调用思维 很简单
}