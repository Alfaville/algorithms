package algorithms.daily_interview_pro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {

    //Brute Force - O(n2)
    public static int bruteForce(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return numbers[i];
                }
            }
        }
        throw new IllegalArgumentException("No number found");
    }

    //Hashmap - O(n)
    public static int hashmap(int[] numbers) {
        Set<Integer> numberhash = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numberhash.contains(numbers[i])) {
                return numbers[i];
            }
            numberhash.add(numbers[i]);
        }
        throw new IllegalArgumentException("No number found");
    }

    //The Tortoise and the Hare  - O(n)
    public static int tortoiseAndHare(int[] numbers) {
        int tortoise = numbers[0];
        int hare = numbers[0];

        while (true) {
            tortoise = numbers[tortoise];
            hare = numbers[numbers[hare]];
            if (tortoise == hare)
                break;
        }

        int ptr1 = numbers[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = numbers[ptr1];
            ptr2 = numbers[ptr2];
        }

        return ptr1;
    }

}
