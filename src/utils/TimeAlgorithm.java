package utils;

/**
 * https://stackoverflow.com/questions/1770010/how-do-i-measure-time-elapsed-in-java
 * 
 * @author alfaville
 *
 */
public class TimeAlgorithm {

	private static long startTime;
	
	public static final void start() {
		TimeAlgorithm.startTime = System.nanoTime();
	}
	
	public static void result() {
		System.out.println("\nEnd Time: " + (System.nanoTime() - TimeAlgorithm.startTime) / 1000000000.0);
	}
	
}
