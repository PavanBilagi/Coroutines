package com.example.kotlincourotines.basics.composingsuspendingfunctions

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    val time = measureTimeMillis {
        val one = async { doSomeThingOne() }
        val two = async { doSomeThingTwo() }

        println("One + two ${one.await() + two.await()}")
    }

    println("$time")

}
