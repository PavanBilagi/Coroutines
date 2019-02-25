package com.example.kotlincourotines.basics.inheritance

abstract class Printer(private val modelName: String) {

    open fun printModel() = println("The model name of the printer $modelName")

    abstract fun bestSellingPrice(): Double
}


open class LaserPrinter(private val name: String) : Printer(name) {
    override fun bestSellingPrice(): Double {
        return 129.0
    }

    override fun printModel() {
        println("The model name of the LaserPrinter $name")
    }
}


class SpecialPrinter(val name: String) : LaserPrinter(name) {

     override fun bestSellingPrice(): Double {
        return super.bestSellingPrice()
    }

}

fun main() {
    LaserPrinter("Pavan").printModel()
}