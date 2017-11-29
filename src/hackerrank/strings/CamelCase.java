package hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {
	
	private static final String PATTERN = "[A-Z]";
	
	private static int camelCase(String word) {		
		if("".equals(word.trim()) && (word.length() < 1 || word.length() > Math.pow(10, 5)))
			return 0;		
		int result = 1;
		Matcher matcher = Pattern.compile(PATTERN).matcher(word);
        while (matcher.find()) result++;        
		return result;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(camelCase(s));
    }
	
}
