import java.time.Instant;

public class LineService {

    public static String lineRotationOutput(String inputLine) {
        StringBuilder builder = new StringBuilder(inputLine);
        return String.valueOf(builder.reverse());
    }

    public static void lineRotationRepeat(String stringIn, long num) {
        String stringTmp = stringIn;
        StringBuilder builder = new StringBuilder(stringTmp);
        Instant timeStart = Instant.now();
        long i = num;
        while (i > 0) {
            stringTmp = String.valueOf(builder.reverse());
            i = i - 1;
        }
        Instant timeStop = Instant.now();
        long elapsedTime = timeStop.toEpochMilli() - timeStart.toEpochMilli();
        System.out.println("Time for "
                + num
                + " repeat "
                + elapsedTime
                + " milliseconds");
    }

}
