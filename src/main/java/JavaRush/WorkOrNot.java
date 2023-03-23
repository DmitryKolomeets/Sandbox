package JavaRush;

import java.util.Scanner;

public class WorkOrNot {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int age = console.nextInt();

        if ((age < 20) || (age > 60))

            System.out.println("можно не работать");

        console.close();
    }
}
