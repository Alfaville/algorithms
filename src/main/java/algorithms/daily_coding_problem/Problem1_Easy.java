package algorithms.daily_coding_problem;

import java.util.HashSet;
import java.util.Set;

/**
 * Good morning! Here's your coding interview problem for today.
 *
 * This problem was asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 */
public class Problem1_Easy {

    public static boolean execute(int[] numbers, int k) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = k - numbers[i];
            if(hashSet.contains(complement)) {
                return true;
            }
            hashSet.add(numbers[i]);
        }
        return false;
    }

}
