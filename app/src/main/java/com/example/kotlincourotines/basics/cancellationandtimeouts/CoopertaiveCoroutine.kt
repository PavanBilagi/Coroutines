package com.example.kotlincourotines.basics.cancellationandtimeouts

import kotlinx.coroutines.*

fun main() = runBlocking {

    val starTime = System.currentTimeMillis();

    val job = launch(Dispatchers.Default) {
        var nextTime = starTime
        var i = 0
        while (i < 5) {
            if (System.currentTimeMillis() >= nextTime) {
                println(" ${i++}")
                nextTime += 500
            }
        }
    }

    delay(1300)
    println("main: I'm tired of waiting!")
    job.cancelAndJoin()
    println("I quit ")

}