package JavaRush.JavaRush_17.LerningNewDataApi;

import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate example = LocalDate.now();
        return example;
    }

    static LocalDate ofExample() {
      LocalDate ofExample = LocalDate.of(2020, 9, 12);
        return ofExample;
    }

    static LocalDate ofYearDayExample() {
        LocalDate ofYearDay = LocalDate.ofYearDay(2020, 256);
        return ofYearDay;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate ofEpochDayExample = LocalDate.ofEpochDay(18517);
        return ofEpochDayExample;
    }
}
