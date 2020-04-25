package main.java.algorithms.hackerrank.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	private static int birthdayCakeCandles(int[] ar) {
		int max = 0, aux = 0, totalCandlesBlowOut = 1;
		final int sizeArr = ar.length;
		for (int i = 0; i < sizeArr; i++) {
			if (ar[i] >= max) {
				max = ar[i];
				if (max != aux)
					totalCandlesBlowOut = 1;
				else
					totalCandlesBlowOut++;
				aux = max;
			}
		}
		return totalCandlesBlowOut;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(ar);
		System.out.println(result);
		in.close();
	}

}
