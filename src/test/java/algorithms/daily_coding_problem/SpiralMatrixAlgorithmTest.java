package algorithms.daily_coding_problem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SpiralMatrixAlgorithmTest {

    @Test
    public void scenario1() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        assertArrayEquals(
                Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12).toArray(),
                SpiralMatrixAlgorithm.execute(matrix).toArray()
        );
    }

    @Test
    public void scenario2() {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 1, 2, 3, 1, 23},
                {6, 7, 6, 9, 10, 6, 7, 6, 9, 10},
                {1, 2, 3, 1, 23, 1, 2, 3, 4, 5},
                {6, 7, 6, 9, 10, 6, 7, 6, 9, 10},
                {6, 7, 6, 9, 10, 6, 7, 6, 9, 10},
                {6, 7, 6, 9, 10, 6, 7, 6, 9, 10},
                {6, 7, 6, 9, 10, 6, 7, 6, 9, 10},
                {6, 7, 6, 9, 10, 6, 7, 6, 9, 10},
        };

        assertArrayEquals(
                Arrays.asList(
                        1, 2, 3, 4, 5, 1, 2, 3, 1, 23,
                        10, 5, 10, 10, 10, 10, 10,
                        9, 6, 7, 6, 10, 9, 6, 7, 6,
                        6, 6, 6, 6, 1, 6,
                        7, 6, 9, 10, 6, 7, 6, 9,
                        4, 9, 9, 9, 9,
                        6, 7, 6, 10, 9, 6, 7,
                        7, 7, 7, 2,
                        3, 1, 23, 1, 2, 3,
                        6, 6, 6,
                        7, 6, 10, 9,
                        6, 6, 6, 9, 10, 6, 7, 7, 6, 10, 9
                )
                        .toArray(),
                SpiralMatrixAlgorithm.execute(matrix).toArray()
        );
    }

}
