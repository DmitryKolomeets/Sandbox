package JavaRush;

import java.util.Scanner;

public class ThreeNumbers {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int number_1 = console.nextInt();
        int number_2 = console.nextInt();
        int number_3 = console.nextInt();

        if (number_1 == number_2) {
            if (number_1 == number_3)
                System.out.println(number_1 + " " + number_2 + " " + number_3);
            else
                System.out.println(number_1 + " " + number_2);
        } else {
            if (number_2 == number_3) {
                System.out.println(number_2 + " " + number_3);
            } else {
                if (number_1 == number_3)
                    System.out.println(number_1 + " " + number_3);
            }

            console.close();
        }
    }
}
