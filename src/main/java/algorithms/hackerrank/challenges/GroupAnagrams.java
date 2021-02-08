package algorithms.hackerrank.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Group Anagrams
 *
 * Two Strings are anagrams if they have the same characters in the same frequency, but the characters are in a different order. An Example is bat and tab.
 * Given a collection of strings, group the anagrams and return the number of groups formed.
 *
 * Example
 *
 * Words = [“cat”, “listen”, “silent”, “kitten”, “salient”]
 *
 * Only silent and listen are anagrams, The last word, salient, contains an extra ‘a’.
 * No other words are anagrams, so there are 4 groups: [[“silent”, “listen”], [“cat”], [“kitten”], [“salient”]].
 * Return 4.
 *
 * getGroupedAnagrams has the following parameter(s):
 * String words[n]: an array of string
 *
 * Returns
 * int: the number of groups formed
 *
 */
public class GroupAnagrams {

    public static int getGroupedAnagrams(List<String> words) {
        HashMap<List<String>, List<String>> hashGroup = new HashMap<>();
        words.forEach(word -> {
            List<String> letters = Arrays.stream(word.split("")).sorted().collect(Collectors.toList());
            if(hashGroup.containsKey(letters)) {
                List<String> valuesHash = new ArrayList<>();
                valuesHash.addAll(hashGroup.get(letters));
                valuesHash.add(word);
                hashGroup.put(letters, valuesHash);
            } else {
                hashGroup.put(letters, Arrays.asList(word));
            }
        });

        return hashGroup.size();
    }

}
