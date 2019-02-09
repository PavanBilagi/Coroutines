package com.example.kotlincourotines.basics.composingsuspendingfunctions

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doSomeThingOne() }
        val two = async(start = CoroutineStart.LAZY) { doSomeThingTwo() }

        one.start() // start the first one
        two.start() // start the second one
        println("${one.await() + two.await()}")
    }


    println("$time")

}
