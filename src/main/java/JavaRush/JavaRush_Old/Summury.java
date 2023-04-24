package JavaRush.JavaRush_Old;

import java.util.Scanner;

public class Summury {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isENTER = false;

        while (!isENTER) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                sum = sum + x;
            } else if (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();
                if (inputLine.equals("ENTER")) {
                    isENTER = true;
                }
            }
        }
        System.out.println(sum);

        scanner.close();
    }
}
