package JavaRush;

import java.util.Scanner;

public class arrayDoublesDelete {


    public static String[] strings;

    public static void main(String[] args) {

        strings = new String[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null) {
                continue;
            }
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString.equals(strings[j])) {

                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }


        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }


        scanner.close();
    }


}
