package algorithms.other_algorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Palidrome test algorithm")
class PalindromeProblemTest {

    @Test
    fun `Recursive - TestChar`() {
        testPalindromeRecursion(true, "a")
    }

    @Test
    fun `Recursive - testPositive1`() {
        testPalindromeRecursion(true, "aba")
    }

    @Test
    fun `Recursive - testPositive2`() {
        testPalindromeRecursion(true, "abba")
    }

    @Test
    fun `Recursive - testPositive3`() {
        testPalindromeRecursion(true, "abbabba")
    }

    @Test
    fun `Recursive - testPositive4`() {
        testPalindromeRecursion(true, "abbaabba")
    }

    @Test
    fun `Recursive - testNegative1`() {
        testPalindromeRecursion(false, "ab")
    }

    @Test
    fun `Recursive - testNegative2`() {
        testPalindromeRecursion(false, "abab")
    }

    @Test
    fun `Recursive - testNegative3`() {
        testPalindromeRecursion(false, "abaa")
    }

    @Test
    fun `Iterarion - TestEmptyString`() {
        testPalindromeIteration(true, "racecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecarracecar")
    }

    @Test
    fun `Iterarion - TestChar`() {
        testPalindromeIteration(true, "a")
    }

    @Test
    fun `Iterarion - testPositive1`() {
        testPalindromeIteration(true, "aba")
    }

    @Test
    fun `Iterarion - testPositive2`() {
        testPalindromeIteration(true, "abba")
    }

    @Test
    fun `Iterarion - testPositive3`() {
        testPalindromeIteration(true, "abbabba")
    }

    @Test
    fun `Iterarion - testPositive4`() {
        testPalindromeIteration(true, "abbaabba")
    }

    @Test
    fun `Iterarion - testNegative1`() {
        testPalindromeIteration(false, "ab")
    }

    @Test
    fun `Iterarion - testNegative2`() {
        testPalindromeIteration(false, "abab")
    }

    @Test
    fun `Iterarion - testNegative3`() {
        testPalindromeIteration(false, "abaa")
    }

    fun testPalindromeRecursion(expected: Boolean, data: String) {
        val actual = isPalindromeRecursion(data)
        assertEquals(expected, actual, "\ndata = \"$data\"")
    }

    fun testPalindromeIteration(expected: Boolean, data: String) {
        val actual = isPalindromeIteration(data)
        assertEquals(expected, actual, "\ndata = \"$data\"")
    }

}