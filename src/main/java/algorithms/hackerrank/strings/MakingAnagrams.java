package algorithms.hackerrank.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/making-anagrams/problem
 */
public class MakingAnagrams {

    public static long execute(String s1, String s2) {
        Map<String, Long> groupS1 = Arrays.stream(s1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> groupS2 = Arrays.stream(s2.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        final String concatAnagrams = s1 + s2;
        final Map<String, Long> groupHash = Arrays.stream(concatAnagrams.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int difference = 0;
        for (Map.Entry<String, Long> entry : groupHash.entrySet()) {
            Long totalS2 = groupS2.getOrDefault(entry.getKey(), 0L);
            Long totalS1 = groupS1.getOrDefault(entry.getKey(), 0L);

            difference += Math.abs(totalS2 - totalS1);
        }

        return difference;
    }

}
