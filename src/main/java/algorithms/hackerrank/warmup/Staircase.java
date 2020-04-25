package algorithms.hackerrank.warmup;

import algorithms.utils.TimeAlgorithm;

import java.util.Scanner;

public class Staircase {

	private static final String HASHTAG = "#", SPACE = " ";

	private static void staircase(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(repeat(n, i));
		}
	}

	private static String repeat(int n, int position) {
		StringBuilder sb = new StringBuilder();
		int increment = 1;
		for (int j = 0; j < n; j++) {
			if ((n - increment) >= position + 1)
				sb.append(SPACE);
			else
				sb.append(HASHTAG);
			increment++;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		TimeAlgorithm.start();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		staircase(n);
		in.close();

		TimeAlgorithm.result();
	}

}