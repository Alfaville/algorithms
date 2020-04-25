package algorithms.hackerrank.implementation;

import algorithms.utils.TimeAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class BirthdayChocolate {

    static long birthday(List<Integer> squaresChocolate, int day, int month) {
        TimeAlgorithm.start();
        long result = 0;
        if(month > 1) {
            for (int i = 0; i < squaresChocolate.size(); i++) {
                int sum = 0;
                for (int j = 0; j <= month - 1; j++) {
                    if(i + j < squaresChocolate.size()) {
                        sum += squaresChocolate.get(i + j);
                    }
                }
                if(sum == day) {
                    result++;
                }
            }
        } else {
            result = squaresChocolate.stream().filter(value -> value == day).count();
        }
        TimeAlgorithm.result();
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        while(n < 1 || n > 100) {
            return;
        }

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int d = Integer.parseInt(dm[0]);
        int m = Integer.parseInt(dm[1]);
        while((d < 1 || d > 31) || (m < 1 || m > 12)) {
            return;
        }

        long result = birthday(s, d, m);
        System.out.println(result);

        bufferedReader.close();
    }

}
