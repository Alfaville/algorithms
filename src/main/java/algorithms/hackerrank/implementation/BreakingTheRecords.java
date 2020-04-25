package algorithms.hackerrank.implementation;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class BreakingTheRecords {

    static int[] breakingRecords(int[] scores) {        // = 6n + 1 (worst case) => O(n) = Linear
        int totalMin = 0, totalMax = 0;                 // 2
        int valueMin = scores[0], valueMax = scores[0]; // 2
        for (int i = 1; i < scores.length; i++) {       // 2 + (n - 1) + (n - 1)
            if(valueMin > scores[i]) {                  // n - 1
                valueMin = scores[i];                   // IF TRUE => n - 1
                totalMin++;                             // IF TRUE => n - 1
            } else if (scores[i] > valueMax) {          // n - 1
                valueMax = scores[i];                   // IF TRUE => n - 1
                totalMax++;                             // IF TRUE => n - 1
            }
        }
        return new int[] {totalMax, totalMin};          // 1
    }

    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n < 1 || n > 1000) {
            return;
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        System.out.println(result[0] + " " + result[1]);

        scanner.close();
    }

}
