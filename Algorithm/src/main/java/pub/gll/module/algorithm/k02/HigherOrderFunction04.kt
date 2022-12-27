package k02

import org.junit.Test

// TODO 高阶函数第二版 常用的登录
@Test
fun main() {
    loginEngine("Derry", "123456") {
        if (it) println("最终登录的结果是：登录成功") else println("最终登录的结果是：失败")
    }
}

private fun loginEngine(userName: String, userPwd: String, responseResult: (Boolean) -> Unit) {
    if (userName == "Derry" && userPwd == "123456") {
        responseResult(true)
    } else {
        responseResult(false)
    }
}
