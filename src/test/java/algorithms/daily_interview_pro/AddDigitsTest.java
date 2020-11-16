package algorithms.daily_interview_pro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddDigitsTest {

    @Test
    public void addDigitsTest1() {
        assertEquals(
                6,
                AddDigits.solution(159)
        );
    }

    @Test
    public void addDigitsTest2() {
        assertEquals(
                3,
                AddDigits.solution(111)
        );
    }

    @Test
    public void addDigitsTest3() {
        assertEquals(
                2,
                AddDigits.solution(101)
        );
    }

    @Test
    public void addDigitsTest4() {
        assertEquals(
                9,
                AddDigits.solution(900)
        );
    }

    @Test
    public void addDigitsTest5() {
        assertEquals(
                9,
                AddDigits.solution(999)
        );
    }

    @Test
    public void addDigitsTest6() {
        assertEquals(
                6,
                AddDigits.solution(1234567890)
        );
    }

    @Test
    public void addDigitsTest7() {
        assertEquals(
                9,
                AddDigits.solution(111111111)
        );
    }

    @Test
    public void addDigitsTest8() {
        assertEquals(
                9,
                AddDigits.solution(111112111)
        );
    }

    @Test
    public void addDigitsTest9() {
        assertEquals(
                8,
                AddDigits.solution(10052)
        );
    }

    @Test
    public void addDigitsTest20() {
        assertEquals(
                6,
                AddDigits.solution(10055)
        );
    }

}
