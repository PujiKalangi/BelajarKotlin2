package com.pujigck.kotlin.cp2

fun main() {
    while (true) {
        val a = readLine() ?: break
        if (a == "0") break
        val x = a.filterIndexed { index, _ -> index % 2 == 0 }.sumBy { it - '0' }
        val y = a.filterIndexed { index, _ -> index % 2 == 1 }.sumBy { it - '0' }
        val diff = x - y
        if (diff % 11 == 0) {
            println("$a is a multiple of 11.")
        } else {
            println("$a is not a multiple of 11.")
        }
    }
}
