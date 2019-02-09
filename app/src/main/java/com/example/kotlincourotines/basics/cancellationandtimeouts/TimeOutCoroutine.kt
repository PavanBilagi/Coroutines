package com.example.kotlincourotines.basics.cancellationandtimeouts

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout


fun main() = runBlocking {
    withTimeout(2000) {
        repeat(10000) {
            println("I'm sleeping $it ...")
            delay(500)
        }
    }
}