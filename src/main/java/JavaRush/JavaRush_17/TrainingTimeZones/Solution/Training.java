package JavaRush.JavaRush_17.TrainingTimeZones.Solution;

import java.time.*;

public class Training {

    public static void main(String[] args) {

//        for (String s: ZoneId.getAvailableZoneIds())
//            System.out.println(s);


//        ZoneId zone = ZoneId.of("Africa/Cairo");
//        System.out.println(zone);



//        ZoneId zone = ZoneId.of("Africa/Cairo");
//        ZonedDateTime time = ZonedDateTime.now(zone);
//        System.out.println(time);


        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime cairoTime = ZonedDateTime.now(zone);

        LocalDate localDate = cairoTime.toLocalDate();
        LocalTime localTime = cairoTime.toLocalTime();
        LocalDateTime localDateTime = cairoTime.toLocalDateTime();




    }

}
