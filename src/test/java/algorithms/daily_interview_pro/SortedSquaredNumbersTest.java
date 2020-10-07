package algorithms.daily_interview_pro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedSquaredNumbersTest {

    @Test
    public void bracketsBalancedTest1() {
        assertArrayEquals(
                new int[]{0, 1, 1, 9, 16, 25, 25},
                SortedSquareNumbers.solution(new int[]{-5, -3, -1, 0, 1, 4, 5})
        );
    }

    @Test
    public void bracketsBalancedTest2() {
        assertArrayEquals(
                new int[]{25, 36, 81, 100},
                SortedSquareNumbers.solution(new int[]{10, 9, 6, 5})
        );
    }

    @Test
    public void bracketsBalancedTest3() {
        assertArrayEquals(
                new int[]{36, 49, 625, 1225},
                SortedSquareNumbers.solution(new int[]{25, -35, -6, 7})
        );
    }

    @Test
    public void bracketsBalancedTest4() {
        assertArrayEquals(
                new int[]{4, 9, 16, 25},
                SortedSquareNumbers.solution(new int[]{5, 4, 3, 2})
        );
    }

    @Test
    public void bracketsBalancedTest5() {
        assertArrayEquals(
                new int[]{1, 4, 9, 16, 25, 36},
                SortedSquareNumbers.solution(new int[]{-6, -3, -1, 2, 4, 5})
        );
    }

    @Test
    public void bracketsBalancedTest6() {
        assertArrayEquals(
                new int[]{0, 1, 4, 16, 25},
                SortedSquareNumbers.solution(new int[]{-5, -4, -2, 0, 1})
        );
    }

}
