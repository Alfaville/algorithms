package algorithms.hackerrank.challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAnagramTest {

    @Test
    public void scenario1() {
        List<String> dictionary = Arrays.asList("heater", "cold", "clod", "reheat", "docl");
        List<String> query = Arrays.asList("codl", "heater", "abcd");

        assertEquals(
                Arrays.asList(3, 2, 0),
                StringAnagram.stringAnagram(dictionary, query)
        );
    }

    @Test
    public void scenario2() {
        List<String> dictionary = Arrays.asList("hack", "a", "rank", "khac", "ackh", "kran", "rankhacker", "a", "ab", "ba", "stairs", "raits");
        List<String> query = Arrays.asList("a", "nark", "bs", "hack", "stair");

        assertEquals(
                Arrays.asList(2, 2, 0, 3, 1),
                StringAnagram.stringAnagram(dictionary, query)
        );
    }

    @Test
    public void scenario3() {
        List<String> dictionary = Arrays.asList("listen", "tow", "silent", "lisent", "two", "abc", "no", "on");
        List<String> query = Arrays.asList("two", "bca", "no", "listen");

        assertEquals(
                Arrays.asList(2, 1, 2, 3),
                StringAnagram.stringAnagram(dictionary, query)
        );
    }

}