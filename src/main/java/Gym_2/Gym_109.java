package Gym_2;

public class Gym_109 {

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        char[] letters = columnTitle.toCharArray();
        for (int i = 0; i < columnTitle.length(); i++) {
            char symbol = letters[i];
            int number = symbol - 64;
            result = result * 26 + number;

        }

        return result;

    }


    public static void main(String[] args) {
        int number = titleToNumber("FXSHRXW");
        System.out.println(number);

    }
}
