package com.example.kotlincourotines.basics.exceptionhandling

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val job = GlobalScope.launch {
        println("Throwing exception from launch")
        throw IndexOutOfBoundsException() // Will be printed to the console by Thread.defaultUncaughtExceptionHandler
    }

    job.join()
    println("Joined failed job")

    val deferred = GlobalScope.async {
        println("Throwing exception from async")
        throw ArithmeticException() // Nothing is printed, relying on user to call await

    }

    try {
        deferred.await()
        println("Unreached")

    } catch (e: Exception) {
        println("Caught exception")

    }
}