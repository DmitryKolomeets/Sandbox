package Nail.Test_1;

public class Solution_7 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 12, 66, 15};
        int min = arr[0];
        int max = arr[0];
        int[] x = new int[2];
        int sumMinMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        x[0] = min;
        x[1] = max;
        sumMinMax = min + max;


        System.out.println("min element of array = " + x[0]);
        System.out.println("max element of array = " + x[1]);
        System.out.println("Sum Min + Max of array = " + sumMinMax);
    }

}
