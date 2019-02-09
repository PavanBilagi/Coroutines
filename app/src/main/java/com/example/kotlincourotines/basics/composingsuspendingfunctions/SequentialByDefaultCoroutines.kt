package com.example.kotlincourotines.basics.composingsuspendingfunctions

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    val time = measureTimeMillis {

        val one = doSomeThingOne()
        val two = doSomeThingTwo()

        println(" The answer is ${one + two}")

    }

    println(" The time is $time")


}


suspend fun doSomeThingOne(): Int {
    delay(1000)
    return 10
}

suspend fun doSomeThingTwo(): Int {
    delay(1000)
    return 20
}