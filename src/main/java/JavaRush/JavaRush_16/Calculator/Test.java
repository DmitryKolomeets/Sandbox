package JavaRush.JavaRush_16.Calculator;

import java.util.Scanner;

public class Test {

   static Scanner scanner = new Scanner(System.in);
    public static int scanNumber() {
        System.out.println("Enter the number");

        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Number is incorrect");
            scanner.next();
            number = scanner.nextInt();
        }

        return number;
    }



    public static void main(String[] args) {


        int a = scanNumber();
        System.out.println("number a = " + a);
        int b = scanNumber();
        System.out.println("number b = " + b);


    }
}
