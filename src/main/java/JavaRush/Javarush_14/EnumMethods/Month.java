package JavaRush.Javarush_14.EnumMethods;

import java.util.Arrays;

public enum Month {

    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        Month[] monthes = Month.values();
        Month[] winterMonths = new Month[3];
        winterMonths[0] = monthes[11];
        winterMonths[1] = monthes[0];
        winterMonths[2] = monthes[1];
        return winterMonths;
    }

    public static Month[] getSpringMonths() {
        Month[] monthes = Month.values();
        Month[] springMonths = new Month[3];
        springMonths[0] = monthes[2];
        springMonths[1] = monthes[3];
        springMonths[2] = monthes[4];
        return springMonths;
    }

    public static Month[] getSummerMonths() {
        Month[] monthes = Month.values();
        Month[] summerMonths = new Month[3];
        summerMonths[0] = monthes[5];
        summerMonths[1] = monthes[6];
        summerMonths[2] = monthes[7];
        return summerMonths;
    }

    public static Month[] getAutumnMonths() {
        Month[] monthes = Month.values();
        Month[] autumnMonths = new Month[3];
        autumnMonths[0] = monthes[8];
        autumnMonths[1] = monthes[9];
        autumnMonths[2] = monthes[10];
        return autumnMonths;
    }

}
