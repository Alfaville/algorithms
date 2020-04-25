package algorithms.hackerrank.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/camelcase/problem
 */
public class CamelCase {
	
	private static final String PATTERN = "^[a-z]|[A-Z]";
	
	public int camelCase(String word) {
		if("".equals(word.trim()) && (word.length() < 1 || word.length() > Math.pow(10, 5)))
			return 0;		
		int result = 0;

		Matcher matcher = (Pattern.compile(PATTERN).matcher(word));
        while (matcher.find()) result++;
		return result;
	}
	
}
