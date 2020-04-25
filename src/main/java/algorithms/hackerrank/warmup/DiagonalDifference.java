package main.java.algorithms.hackerrank.warmup;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * Sample Input
 * 
 * 3 
 * 11 2 4
 * 4 5 6 
 * 10 8 -12
 * 
 */
public class DiagonalDifference {

	private static final int MAX_LIMIT_VALUE = 100;
	private static final int MIN_LIMIT_VALUE = -100;

	private static boolean valideElement(int elementMatrix) {
		return (elementMatrix >= MIN_LIMIT_VALUE && elementMatrix <= MAX_LIMIT_VALUE);
	}
	
	private static void solve(long[][] squareMatrix) {
		List<long[]> squareList = Arrays.asList(squareMatrix);
		int order = squareList.size();

		int d1 = 0;
		for (int i = 0; i < order; i++) {
			d1 += squareMatrix[i][i];
		}

		Collections.reverse(squareList);

		int d2 = 0;
		for (int i = 0; i < order; i++) {
			d2 += squareMatrix[i][i];
		}

		int result = Math.abs(d1 - d2);
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int order = Math.abs(in.nextInt());
		long[][] squareMatrix = new long[order][order];
		for (int linha = 0; linha < order; linha++) {
			for (int coluna = 0; coluna < order; coluna++) {
				int element = in.nextInt();
				if (valideElement(element))
					squareMatrix[linha][coluna] = element;
				else
					return;
			}
		}

		solve(squareMatrix);
	}

}

/**
 * //other solution:
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * int n ; int diag1 = 0 ; int diag2 = 0; n = Integer.parseInt(in.nextLine());
 * for(int i =0 ; i < n; i++){ String str[] = in.nextLine().split(" "); diag1 =
 * diag1 + Integer.parseInt(str[i]); diag2 = diag2 +
 * Integer.parseInt(str[n-1-i]); }
 * 
 * int diagDiff = Math.abs(diag1 - diag2); System.out.println(diagDiff); }
 */