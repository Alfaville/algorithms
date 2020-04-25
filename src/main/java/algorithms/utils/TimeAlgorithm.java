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
        System.out.println(String.format("End Time nanoseconds: %s", TimeUnit.NANOSECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS)));
        System.out.println(String.format("End Time miliseconds: %s", TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS)));
        System.out.println(String.format("End Time seconds: %s", TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS)));
    }

}
