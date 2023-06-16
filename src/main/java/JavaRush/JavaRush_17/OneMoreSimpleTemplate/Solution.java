package JavaRush.JavaRush_17.OneMoreSimpleTemplate;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String timeFormatted = dtf.format(zonedDateTime);
        System.out.println(timeFormatted);
    }

}
