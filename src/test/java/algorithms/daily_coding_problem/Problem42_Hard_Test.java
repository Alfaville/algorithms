package algorithms.daily_coding_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Problem42_Hard_Test {

    @Test
    public void scenario1() {
        int k = 24;
        int[] numbers = {12, 1, 61, 5, 9, 2};

        assertArrayEquals(new int[]{12, 9, 2, 1}, Problem42_Hard.execute(numbers, k));
    }

    @Test
    public void scenario2() {
        int k = 24;
        int[] numbers = {12, 1, 61, 5, 1, 2};

        assertArrayEquals(null, Problem42_Hard.execute(numbers, k));
    }

}