package algorithms.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * String Anagram
 *
 * An anagram of string is another string with the same characters in the same frequency, in any order.
 * For example "abc",  "bca", "acb", "bad", "cba", "cab" are all anagrams of the string "abc".
 *
 * Given two arrays of strings, for every string in one list, determine how many anagrams of it are in the other list.
 * Write a function that receives dictionary and query, two string arrays.
 * It should return an array of integers where each element i contains the number of anagram of query[I] that exist in dictionary.
 *
 * Example
 *
 * dictionary = ["hack", "a", "rank", "khac", "ackh", "kran", "rankhacker", "a", "ab", "ba", "stairs", "raits"];
 * query      = ["a", "nark", "bs", "hack", "stair"]
 *
 * query[0] = "a" has 2 anagram in dictionary: "a" and "a";
 * query[1] = "nark" has 2 anagram in dictionary: "rank" and "kran";
 * query[2] = "bs" has 0 anagram in dictionary;
 * query[3] = "hack" has 3 anagram in dictionary: "hack", "khac" and "ackh";
 * query[4] = "stair" has 1 anagram in dictionary: "raits";
 *
 * While the characters are the same in "stairs", the frequency of "s" differs, so it is not an anagram.
 *
 * The final answer is [2, 2, 0, 3, 1]
 *
 */
public class StringAnagram {

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        HashMap<List<String>, List<String>> anagramGroup = new HashMap<>();
        dictionary.stream().forEach(word -> {
            List<String> sortedKeyword = Arrays.stream(word.split("")).sorted().collect(Collectors.toList());
            if(anagramGroup.containsKey(sortedKeyword)) {
                List<String> valuesHash = new ArrayList<>();
                valuesHash.addAll(anagramGroup.get(sortedKeyword));
                valuesHash.add(word);
                anagramGroup.put(sortedKeyword, valuesHash);
            } else {
                anagramGroup.put(sortedKeyword, Arrays.asList(word));
            }
        });

        return query.stream()
                .map(q -> {
                    List<String> sortedKeyword = Arrays.stream(q.split("")).sorted().collect(Collectors.toList());
                    return anagramGroup.getOrDefault(sortedKeyword, Collections.emptyList()).size();
                })
                .collect(Collectors.toList());
    }

}
