package algorithms.daily_interview_pro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFastSumTest {

    @Test
    public void addDigitsTest1() {
        assertEquals(
                12,
                new ListFastSum(new int[]{1, 2, 3, 4, 5, 6, 7})
                        .sum(2,5)
        );
    }

    @Test
    public void addDigitsTest2() {
        assertEquals(
                18,
                new ListFastSum(new int[]{1, 2, 3, 4, 5, 6, 7})
                        .sum(2,6)
        );
    }

    @Test
    public void addDigitsTest3() {
        assertEquals(
                21,
                new ListFastSum(new int[]{1, 2, 3, 4, 5, 6, 7})
                        .sum(0,6)
        );
    }

    @Test
    public void addDigitsTest4() {
        assertEquals(
                1,
                new ListFastSum(new int[]{1, 2, 3, 4, 5, 6, 7})
                        .sum(0,1)
        );
    }

    @Test
    public void addDigitsTest5() {
        assertEquals(
                0,
                new ListFastSum(new int[]{1, 2, 3, 4, 5, 6, 7})
                        .sum(6,6)
        );
    }

    @Test
    public void addDigitsTest6() {
        assertEquals(
                9,
                new ListFastSum(new int[]{1, 2, 3, 4, 5, 6, 7})
                        .sum(3,5)
        );
    }

}