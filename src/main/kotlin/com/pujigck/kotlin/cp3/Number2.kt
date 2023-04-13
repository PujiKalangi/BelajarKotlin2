package com.pujigck.kotlin.cp3

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val t = input.nextInt()

    for (i in 1..t) {
        println("N = ")
        val n = input.nextInt()
        val matrix = Array(n) { LongArray(n) }
        var isSymmetric = true

        for (j in 0 until n) {
            for (k in 0 until n) {
                matrix[j][k] = input.nextLong()
            }
        }


        for (j in 0 until n) {
            for (k in 0 until n) {
                if (matrix[j][k] < 0 || matrix[j][k] != matrix[n - j - 1][n - k - 1]) {
                    isSymmetric = false
                    break
                }
            }
            if (!isSymmetric) {
                break
            }
        }

        if (isSymmetric) {
            println("Test $i: Symmetric")
        } else {
            println("Test $i: Non-symmetric")
        }
    }
}