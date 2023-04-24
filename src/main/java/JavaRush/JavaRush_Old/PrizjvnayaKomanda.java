package JavaRush.JavaRush_Old;

import java.util.Scanner;

public class PrizjvnayaKomanda {
    public static void main(String[] args) {

        String militaryCommissar = ", явитесь в военкомат";

        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        int age = console.nextInt();

        if (age >= 18 & age <= 28)

            System.out.println(name + militaryCommissar);


        console.close();

    }

}
