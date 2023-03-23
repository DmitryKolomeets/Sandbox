package JavaRush;

import java.util.Scanner;

public class WarmOrCold {


    public static void main(String[] args) {

        String cold = "на улице холодно";
        String warm = "на улице тепло";

        Scanner console = new Scanner(System.in);

        int temperature = console.nextInt();

        if (temperature < 0)
            System.out.println(cold);
        else

            System.out.println(warm);


            console.close();
    }

}
