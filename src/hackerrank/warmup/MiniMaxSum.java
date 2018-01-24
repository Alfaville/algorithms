package hackerrank.warmup;

import java.util.Scanner;

/**
 
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
 
Sample Input
	1 2 3 4 5
Sample Output
	10 14
 
 */
public class MiniMaxSum {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] nums = new long[5];        
        long max = 0, min= 0 , sum =0;
        nums[0] = max = min = sum = in.nextLong(); 
        for (int i = 1; i < 5; i++) {
            nums[i] = in.nextLong();
            if(nums[i]>max) max = nums[i];
            if(nums[i]<min) min = nums[i];
            sum += nums[i];
        }
        System.out.println( (sum - max) + " " + (sum - min));
        in.close();
    }
	
}