package JavaRush.JavaRush_10.StringFormat;

public class Solution {

    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }


//    Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.

    public static String format(String name, int salary) {
        String phrase = "Меня зовут %s. Я буду зарабатывать $%d в месяц.";
        return String.format(phrase, name, salary);
    }
}
