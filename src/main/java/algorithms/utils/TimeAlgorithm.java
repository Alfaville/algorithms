package algorithms.utils;

import java.util.concurrent.TimeUnit;

import static java.lang.System.*;

/**
 * https://stackoverflow.com/questions/1770010/how-do-i-measure-time-elapsed-in-java
 *
 * @author alfaville
 */
public final class TimeAlgorithm {

    private static long startTime;

    public static final void start() {
        TimeAlgorithm.startTime = nanoTime();
    }

    public static void result() {
        long elapsedTime = nanoTime() - startTime;
        double elapsedTimeInSecond = (double) elapsedTime / 1_000_000_000; // 1 second = 1_000_000_000 nano seconds
        long convert = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        System.out.println("End Time: " + convert);
    }

}
