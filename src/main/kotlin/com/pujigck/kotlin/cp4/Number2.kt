package com.pujigck.kotlin.cp4

import java.util.Scanner

fun process(m: Long): Long {
    var a = 0L
    var n = m
    while (n != 0L) {
        a += n % 2
        n /= 2
    }
    return a
}

fun main() {
    val scanner = Scanner(System.`in`)
    var t = scanner.nextInt()

    while (t-- > 0) {
        var x = scanner.next()
        var l = x.length
        var sum = 0L
        var c = 1L

        for (i in l - 1 downTo 0) {
            sum += (x[i] - '0') * c
            c *= 10
        }

        var a = process(sum)
        sum = 0L
        c = 1L

        for (i in l - 1 downTo 0) {
            sum += (x[i] - '0') * c
            c *= 16
        }

        var b = process(sum)
        println("$a $b")
    }
}