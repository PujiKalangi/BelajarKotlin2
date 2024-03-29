/*
  * This Kotlin source file was generated by the Gradle 'init' task.
  */
package com.pujigck.kotlin

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

//Data Class
data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("Perkenalkan nama saya $name")
    }
}

fun main(args: Array<String>) {
    //    val user = User("Puji", 19)
    //    val dataUser = DataUser("Puji", 19)
    //
    //    println(user)
    //    println(dataUser)
    //
    //    val ( name, age ) = dataUser
    //    println("Perkenalkan nama saya $name")
    //
    //    dataUser.intro()

    //List
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    println(numberList)
    println(numberList[4])
    val anyList = mutableListOf(1, "A", "Kotlin", true)
    anyList.add(4, false)
    anyList.add(5, "Programming")
    println(anyList)

    //Set
    val integerSet = setOf(1, 2, 3 ,4, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 3, 4)
    val setB = setOf(3, 4, 2, 1)

    println(setA == setB)
    println(5 in setA)

    val mutableSet = mutableSetOf(1, 2 ,3 , 3, 4, 4)

    //    mutableSet[2] = 6
    mutableSet.add(6)
    mutableSet.remove(3)
    println(mutableSet)

    //Map
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital["Kuala Lumpur"])
    //    println(capital.getValue("Kuala Lumpur"))

    println(capital.keys)
    println(capital.values)

    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Kuala Lumpur", "Malaysia")

    println(mutableCapital)
}
