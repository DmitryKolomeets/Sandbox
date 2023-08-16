package Nail.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7 {
    public static void main(String[] args) {
        String input = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] words = pattern.split(input);
        for (String word: words) {
            System.out.println(word);
        }
    }
}
