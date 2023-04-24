package JavaRush.JavaRush_Old;

import java.util.Scanner;

public class MaxInArray {

    public static int[] array;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int N = console.nextInt();

        array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        console.close();


    }

}
