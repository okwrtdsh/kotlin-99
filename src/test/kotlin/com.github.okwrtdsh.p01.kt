package com.github.okwrtdsh.k99

import org.junit.Assert.assertEquals
import org.junit.Test

class P01UnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(8, last(listOf(1, 1, 2, 3, 5, 8)))
    }
}