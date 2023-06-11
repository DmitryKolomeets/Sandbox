package JavaRush.JavaRush_17.OutOfTheLoop;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class Test1 {

    public static void main(String[] args) {

        ZoneId timezone = ZoneId.of("Asia/Shanghai");
        LocalDate today = LocalDate.now(timezone);
        System.out.println("Сейчас в Шанхае = " + today);
        System.out.println(timezone);

        LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 22);

        LocalDate todayOld = LocalDate.ofEpochDay(4000);
        System.out.println(todayOld);


        LocalDate today3 = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());



    }

}
