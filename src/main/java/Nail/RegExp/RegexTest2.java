package Nail.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {

    public static void main(String[] args) {
      String s = "Hello! I listen HeavyMetal. I think HeavyMetal is  the Best music ever. And you have to listen HeavyMetal";
      Pattern pattern = Pattern.compile("\\p{Punct}");
      Matcher matcher = pattern.matcher(s);
      String newString = matcher.replaceAll("");
        System.out.println(newString);
    }

}
