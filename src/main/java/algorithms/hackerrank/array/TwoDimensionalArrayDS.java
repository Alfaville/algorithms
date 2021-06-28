package algorithms.hackerrank.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * <p>
 * Given the fixed small size of the problem, brute force is fine.
 * <p>
 * Points to note:-
 * <p>
 * Negative values possible.
 * Maximum sum can be less than zero.
 * Range of element value is -9 to 9.
 * Numbers to be summed for each hourglass = 7.
 * Minimum possible value for sum = 7 * (-9) = -63
 * <p>
 * So we'll initialize our maxSum to -63. From there, we just calculate the sums of all hourglasses and return the maxSum.
 * <p>
 * Input (stdin):
 * <p>
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * <p>
 * Expected Output: 19
 */
public class TwoDimensionalArrayDS {

    static final List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 1, 0, 0, 0, 0),
            Arrays.asList(1, 1, 1, 0, 0, 0),
            Arrays.asList(0, 0, 2, 4, 4, 0),
            Arrays.asList(0, 0, 0, 2, 0, 0),
            Arrays.asList(0, 0, 1, 2, 4, 0)
    );

    public static void main(String[] args) {
        System.out.println(hourglassSum(arr));
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int total = -63;
        final int calculationLimit2D = arr.size() - 2;

        for (int i = 0; i < calculationLimit2D; i++) {
            for (int j = 0; j < calculationLimit2D; j++) {

                int sum = arr.get(i).subList(j, j + 3)
                        .stream()
                        .reduce((prev, curr) -> prev + curr).get();

                sum += arr.get(i + 1).get(j + 1);

                sum += arr.get(i + 2).subList(j, j + 3)
                        .stream()
                        .reduce((prev, curr) -> prev + curr).get();

                if (sum > total) {
                    total = sum;
                }
            }
        }
        return total;
    }

}