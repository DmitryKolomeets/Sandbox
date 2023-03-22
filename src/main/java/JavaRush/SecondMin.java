package JavaRush;

import java.util.Scanner;


public class SecondMin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min1 = 2147483647;
        int min2 = 0;

        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else {
                if (x<min2 && x>min1) {
                    min2 = x;
                } else  {continue;}
            }
        }
        System.out.println(min2);
        scanner.close();
    }
}


