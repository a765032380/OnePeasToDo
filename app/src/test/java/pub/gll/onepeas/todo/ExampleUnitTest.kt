package pub.gll.onepeas.todo

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import org.junit.Test

import org.junit.Assert.*
import org.koin.ext.scope
import kotlin.system.measureTimeMillis
import kotlin.time.measureTimedValue

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun `test coroutine join`() = runBlocking{
        val job1 = launch {
            delay(2000)
            println("One")
        }
        job1.join()
        val job2 = launch {
            delay(200)
            println("Two")
        }
        val job3 = launch {
            delay(200)
            println("Three")
        }
    }

    @Test
    fun `test coroutine await`() = runBlocking{
        val job1 = async {
            delay(2000)
            println("One")
        }
        job1.await()
        val job2 = async {
            delay(200)
            println("Two")
        }
        val job3 = async {
            delay(200)
            println("Three")
        }
    }

    @Test
    fun `test sync`() = runBlocking{
        //统计执行时常
        val res = measureTimeMillis {
            val one = doOne()
            val two = doTwo()
            println("The res = ${one + two}")
        }
        println("时间：${res}")
    }
    @Test
    fun `test combine async`() = runBlocking{
        //统计执行时常
        val res = measureTimeMillis {
            //async 结构化并发
            val one = async { doOne() }
            val two = async { doTwo() }
            println("The res = ${one.await() + two.await()}")
        }
        println("时间：${res}")
    }
    private suspend fun doOne():Int{
        delay(1000)
        return 14
    }

    private suspend fun doTwo():Int{
        delay(3000)
        return 25
    }

    /**
     * 启动模式
     */
    @Test
    fun `test start mode`() = runBlocking {
        val job = launch(start = CoroutineStart.UNDISPATCHED) {
            println("Thread:${Thread.currentThread()}")
            delay(10000)
            println("Thread:${Thread.currentThread()}")
        }

//        delay(1000)
//        job.cancel()
    }

    @Test
    fun `test scope cancel`() = runBlocking {
        val scope  = CoroutineScope(Dispatchers.Default)
        scope.launch {
            delay(1000)
            println("----")
        }
        scope.launch {
            delay(1000)
            println("----")
        }
        delay(2000)
    }
    private fun event() = (1..12).asFlow()
        .onEach { delay(100) }
        .flowOn(Dispatchers.Default)

    @Test
    fun `test scope flow`() = runBlocking {
        event().onEach {
            println("it=$it")
        }.launchIn(CoroutineScope(Dispatchers.IO))
            .join()
    }



}