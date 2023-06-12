package JavaRush.JavaRush_17.DayOfWeekYourBirthday;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1982, Calendar.JULY, 01);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
      String result = "";
      int day = calendar.get(Calendar.DAY_OF_WEEK);
      switch (day) {
          case 1:
              return "воскресенье";
          case 2:
              return "понедельник";
          case 3:
              return "вторник";
          case 4:
              return "среда";
          case 5:
              return "четверг";
          case 6:
              return "пятница";
          case 7:
              return "суббота";
      }
        return result;
    }

}
