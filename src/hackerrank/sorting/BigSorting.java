package hackerrank.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BigSorting {

	private static void sort(String[] unsorted) {
		List<String> sorted = Arrays.asList(unsorted);
		sorted.sort((x, y) -> {			
	        if (x.length() == y.length()) 
	            return x.compareTo(y);	        
	        return x.length() - y.length();			
		});
		sorted.forEach(System.out::println);
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 1 || n > (2 * Math.pow(10, 5))) 
        	n = 1;
        String[] unsorted = new String[n];
        for(int unsorted_i = 0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }    
        sort(unsorted);
    }

}
