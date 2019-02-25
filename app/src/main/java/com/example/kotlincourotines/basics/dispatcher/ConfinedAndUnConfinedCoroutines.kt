import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        // not confined -- will work with main thread
        println("thread ${Thread.currentThread().name}")
        delay(500)
        println("thread ${Thread.currentThread().name}")

        delay(500)
        println("thread ${Thread.currentThread().name}")

        delay(500)
        println("thread ${Thread.currentThread().name}")
    }
}