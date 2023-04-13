package com.pujigck.kotlin.cp4

import kotlin.math.sqrt

fun main() {
    val primes = typeNumber(1000000)
    while (true) {
        val line = readLine()
        if (line == null) break
        val n = line.toInt()
        val reversed = n.toString().reversed().toInt()
        when {
            !primes[n] -> println("$n is not prime.")
            !primes[reversed] -> println("$n is prime.")
            n != reversed -> println("$n is emirp.")
            else -> println("$n is prime.")
        }
    }
}

fun typeNumber(n: Int): BooleanArray {
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (isPrime[i]) {
            var j = i * i
            while (j <= n) {
                isPrime[j] = false
                j += i
            }
        }
    }
    return isPrime
}
