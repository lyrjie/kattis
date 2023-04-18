package solutions.twosum

import org.junit.Assert.*

import org.junit.Test

class TwosumKtTest {

    @Test
    fun solve() {
        val inputFirst = 2
        val inputSecond = 2

        val result = solve(inputFirst, inputSecond)

        assertEquals(4, result)
    }
}
