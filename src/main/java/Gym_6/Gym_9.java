package Gym_6;

public class Gym_9 {

    public static int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length())
            return -1;

        if (haystack.length() == needle.length())
            if (!haystack.equals(needle))
                return -1;
            else return 0;


        return haystack.indexOf(needle);


    }

}
