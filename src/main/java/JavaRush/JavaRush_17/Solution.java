package JavaRush.JavaRush_17;

import javax.imageio.stream.ImageInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {

    public static void main(String[] args) {



        Calendar calendar = new GregorianCalendar();

        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 4);
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 15);
        calendar.set(Calendar.SECOND, 0);

        System.out.println(calendar.getTime());



    }


}
