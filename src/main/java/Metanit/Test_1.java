package Metanit;

import java.lang.reflect.Array;

public class Test_1 {

    public static void main(String[] args) {
        int[] array = {98, 23, 1, 98, 43, -45, -46, -150};
        int minimum = min(array);
        int maximum = max(array);
        System.out.println("Minimum in array = " + minimum + " Maximum in array = " + maximum);
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max) {
                max= array[i];
            }
        }
        return max;
    }




}
