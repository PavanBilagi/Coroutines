package com.example.kotlincourotines.basics.cancellationandtimeouts

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val job = launch {
        repeat(1000) {
            delay(300L)
            println("I am sleeping $it")
        }
    }

    delay(2000L)//delay a bit
    println("I am tired of printing ")
    job.cancelAndJoin()
   /* job.cancel() //cancel the job
    job.join() // wait until child coroutine completes
    println("Now I can quit.")*/


}