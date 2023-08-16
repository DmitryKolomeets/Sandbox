package Nail.RegExp;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {

        String s1 = "sdfk;lksf89   2wkwdef,km38 wefklj23edwk8";



        Pattern pattern = Pattern.compile("(wk){1,}");
        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }


}
