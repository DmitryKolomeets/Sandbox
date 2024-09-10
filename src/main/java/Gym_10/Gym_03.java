package Gym_10;

public class Gym_03 {

    public static String reverseWords(String s) {
        String result = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            result = ch + result;
        }
        return result;

    }

}
