package algorithms.daily_coding_problem;

import java.util.ArrayList;
import java.util.List;

/**
 * This problem was asked by Amazon.
 * <p>
 * Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
 * <p>
 * For example, given the following matrix:
 * <p>
 * [[1,  2,  3,  4,  5],
 * [6,  7,  8,  9,  10],
 * [11, 12, 13, 14, 15],
 * [16, 17, 18, 19, 20]]
 * <p>
 * You should print out the following:
 * <p>
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

    ////O(N * M)
    public static List<Integer> execute(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        List<Integer> result = new ArrayList<>();
        while (top <= bottom && left <= right) {
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

    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        System.out.println(spiralOrder(matrix));
    }

    //O(N)
    //https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        if (matrix.length == 0)
            return ans;

        int totalRows = matrix.length, totalColumn = matrix[0].length;
        boolean[][] seen = new boolean[totalRows][totalColumn];
        int[] directionRows = {0, 1, 0, -1};
        int[] directionColumn = {1, 0, -1, 0};
        int row = 0, column = 0, direction = 0;

        // Iterate from 0 to (totalRows * totalColumn - 1)
        for (int i = 0; i < totalRows * totalColumn; i++) {
            ans.add(matrix[row][column]);
            seen[row][column] = true;
            int currentRow = row + directionRows[direction];
            int currentColumn = column + directionColumn[direction];

            if (0 <= currentRow && currentRow < totalRows && 0 <= currentColumn && currentColumn < totalColumn
                    && !seen[currentRow][currentColumn]) {
                row = currentRow;
                column = currentColumn;
            } else {
                direction = (direction + 1) % 4;
                row += directionRows[direction];
                column += directionColumn[direction];
            }
        }
        return ans;
    }

}

