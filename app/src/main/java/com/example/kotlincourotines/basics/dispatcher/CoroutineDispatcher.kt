package com.example.kotlincourotines.basics.dispatcher

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking


fun main() =  runBlocking<Unit> {


    launch {
        println("main runBlocking     : I'm working in thread ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Default) {
        println("Dispatchers default   : I'm working in thread ${Thread.currentThread().name}")
    }

    launch(Dispatchers.Unconfined) {
        println("Dispatchers unconfined : I'm working in thread ${Thread.currentThread().name}")
    }

    launch(newSingleThreadContext("MyOwnThread")) {
        println("newSingleThreadContext  : I'm working in thread ${Thread.currentThread().name}")
    }
}