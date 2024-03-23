package Cym_4;

import java.util.Arrays;

public class Gym_98 {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String newS = s.replaceAll("\\p{Punct}|\\p{Space}", "");
        char[] chars = newS.toLowerCase().toCharArray();

        System.out.println(Arrays.toString(chars));
    }

}
