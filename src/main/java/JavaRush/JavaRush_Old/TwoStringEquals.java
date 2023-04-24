package JavaRush.JavaRush_Old;

import java.util.Scanner;

public class TwoStringEquals {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String line_1 = console.nextLine();
        String line_2 = console.nextLine();

        if (line_1.equals(line_2))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");

        console.close();

    }


}
