package k03

import org.junit.Test

// 函数返回类型 (String, Int) -> String
fun study01() /*: (String, Int) -> String*/ = { name: String, age: Int ->
    true
    name
    age
    "我的姓名是:$name, 我的年龄是:$age"
}

// 函数返回函数，而这个函数是高阶函数
fun study02() = { lambdaAction : (Int, Int) -> String, studyInfo: String ->
    false
    '男'
    val lambdaAction = lambdaAction(10, 10)
    println("最后我组装的值是:$lambdaAction + $studyInfo")
}

fun study03() = { studyInfo: String, lambdaAction : (Int, Int) -> String ->
    false
    '男'
    val lambdaAction = lambdaAction(10, 10)
    println("最后我组装的值是:$lambdaAction + $studyInfo")
}

// study033 返回类型是什么  (String, Int) -> Boolean
fun study033() = { str: String, num: Int ->
    true
}

// study04 返回类型是什么 函数 (String, Int, (String)-> Unit, (Int)->Unit) -> Unit
fun study04() = {str: String, num: Int, lambda1: (String) -> Unit, lambda2 : (Int) -> Unit ->
    lambda1(str)
    lambda2(num)
}

fun <T1, T2, R1, R2> study05() = { str: T1, num: T2, lambda1 : (T1) -> R1, lambda2 : (T2) -> R2 ->
    println("调用了第一个lambda:${lambda1(str)}  ${if (lambda1(str) is Int) "你变换后是Int" else "你变换后不是Int"}")
    println("调用了第二个lambda:${lambda2(num)}")
}

// (String, Int, (Int)-> Unit) -> Unit
fun study06() : (String, Int, (Int)-> Unit) -> Unit = fun(str: String, num: Int, lambda: (Int) -> Unit) {
    str
    num
    true // fun{} 此{} 是函数体，不是我们前面的那种 lambda，所以没有明确指定，他就是Unit
}

// (String, Int, (Int)-> Unit) -> Int
fun study06s() = {str: String, num: Int, lambda: (Int) -> Int    ->  // -> == fun
    str
    num
    99
}
@Test
fun main() {
    println(study01()("Derry", 99))

    study02()({ number1, number2 ->
        "两数相加的结果是:${number1 + number2}"
    }, "李元霸")

    study03()("李元霸") {number1, number2 ->
        "两数相加的结果是:${number1 + number2}"
    }

    study04()("张三丰", 88, {
        println("第一个lambda的参数是:$it")
    }) {
        println("第二个lambda的参数是:$it")
    }

    println()

    // 输入String 返回Int == RxJava map 变换操作符
    study05<String, Int, Int, String>()("王五", 99, {
        // 变换操作：把String变成Int
        "值OK:$it".length
    }) {
        // 变换操作：把Int变成String
        "第二个lambda是:$it"
    }


}