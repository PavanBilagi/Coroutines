package com.example.kotlincourotines.basics.dispatcher

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val job = launch {

        GlobalScope.launch {
            println("Job 1 : I'm in Global scope")
            delay(1000)
            println("Job 1 : I won't be cancelled if parent got cancelled")

        }

        launch {
            println("Job 2:  I am childre of job")
            delay(1000)
            println("Job 2 : I'll not execute if parent got cancelled")
        }

    }
    delay(500)
    job.cancel()
    println("Job:  cancelled")
    delay(1000) // delay a second to see what happens
    println("main: Who has survived request cancellation?")
}