package Nail.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc5abcg6abch$");

        String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("\\W");
        Matcher matcher = pattern1.matcher(s1) ;


        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }

    }


}
