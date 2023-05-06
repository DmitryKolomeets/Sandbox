package JavaRush.JavaRush_12.Stringconverter;

public class Solution {

    public static void main(String[] args) {
        String string = "12.84";
       double number = Double.parseDouble(string);
       int numberRounded = (int) Math.round(number);
        System.out.println(numberRounded);
    }
}
