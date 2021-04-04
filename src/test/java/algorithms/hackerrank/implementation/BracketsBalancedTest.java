package algorithms.hackerrank.implementation;

import algorithms.hackerrank.challenges.BracketsBalanced;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketsBalancedTest {

    @Test
    public void bracketsBalancedTest1() {
        assertEquals(
                Boolean.FALSE,
                BracketsBalanced.isBalanced("{}(")
        );
    }

    @Test
    public void bracketsBalancedTest2() {
        assertEquals(
                Boolean.FALSE,
                BracketsBalanced.isBalanced("({)}")
        );
    }

    @Test
    public void bracketsBalancedTest3() {
        assertEquals(
                Boolean.TRUE,
                BracketsBalanced.isBalanced("({()})")
        );
    }

    @Test
    public void bracketsBalancedTest4() {
        assertEquals(
                Boolean.TRUE,
                BracketsBalanced.isBalanced("{}()")
        );
    }

}
