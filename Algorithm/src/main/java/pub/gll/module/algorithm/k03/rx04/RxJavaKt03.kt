package k03.rx04

import org.junit.Test

// TODO KT精华 难度极高
@Test
fun main() {
    create {
        "Derry"
    }.map {
        length
    }.map {
        "内容的长度是:$this"
    }.map {
        "【$this】"
    }.consumer {
        println("消费:$this")
    }
}

class Helper<T>(var item : T)
fun <T, R> Helper<T>.map(action: T.() -> R) = Helper(action(item))
fun <T> Helper<T>.consumer(action: T.() -> Unit) = action(item)
fun <R> create(action: () -> R) = Helper(action())

// 21:35开始

// Glide Java写的       Coll（KT）

