package JavaRush.JavaRush_Old;

import java.util.Scanner;

public class TwoNumbersMaximum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();


       int max = numberA > numberB ? numberA : numberB;

        System.out.println(max);


        scanner.close();
    }
}
