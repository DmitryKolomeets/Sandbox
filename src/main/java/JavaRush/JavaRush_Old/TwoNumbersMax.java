package JavaRush.JavaRush_Old;

import java.util.Scanner;

public class TwoNumbersMax {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();

        if (Math.abs(b - a) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
        console.close();

    }


}
