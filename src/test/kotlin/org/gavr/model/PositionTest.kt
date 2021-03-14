package org.gavr.model

import org.gavr.MAX_INDEX
import org.junit.Test

/**
 * @author : daniil.mironov
 * Created : 14.03.2021
 **/
class PositionTest {

    @Test
    fun testCreateValid() {
        val validPosition = Position(0)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testCreateTooLow() {
        val validPosition = Position(-1)
    }

    @Test(expected = IllegalArgumentException::class)
    fun testCreateTooHigh() {
        val validPosition = Position(MAX_INDEX + 1)
    }
}
