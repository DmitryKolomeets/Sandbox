package Gym_2;

public class Gym_60 {

    public static int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length())
            return -1;

        if (haystack.length() == needle.length())
            if (!haystack.equals(needle))
                return -1;
            else return 0;


        return haystack.indexOf(needle);


    }


    public static void main(String[] args) {

        System.out.println(strStr("sdfsdfsadbutsad", "sdaed"));

    }
}
