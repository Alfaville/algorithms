package algorithms.daily_interview_pro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @see WordSearch
 */
public class WordSearchTest {

    @Test
    public void WordSearch_scenario0() {
        Character[][] matrix = {
            {'M', 'A', 'C', 'I'},
            {'A', 'B', 'Q', 'P'},
            {'O', 'N', 'O', 'B'},
            {'F', 'A', 'S', 'S'}
        };

        assertEquals(
                false,
                WordSearch.execute(matrix, "FOAM")
        );
    }

    @Test
    public void WordSearch_scenario1() {
        Character[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };

        assertEquals(
                true,
                WordSearch.execute(matrix, "FOAM")
        );
    }

    @Test
    public void WordSearch_scenario2() {
        Character[][] matrix = {
            {'F', 'A', 'C', 'A'},
            {'P', 'B', 'Q', 'L'},
            {'A', 'N', 'O', 'F'},
            {'M', 'A', 'S', 'A'}
        };

        assertEquals(
                true,
                WordSearch.execute(matrix, "ALFA")
        );
    }

    @Test
    public void WordSearch_scenario3() {
        Character[][] matrix = {
            {'F', 'A', 'C', 'A'},
            {'P', 'B', 'F', 'L'},
            {'A', 'N', 'D', 'F'},
            {'M', 'A', 'S', 'A'}
        };

        assertEquals(
                true,
                WordSearch.execute(matrix, "FD")
        );
    }

    @Test
    public void WordSearch_scenario4() {
        Character[][] matrix = {
            {'F', 'A', 'C', 'A'},
            {'P', 'B', 'F', 'L'},
            {'A', 'N', 'D', 'F'},
            {'N', 'A', 'S', 'A'}
        };

        assertEquals(
                true,
                WordSearch.execute(matrix, "NASA")
        );
    }

    @Test
    public void WordSearch_scenario5() {
        Character[][] matrix = {
            {'F', 'A', 'C', 'A'},
            {'P', 'B', 'X', 'L'},
            {'A', 'N', 'D', 'F'},
            {'M', 'A', 'S', 'A'}
        };

        assertEquals(
                false,
                WordSearch.execute(matrix, "FD")
        );
    }

    @Test
    public void WordSearch_scenario6() {
        Character[][] matrix = {
            {'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'K', 'C', 'A'},
            {'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'K', 'P', 'B'},
            {'A', 'X', 'P', 'F', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'M', 'A', 'S', 'A', 'X', 'P', 'F', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'M', 'A', 'S', 'A', 'C', 'P', 'F', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'M', 'A', 'S', 'A', 'N', 'T', 'Z'},
            {'M', 'A', 'S', 'A', 'X', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'U', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'M', 'A', 'S', 'A', 'Z', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'W', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'E', 'Q', 'X', 'C', 'A', 'F', 'A', 'F', 'A', 'C', 'P', 'A', 'X', 'C', 'A', 'F', 'A', 'F', 'A', 'A', 'K', 'N', 'D', 'C', 'A'},
            {'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'K', 'P', 'B'},
            {'M', 'A', 'S', 'A', 'T', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'U', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'M', 'A', 'S', 'A', 'Z', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'W', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'X', 'E', 'X', 'C', 'A', 'F', 'A', 'F', 'A', 'C', 'A', 'P', 'X', 'C', 'A', 'F', 'A', 'F', 'A', 'X', 'A', 'X', 'P', 'C', 'A'},
            {'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'K', 'P', 'B'},
            {'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'K', 'C', 'A'},
            {'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'K', 'P', 'B'},
            {'A', 'X', 'P', 'F', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'M', 'A', 'S', 'A', 'X', 'P', 'F', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'M', 'A', 'S', 'A', 'C', 'P', 'F', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'M', 'A', 'S', 'A', 'N', 'T', 'I'},
            {'M', 'A', 'S', 'A', 'X', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'V', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'M', 'A', 'S', 'A', 'Y', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'Q', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'R', 'W', 'X', 'C', 'A', 'F', 'A', 'F', 'A', 'C', 'C', 'X', 'X', 'C', 'A', 'F', 'A', 'F', 'A', 'K', 'K', 'N', 'D', 'C', 'A'},
            {'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'E', 'P', 'B'},
            {'M', 'A', 'S', 'A', 'T', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'V', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'M', 'A', 'S', 'A', 'Y', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'Q', 'X', 'W', 'I', 'Y', 'P', 'V', 'Q', 'A', 'F', 'A', 'C', 'A', 'A', 'C', 'A', 'F', 'A', 'C', 'W', 'X', 'X', 'C', 'A', 'F', 'A', 'F', 'A', 'C', 'T', 'C', 'X', 'C', 'A', 'F', 'A', 'F', 'A', 'X', 'X', 'P', 'W', 'C', 'A'},
            {'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'C', 'P', 'B', 'X', 'L', 'A', 'F', 'A', 'C', 'X', 'L', 'A', 'F', 'A', 'E', 'P', 'B'}
        };

        assertEquals(
                true,
                WordSearch.execute(matrix, "KKND")
        );
    }

    @Test
    public void WordSearch_scenario7() {
        Character[][] matrix = {
                {'F', 'A', 'C', 'A'},
                {'P', 'B', 'X', 'A'},
                {'A', 'N', 'D', 'A'},
                {'A', 'A', 'A', 'A'}
        };

        assertEquals(
                true,
                WordSearch.execute(matrix, "AAAA")
        );
    }

    @Test
    public void WordSearch_scenario8() {
        Character[][] matrix = {
                {'K', 'C', 'A', 'X'},
                {'K', 'P', 'B', 'M'},
                {'K', 'T', 'Z', 'P'},
                {'N', 'N', 'D', 'C'},
                {'D', 'P', 'B', 'B'},
                {'K', 'C', 'A', 'V'},
                {'K', 'P', 'B', 'W'},
                {'N', 'T', 'I', 'S'},
                {'K', 'K', 'N', 'D'}
        };

        assertEquals(
                true,
                WordSearch.execute(matrix, "KKND")
        );
    }

}
