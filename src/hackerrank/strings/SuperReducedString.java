package hackerrank.strings;

import java.util.Scanner;

public class SuperReducedString {

	private static String super_reduced_string(StringBuilder s) {
		final String[] values = s.toString().split("");
		for (int i = 0; i < values.length; i++) {
			String regex = String.format("[%s]{2}", values[i]);
			s = new StringBuilder(s.toString().replaceAll(regex, ""));
		}
		return s.toString().isEmpty() ? "Empty String" : s.toString();
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			String s = in.next();
			final boolean CONSTRAINT = (s.length() >= 1 && s.length() <= 100);
			if (!CONSTRAINT)
				return;
			String result = super_reduced_string(new StringBuilder(s));
			System.out.println(result);
		}
	}

}

