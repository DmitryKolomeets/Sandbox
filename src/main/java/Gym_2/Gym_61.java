package Gym_2;

public class Gym_61 {

    public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();


        for (int i = 0; i < (m - n) + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, n + i).equals(needle))
                    return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        strStr("sadbutsad", "sad");


    }
}
