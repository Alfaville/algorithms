package algorithms.daily_coding_problem;

import algorithms.utils.AlgorithmTime;

/**
 *  There's a staircase with N steps, and you can climb 1 or 2 steps at a time.
 *  Given N, write a function that returns the number of unique ways you can climb the staircase.
 *  The order of the steps matters.
 *
 * For example, if N is 4, then there are 5 unique ways:
 *
 *     1, 1, 1, 1
 *     2, 1, 1
 *     1, 2, 1
 *     1, 1, 2
 *     2, 2
 *
 * What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X?
 * For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.
 *
 */
public class Staircase {

    //O(2N) - Fibinacci Sequece - very slow - repeated computations
    public static int repeatedComputationsSolution(Integer n) {
        if(n <= 1)
            return 1;
        return repeatedComputationsSolution(n - 1) + repeatedComputationsSolution(n - 2);
    }

    //Fibinacci Sequece - Computing iteratively
    public static int computingIterativelySolution(int n, int[] X) {
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;

        int a = 1, b = 2;
        int aux;
        for (int i = 0; i < n - 1; i++) {
            aux = b;
            b = a + b;
            a = aux;
        }
        return a;
    }



//    Each entry cache[i] will contain the number of ways we can get to step i with the set X.
//    Then, we'll build up the array from zero using the same recurrence as before:

//    dynamic programming - O(N * |X|) time and O(N) space.
//    def staircase(n, X):
//        cache = [0 for _ in range(n + 1)]
//        cache[0] = 1
//        for i in range(1, n + 1):
//            cache[i] += sum(cache[i - x] for x in X if i - x >= 0)
//        return cache[n]

    public static void main(String[] args) {
//        AlgorithmTime.start();
//        System.out.println(fibinacciSequeceSolution(6));
//        AlgorithmTime.result();

        AlgorithmTime.start();
        System.out.println(computingIterativelySolution(4, new int[]{1,2,3}));
        AlgorithmTime.result();

    }

}
