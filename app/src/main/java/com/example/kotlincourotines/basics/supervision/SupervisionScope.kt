package com.example.kotlincourotines.basics.supervision

import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        supervisorScope {
            val child = launch {
                try {
                    println("child is sleeping")
                    delay(Long.MAX_VALUE)

                } finally {
                    println("child is cancelled")
                }
            }

           // yield()
            child.join()
            println("Throwing exception from scope")
            throw ArithmeticException()
        }

    } catch (e: Exception) {
        println("Exception")
    }
}