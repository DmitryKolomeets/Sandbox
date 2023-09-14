package Metanit;

public class Excel_sheet {

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
}
