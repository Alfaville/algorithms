package algorithms.utils;

import java.util.concurrent.TimeUnit;

import static java.lang.System.nanoTime;

/**
 * ßß
 * https://stackoverflow.com/questions/1770010/how-do-i-measure-time-elapsed-in-java
 *
 * @author alfaville
 */
public final class AlgorithmTime {

    private static long startTime;

    public static final void start() {
        AlgorithmTime.startTime = nanoTime();
    }

    public static void result() {
        long elapsedTime = nanoTime() - startTime;
        System.out.println(String.format("End Time seconds: %s", TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS)));
        System.out.println(String.format("End Time milliseconds: %s", TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS)));
        System.out.println(String.format("End Time nanoseconds: %s", TimeUnit.NANOSECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS)));
    }

}
