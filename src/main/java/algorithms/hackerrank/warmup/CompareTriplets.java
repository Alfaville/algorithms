package main.java.algorithms.hackerrank.warmup;

import java.util.Scanner;

public class CompareTriplets {	
	
	private static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		final int[] alice = {a0, a1, a2}, bob = {b0, b1, b2};		
		int a = 0, b = 0;
		for (int i = 0; i < 3; i++) {
			if(!(CompareTriplets.valideInput(alice[i]) && CompareTriplets.valideInput(bob[i])))
				return new int[]{a,b};
			
			if(alice[i] > bob[i]) a++;
			else if(alice[i] < bob[i]) b++;	
		}
		return new int[]{a,b};
    }
	
	private static boolean valideInput(int point) {
		return (point >= 1 && point <= 100);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = CompareTriplets.solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");        
    }

}
