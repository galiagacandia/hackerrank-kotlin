package io.gappdev.hackerrank.oneweekpreparationkit.day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PlusMinusTest {

    private val plusMinus: PlusMinus = PlusMinus();

    @Test
    fun plusMinusTest() {
        val testCase: Array<Int> = arrayOf(-4, 3, -9, 0, 4, 1);

        plusMinus.plusMinus(testCase);

    }
}