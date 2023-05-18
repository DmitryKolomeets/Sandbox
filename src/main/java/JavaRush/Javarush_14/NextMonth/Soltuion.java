package JavaRush.Javarush_14.NextMonth;

public class Soltuion {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        Month[] months = Month.values();
       int currentMonthIndex = month.ordinal();
       int nextMonthIndex = currentMonthIndex + 1;
       if (nextMonthIndex > months.length-1) {
           return months[0];
       } else {
           return months[nextMonthIndex];
       }
    }

}
