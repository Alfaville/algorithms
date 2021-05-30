package hackerrank.stacks

import algorithms.hackerrank.isBalanced
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BalancedBracketsTest {

    @Test
    fun `scenario 1 - {}()`() {
        assertEquals(
            isBalanced("{}()"),
            "YES"
        )
    }

    @Test
    fun `scenario 2 - `() {
        assertEquals(
            isBalanced("{()}"),
            "YES"
        )
    }

    @Test
    fun `scenario 3 - ({()})`() {
        assertEquals(
            isBalanced("({()})"),
            "YES"
        )
    }

    @Test
    fun `scenario 4 - ({)}`() {
        assertEquals(
            isBalanced("({)}"),
            "NO"
        )
    }

    @Test
    fun `scenario 5 - ((`() {
        assertEquals(
            isBalanced("(("),
            "NO"
        )
    }

    @Test
    fun `scenario 6 - }{`() {
        assertEquals(
            isBalanced("}{"),
            "NO"
        )
    }

    @Test
    fun `scenario 7 - {}}{`() {
        assertEquals(
            isBalanced("{}}{"),
            "NO"
        )
    }

    @Test
    fun `scenario 8 - {}}}`() {
        assertEquals(
            isBalanced("{}}}"),
            "NO"
        )
    }

}