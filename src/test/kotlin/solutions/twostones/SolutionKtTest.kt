package solutions.twostones

import org.junit.Assert.*

import org.junit.Test

class SolutionKtTest {

    @Test
    fun testcase1() {
        val input = 1

        assertEquals("Alice", solve(input))
    }

    @Test
    fun testcase2() {
        val input = 2

        assertEquals("Bob", solve(input))
    }

    @Test
    fun testcase3() {
        val input = 5

        assertEquals("Alice", solve(input))
    }

}
