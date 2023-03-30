package cp3

import kotlin.math.abs

data class NumberWithModulo(val value: Int, val modulo: Int, val isOdd: Boolean)

fun main() {
    while (true) {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        if (n == 0 && m == 0) break
        val numbers = mutableListOf<NumberWithModulo>()
        for (i in 0 until n) {
            val value = readLine()!!.toInt()
            val modulo = if (value < 0) abs(value) % m * -1 else value % m
            numbers.add(NumberWithModulo(value, modulo, value % 2 == 1))
        }
        numbers.sortWith(compareBy(
            { it.modulo },
            { if (it.isOdd) -it.value else it.value },
            { if (it.isOdd) -it.value else it.value }
        ))
        println("$n $m")
        numbers.forEach { println(it.value) }
    }
    println("0 0")
}