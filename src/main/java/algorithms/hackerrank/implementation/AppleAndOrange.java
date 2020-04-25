package algorithms.hackerrank.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class AppleAndOrange {

	private static final long MAX_VALUE = (long) Math.pow(10, 10);
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int s = valide(in.nextInt());
        int t = valide(in.nextInt());
        int a = valide(in.nextInt());
        int b = valide(in.nextInt());
        int m = valide(in.nextInt());
        int n = valide(in.nextInt());
        
        final boolean constraint = (a < s && s < t && t < b);
        if(!constraint) {
            System.out.println(0);
            System.out.println(0);
            return;
        }
        
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        long appleCount = Arrays.stream(apple)
			        		.filter(x -> x + a >= s && x + a <= t)
			        		.count();

        long orangeCount = Arrays.stream(orange)
			        		.filter(x -> x + b >= s && x + b <= t)
			        		.count();        
        
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }	
            	
    private static int valide(int value) {
    	return (value < 1 || value > MAX_VALUE) ? 0 : value;
    }
    
}
