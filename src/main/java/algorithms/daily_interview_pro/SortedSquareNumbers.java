package algorithms.daily_interview_pro;

import java.util.Arrays;

/**
 * Hi, here's your problem today. This problem was recently asked by Microsoft:
 * <p>
 * Given a list of sorted numbers (can be both negative or positive), return the list of numbers squared in sorted order.
 * <p>
 * Here's an example and some starting code:
 * <p>
 * def square_numbers(nums):
 * # Fill this in.
 * <p>
 * print(square_numbers([-5, -3, -1, 0, 1, 4, 5]))
 * # [0, 1, 1, 9, 16, 25, 25]
 * <p>
 * <p>
 * Solve this problem in O(n) time.
 */
public class SortedSquareNumbers {

    //Look: https://www.geeksforgeeks.org/sort-array-converting-elements-squares/
    //Time complexity: O(n log n)
    public static int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * numbers[i];
        }
        Arrays.sort(numbers);
        return numbers;
    }

    public static void main(String[] args) {
        int arr[] = {-5, -3, -1, 0, 1, 4, 5};
        int n = arr.length;

        System.out.println("Before sort ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        solution(arr);
        System.out.println();
        System.out.println("After Sort ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

}
