package drinksMashin;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = scanner.nextLine();
        System.out.println(answer);
        while (answer.equals("yes")) {
            System.out.println(answer);
            System.out.println("input new answer");
            answer = scanner.nextLine();
        }
    }

}
