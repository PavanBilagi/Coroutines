package com.example.kotlincourotines.basics.cancellationandtimeouts

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val job = launch {

        try {
            repeat(1000) {
                println("$it")
                delay(500L)

            }
        } finally {
            println("I am running finally")

        }
    }
    delay(1300L)
    println("I am tired of waiting ")
    job.cancelAndJoin()
    println("main: Now I can quit.")

}