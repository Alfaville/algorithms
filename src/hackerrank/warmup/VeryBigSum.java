package hackerrank.warmup;

import java.util.Scanner;

public class VeryBigSum {

    static long aVeryBigSum(int n, long[] ar) {
    	long soma = 0;
    	if(n < 1 || n > 10)
    		return soma;
    	final long constraint = (long) Math.pow(10, 10);
    	for (int i = 0; i < n; i++) {
    		if(ar[i] < 0 || ar[i] > constraint)
    			soma += 0l;
    		else
    			soma += ar[i];
		}    	
    	return soma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 0) n = 0;
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }

}
