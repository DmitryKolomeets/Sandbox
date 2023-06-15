package JavaRush.JavaRush_17.SimpleTemplate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String time = dtf.format(localDateTime);
        System.out.println(time);
    }

}
