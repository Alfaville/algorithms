package algorithms.hackerrank.implementation;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class DivisibleSumPairs {

    static int divisibleSumPairs(int k, int[] ar) { //O(n2)
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            while(n < 2 || n > 100) {
                return;
            }

            int k = Integer.parseInt(nk[1]);
            while(k < 1 || k > 100) {
                return;
            }

            int[] ar = new int[n];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                ar[i] = arItem;
            }

            int result = divisibleSumPairs(k, ar);
            System.out.println(result);
        }
    }
}
