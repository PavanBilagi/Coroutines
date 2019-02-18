package com.example.kotlincourotines.basics.composingsuspendingfunctions

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun consurrentSum(): Int = coroutineScope {
    val one = async { doSomeThingOne() }
    val two = async { doSomeThingTwo() }
    one.await() + two.await()

}


fun main() = runBlocking<Unit> {
    //sampleStart
    val time = measureTimeMillis {
        println("The answer is ${consurrentSum()}")
    }
    println("Completed in $time ms")
    //sampleEnd
}