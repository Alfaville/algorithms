package algorithms.hackerrank.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */
class Kangaroo {

    static String kangaroo(int position1, int jump1, int position2, int jump2) {
        final String NO = "NO", YES = "YES";
        int p1 = position1;
        int p2 = position2;

        final int INITIAL_DISTANCE = Math.abs(p1 - p2);
        while (true) {
            p1 += jump1;
            p2 += jump2;

            int distance;
            if (p2 > p1)
                distance = Math.abs(p1 - p2);
            else
                distance = p1 - p2;

            if (distance == 0) {
                return YES;
            } else if ((distance < 0) || (distance > INITIAL_DISTANCE)) {
                return NO;
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] x1V1X2V2 = scanner.nextLine().split(" ");

            int x1 = Integer.parseInt(x1V1X2V2[0]);

            int v1 = Integer.parseInt(x1V1X2V2[1]);

            int x2 = Integer.parseInt(x1V1X2V2[2]);

            int v2 = Integer.parseInt(x1V1X2V2[3]);

            System.out.println(kangaroo(x1, v1, x2, v2));
        }
    }

}
