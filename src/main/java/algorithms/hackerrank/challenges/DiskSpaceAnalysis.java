package algorithms.hackerrank.challenges;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * function segment(x, space) {
 *     let segments = [];
 *
 *     for(let i = 0; i < space.length; i++) {
 *         if (x > space.length) {
 *             break;
 *         }
 *
 *         segments.push(space.slice(i, x++));
 *     }
 *
 *     let minimums = segments.map(segment => Math.min(...segment));
 *
 *     return Math.max(...minimums);
 * }
 *
 * int min = Integer.MAX_VALUE, maxMin = 0;
 * for(int i = 0; i < spaces.length - x + 1; i++) {
 *   if(i == 0 || (spaces[i-1] == min && spaces[i + x - 1] != min)) {
 *     for(int j = i; j < i + x; j++) {
 *       min = Math.min(min, spaces[j]);
 *     }
 *     maxMin = Math.max(min, maxMin);
 *   }
 * }
 */

public class DiskSpaceAnalysis {

    public static int segment(int x, List<Integer> space) {
        int min = Integer.MAX_VALUE, maxMin = 0;
        for(int i = 0; i < space.size() - x + 1; i++) {
            if(i == 0 || (space.get(i-1) == min && space.get(i + x - 1) != min)) {
                for(int j = i; j < i + x; j++) {
                    min = Math.min(min, space.get(j));
                }
                maxMin = Math.max(min, maxMin);
            }
        }
        return maxMin;
    }

    public static void main(String[] args) {
        System.out.println(
                segment(2, Arrays.asList(8,2,4,6))
        );
    }

}
