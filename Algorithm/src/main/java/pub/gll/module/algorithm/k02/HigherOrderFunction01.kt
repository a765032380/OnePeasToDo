package k02

import org.junit.Test

// TODO 高阶函数入门 说白了：函数中有lambda就是属于高阶函数， 函数的函数就是高阶函数
@Test
fun main() {
    val r : String = show01(99) {
        println(it)
        "Derry it:$it"
    }
    println("结果：$r")

    // 三数相乘
    show02(1, 2, 3) { n1, n2, n3 ->
        println(n1 * n2 * n3)
    }

    // 三数相加
    show02(100, 100, 100) { n1, n2, n3 ->
        println(n1 + n2 + n3)
    }

    // 三数相除
    show02(1000, 2, 6) { n1, n2, n3 ->
        println(n1 / n2 / n3)
    }
}

// k02.show01 是什么类型的返回 String
fun show01(number: Int, lambda: (Int) -> String) /*: String*/ = lambda.invoke(number)

// 需求：三数相乘  三数相加 三数相除  由用户指定，我只定义规则（高阶函数）
fun show02(number1: Int, number2: Int, number3: Int, lambda:(Int, Int, Int) -> Unit) =
    lambda(number1, number2,number3)
