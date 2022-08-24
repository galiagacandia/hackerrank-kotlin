package io.gappdev.hackerrank.oneweekpreparationkit.day1

import java.util.*

class PlusMinus {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    fun plusMinus(arr: Array<Int>): Unit {
        // Write your code here
        val positivos: Float = arr.count { i -> i > 0 }.toFloat()
        val negativos: Float = arr.count { i -> i < 0 }.toFloat()
        val ceros: Float = arr.count { i -> i == 0 }.toFloat()
        //println("Positivos: ${positivos}")
        //println("Negativos: ${negativos}")
        //println("Ceros: ${ceros}")
        println(String.format(Locale.ENGLISH, "%.6f", positivos/arr.size))
        println(String.format(Locale.ENGLISH, "%.6f", negativos/arr.size))
        println(String.format(Locale.ENGLISH, "%.6f", ceros/arr.size))
    }

    fun main(args: Array<String>) {
        val n = readLine()!!.trim().toInt()

        val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        plusMinus(arr)
    }
}