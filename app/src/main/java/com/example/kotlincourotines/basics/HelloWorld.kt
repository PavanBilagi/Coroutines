package com.example.kotlincourotines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        // launch new coroutine in background and continue
//        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
        println("${Thread.currentThread().name}")

    }
    println("Hello,") // main thread continues while coroutine is delayed
   // Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}