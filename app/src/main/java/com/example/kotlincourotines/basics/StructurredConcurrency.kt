package com.example.kotlincourotines.basics

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking { //this: CoroutineScope

    launch {// launch new coroutine in the runBlocking scope
        delay(1000)
        println("World")
    }

    println("Hello")

}