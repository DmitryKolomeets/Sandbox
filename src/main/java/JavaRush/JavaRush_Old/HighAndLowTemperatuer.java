package JavaRush.JavaRush_Old;

import java.util.Scanner;

public class HighAndLowTemperatuer {

    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();

        isHigh = (bodyTemperature > 37);
        isLow =  (bodyTemperature < 36);

        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }

}
