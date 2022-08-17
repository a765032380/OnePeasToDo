package pub.gll.module.algorithm

import org.junit.Test




@Test
fun main() {
    println("-------")
    println(fib2(1))
    println(fib2(2))
    println(fib2(3))
    println(fib2(4))
    println(fib2(5))
    println(fib2(70))

}
/**
 * 求第N个斐波那契数
 * 斐波那契数-新的数是前两个数之和
 * 0 1 1 2 3 5 8 13 21 34 ....
 */
//效率非常低 O(2^n)
fun fib(n:Int):Int{
    if (n<=1)return n
    return fib(n-1)+ fib(n-2)
}
//效率高
fun fib2(n:Int):Int{
    if (n<=1)return n
    var first = 0
    var second = 1
    for (i in 0 until  n-1){
        val sum = first+second
        first = second
        second = sum
    }
    return second
}