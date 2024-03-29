package JavaRush.JavaRush_17.JustDayOfWeek;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Solution {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
       return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }

}
