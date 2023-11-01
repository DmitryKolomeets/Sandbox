package Gym;

public class Gym_28 {
    public static String reverseWords(String s) {
        String result = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            result = ch + result;
        }
        return result;

    }


    public static void main(String[] args) {
        String word = "Privet. Kak dela?";

        System.out.println(reverseWords(word));



    }
}
