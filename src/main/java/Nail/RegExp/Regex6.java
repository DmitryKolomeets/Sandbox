package Nail.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
    public static void main(String[] args) {
        String myString = "12938940812948905882344;" +
                "43938940812948905882347;" +
                "87938940812948905882347";

        // 03/25 1234 5678 9123 4567 (987)

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);
        System.out.println(myString);


//        String myNewString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
//        System.out.println(myNewString);


        while (matcher.find()) {
            System.out.println(matcher.group(7));
        }
    }
}
