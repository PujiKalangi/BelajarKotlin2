package com.pujigck.kotlin.OOP

open class AnimalProtected (val name: String, protected val weight: Double){

}

class Cat(pName:String, pWeight: Double) : AnimalProtected(pName, pWeight)

fun main() {
    val cat = Cat("Kathy", 2.0)
    println("Nama kucing: ${cat.name}")
    //println("Berat kucing: ${cat.weight}")//
}