package com.example.kotlincourotines.basics

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

 fun main() = runBlocking {

    GlobalScope.launch {
        repeat(1000){
            i -> println("I am sleeping $i")
            delay(1000L)
        }
    }
    delay(1300L)
}