package com.example.kotlincourotines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

 suspend fun main() {
    GlobalScope.launch {
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }

    println("Hello")
    //delay(2000L) // delay for JVM to keep alive for seconds

   /* runBlocking {
        delay(2000L) // delay for JVM to keep alive for seconds
    }*/
}