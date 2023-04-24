package JavaRush.JavaRush_Old;

import java.util.Scanner;

public class TwoStringIgnoreCase {

    public static String secret = "AmIGo";

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String inputPassword = console.nextLine();

        System.out.println(secret.equalsIgnoreCase(inputPassword) ? "доступ разрешен" :  "доступ запрещен");

        console.close();
    }
}
