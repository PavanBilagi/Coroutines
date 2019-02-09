package com.example.kotlincourotines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {

    val job = GlobalScope.launch {
        delay(1000L)
        println("world")
    }
    println("Hello")

    job.join()
}