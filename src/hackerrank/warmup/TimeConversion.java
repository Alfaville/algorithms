package hackerrank.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class TimeConversion {

    private static Optional<String> timeConversion(final String s) throws ParseException {
    		String result = null;
    		DateFormat inDateFormat = new SimpleDateFormat("hh:mm:ssa");
    		DateFormat outDateFormat = new SimpleDateFormat("hh:mm:ss");
    		Date date = inDateFormat.parse(s);
    		result = outDateFormat.format(date);
    		return Optional.ofNullable(result);
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        timeConversion(s).ifPresent(System.out::println);                
    }
}
