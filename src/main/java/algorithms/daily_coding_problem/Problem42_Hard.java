package algorithms.daily_coding_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Good morning! Here's your coding interview problem for today.
 * <p>
 * This problem was asked by Google.
 * <p>
 * Given a list of integers S and a target number k, write a function that returns a subset of S that adds up to k. If such a subset cannot be made, then return null.
 * <p>
 * Integers can appear more than once in the list. You may assume all numbers in the list are positive.
 * <p>
 * For example, given S = [12, 1, 61, 5, 9, 2] and k = 24, return [12, 9, 2, 1] since it sums up to 24.
 */
public class Problem42_Hard {

    public static int[] execute(int[] numbers, int expectedResult) {
        Arrays.sort(numbers);
        List<Integer> result = new ArrayList<>();
        int countMatch = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentItem = numbers[i];
            if(currentItem > expectedResult) {
                continue;
            }
            countMatch += currentItem;
            result.add(currentItem);
            if(countMatch > expectedResult) {
                Integer difference = countMatch - expectedResult;
                result.remove(difference);
                return result.stream().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
            }
            if(countMatch == expectedResult) {
                return result.stream().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
            }
        }
        return null;
    }


}
