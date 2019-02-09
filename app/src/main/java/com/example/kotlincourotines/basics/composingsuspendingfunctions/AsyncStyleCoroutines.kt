package com.example.kotlincourotines.basics.composingsuspendingfunctions

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun doSomeThingOneAsync() = GlobalScope.async {
    doSomeThingOne()
}


fun doSomeThingTwoAsync() = GlobalScope.async {
    doSomeThingTwo()
}


fun main() {
    val time = measureTimeMillis {
        val one = doSomeThingOneAsync()
        val two = doSomeThingTwoAsync()

        runBlocking {
            println("${one.await() + two.await()}")

        }

    }

    println("Completed in $time ms")

}