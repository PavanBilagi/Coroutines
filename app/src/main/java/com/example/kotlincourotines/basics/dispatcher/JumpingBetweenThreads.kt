package com.example.kotlincourotines.basics.dispatcher

import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
    newSingleThreadContext("ctx1").use { ctx1 ->
        newSingleThreadContext("ctx2").use { ctx2 ->
            runBlocking(ctx1) {
                log("ctx1")

                withContext(ctx2) {
                    log("ctx2")

                }

                log("Back to ctx1")

            }
        }
    }

}


fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")