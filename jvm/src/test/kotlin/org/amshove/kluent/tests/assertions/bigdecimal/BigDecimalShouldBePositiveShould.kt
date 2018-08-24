package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldBePositive
import kotlin.test.Test
import java.math.BigDecimal
import kotlin.test.assertFails

class BigDecimalShouldBePositiveShould {
    @Test
    fun passWhenTestingAPositiveValue() {
        BigDecimal("123").shouldBePositive()
    }

    @Test
    fun passWhenTestingAPositiveValueWithScale() {
        BigDecimal.valueOf(1, 1).shouldBePositive()
    }

    @Test
    fun failWhenTestingANegativeValue() {
        assertFails { BigDecimal("-10").shouldBePositive() }
    }

    @Test
    fun failWhenTestingANegativeValueWithScale() {
        assertFails { BigDecimal.valueOf(-5, 1).shouldBePositive() }
    }

    @Test
    fun failWhenTestingAgainstZero() {
        assertFails { BigDecimal.valueOf(0).shouldBePositive() }
    }
}