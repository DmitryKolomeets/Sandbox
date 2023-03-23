package JavaRush;

import java.util.Scanner;

public class MinInArray {

    public static int[] array;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int N = console.nextInt();

        array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        console.close();
    }
}
