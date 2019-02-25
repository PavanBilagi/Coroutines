package com.example.kotlincourotines.basics

import kotlinx.coroutines.*

fun main() = runBlocking { // this: CoroutineScope
    launch /*(Dispatchers.Default)*/ {
        delay(200L)
        println("${Thread.currentThread().name}: ${Thread.currentThread().name}")
        println("Task from runBlocking")
    }

    coroutineScope { // Creates a new coroutine scope
        println("${Thread.currentThread().name}")
        launch {
            delay(500L)
            println("Task from nested launch : ${Thread.currentThread().name}")

        }

        delay(100L)
        println("Task from coroutine scope: ${Thread.currentThread().name}") // This line will be printed before nested launch
    }
    println("Coroutine scope is over :${Thread.currentThread().name}") // This line is not printed until nested launch completes
}