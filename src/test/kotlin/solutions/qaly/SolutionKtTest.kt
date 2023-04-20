package solutions.qaly

import org.junit.Assert.*

import org.junit.Test
import kotlin.math.pow

class SolutionKtTest {

    @Test
    fun testcase1() {
        val input = listOf(
            Period(1f, 12f),
            Period(0.7f, 5.2f),
            Period(0.9f, 10.7f),
            Period(0.5f, 20.4f),
            Period(0.2f, 30f),
        )

        val expected = 41.470f

        assertEquals(expected, solve(input), 10f.pow(-3))
    }
}
