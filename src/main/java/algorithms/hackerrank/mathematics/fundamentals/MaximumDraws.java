package algorithms.hackerrank.mathematics.fundamentals;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/maximum-draws/problem
 *
 * Tips: https://www.geeksforgeeks.org/discrete-mathematics-the-pigeonhole-principle/
 *
 */
public class MaximumDraws {

    /*
     * Complete the maximumDraws function below.
     */
    static int solution(int totalPairsSocks) {
        if(totalPairsSocks <= 0 || totalPairsSocks >= 1000000)
            throw new IllegalArgumentException();
        else {
            int totalSock = (totalPairsSocks * 2);
            return (totalSock - totalPairsSocks + 1); //Or return (totalPairsSocks + 1)
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(scanner.nextLine().trim());
        if(testCase < 1 || testCase > 1000 )
            throw new IllegalArgumentException();

        for (int tItr = 0; tItr < testCase; tItr++) {
            int totalPairsSocks = Integer.parseInt(scanner.nextLine().trim());
            System.out.println(solution(totalPairsSocks));
        }

        scanner.close();
    }

}
