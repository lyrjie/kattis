package solutions.triarea

import org.junit.Assert.*

import org.junit.Test
import kotlin.math.pow

class SolutionKtTest {

    @Test
    fun testcase1() {
        val height = 1
        val base = 1

        assertEquals(0.5, solve(height, base), 10.0.pow(-7))
    }

    @Test
    fun testcase2() {
        val height = 2
        val base = 2

        assertEquals(2.0, solve(height, base), 10.0.pow(-7))
    }

}
