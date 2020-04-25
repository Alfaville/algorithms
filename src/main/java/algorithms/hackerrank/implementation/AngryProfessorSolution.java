package algorithms.hackerrank.implementation;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem
 */
public class AngryProfessorSolution {

    public static String angryProfessor(int k, int[] a) { //O(N)
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] <= 0) count++;
            if(count == k) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                String[] nk = scanner.nextLine().split(" ");

                int n = Integer.parseInt(nk[0]);

                int k = Integer.parseInt(nk[1]);

                int[] a = new int[n];

                String[] aItems = scanner.nextLine().split(" ");

                for (int i = 0; i < n; i++) {
                    int aItem = Integer.parseInt(aItems[i]);
                    a[i] = aItem;
                }

                System.out.println(angryProfessor(k, a));
            }
        }
    }

}
