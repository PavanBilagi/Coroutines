package com.example.kotlincourotines.basics.exceptionhandling

import kotlinx.coroutines.*

fun main() = runBlocking {

    val handler = CoroutineExceptionHandler { _, throwable ->
        println("Caught exception")
    }


    val job = GlobalScope.launch(handler) {
        throw AssertionError()

    }

    val deferred = GlobalScope.async(handler) {
        throw IndexOutOfBoundsException()
    }

    joinAll(job, deferred)
}