package com.pujigck.kotlin.cp2

fun main() {
    while (true) {
        val (a, b) = readLine()?.split(" ")?.map { it.toInt() } ?: break
        var x = a
        var seq = mutableListOf<Int>()
        while (x != 1) {
            if (x % b != 0) {
                println("Boring!")
                break
            }
            seq.add(x)
            x /= b
        }
        if (x == 1) {
            seq.add(x)
            println(seq.joinToString(" "))
        }
    }
}