package algorithms.daily_coding_problem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * This problem was asked by Amazon.
 *
 * Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
 *
 * For example, given the following matrix:
 *
 * [[1,  2,  3,  4,  5],
 *  [6,  7,  8,  9,  10],
 *  [11, 12, 13, 14, 15],
 *  [16, 17, 18, 19, 20]]
 *
 * You should print out the following:
 *
 * 1
 * 2
 * 3
 * 4
 * 5
 * 10
 * 15
 * 20
 * 19
 * 18
 * 17
 * 16
 * 11
 * 6
 * 7
 * 8
 * 9
 * 14
 * 13
 * 12
 */
public class SpiralMatrixAlgorithm {

    public static List<Integer> execute(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        List<Integer> result = new ArrayList<>();
        while(top <= bottom && left <= right) {
            // left->right
            for (int i = top; i <= right; i++) {
                result.add(arr[top][i]);
            }
            ++top;

            //top->bottom
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            --right;

            //right->left
            for (int i = right; i >= left; i--) {
                result.add(arr[bottom][i]);
            }
            --bottom;

            //bottom->top
            for (int i = bottom; i >= top; i--) {
                result.add(arr[i][left]);
            }
            ++left;
        }
        return result;
    }

}

