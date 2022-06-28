package pub.gll.onepeas.todo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import org.junit.Test

/**
 *
 * @author ningchuanqi
 * @version V1.0
 */
class CoroutineFlow03 {

    fun simpleFlow() = flow<Int> {
        for (i in 1..3) {
            println("Emitting $i")
            emit(i)
        }
    }

    @Test
    fun `test flow exception`() = runBlocking<Unit> {
        try {
            simpleFlow().collect { value ->
                println(value)
                check(value <= 1) { "Collected $value" }
            }
        } catch (e: Throwable) {
            println("Caught $e")
        }
    }


    @Test
    fun `test flow exception2`() = runBlocking<Unit> {
        /*flow {
            emit(1)
            throw ArithmeticException("Div 0")
        }.catch { e: Throwable -> println("Caught $e") }
                .flowOn(Dispatchers.IO)
                .collect { println(it) }*/

        flow {
            throw ArithmeticException("Div 0")
            emit(1)
        }.catch { e: Throwable ->
            println("Caught $e")
            emit(10)
        }.flowOn(Dispatchers.IO).collect { println(it) }

    }

    fun simpleFlow2() = (1..3).asFlow()

    fun simpleFlow3() = flow<Int> {
        emit(1)
        throw RuntimeException()
    }


    @Test
    fun `test flow complete in finally`() = runBlocking<Unit> {
        try {
            simpleFlow2().collect { println(it) }
        } finally {
            println("Done")
        }

    }

    @Test
    fun `test flow complete in onCompletion`() = runBlocking<Unit> {
        /*simpleFlow2()
                .onCompletion { println("Done") }
                .collect { println(it) }*/

        /*simpleFlow3()
                .onCompletion { exception ->
                    if (exception != null) println("Flow completed exceptionally")
                }
                .catch { exception -> println("Caught $exception") }
                .collect { println(it) }*/

        simpleFlow2()
                .onCompletion { exception ->
                    if (exception != null) println("Flow completed exceptionally")
                }
                .collect { value ->
                    println(value)
                    check(value <= 1) { "Collected $value" }
                }
    }

}