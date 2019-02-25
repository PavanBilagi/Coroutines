package com.example.kotlincourotines.basics.supervision

import kotlinx.coroutines.*

fun main() = runBlocking {

    val supervisor = SupervisorJob()

    with(CoroutineScope(coroutineContext + supervisor)) {
        val childOne = launch(CoroutineExceptionHandler { _, throwable -> }) {
            println("First child is failing")
            throw AssertionError("First child is cancelled")
        }

        val childTwo = launch {
            childOne.join()
            println("First child is cancelled ${childOne.isCancelled} but child two is still runing ")

            try {
                delay(Long.MAX_VALUE)
            } finally {
                println("Second child is cancelled becz supervisor is cancelled")

            }
        }

        childOne.join()
        println("supervisor cancelled ")
        supervisor.cancel()
        childTwo.join()

    }
}