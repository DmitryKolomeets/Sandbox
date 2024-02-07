package Gym_3;

import java.util.Arrays;

public class Gym_73 {

    static void bubleSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }

    static void reverseArray(int[] nums) {
        for (int index = 0; index < nums.length / 2; ++index) {
            int temp = nums[index];
            nums[index] = nums[nums.length - 1 - index];
            nums[nums.length - 1 - index] = temp;
        }
    }


    public static void main(String[] args) {
        int[] myArray = {89, 756, 3, 2, 0, 45, 11, 5, 30};
        int[] arrayForReverce = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        bubleSort(myArray);
        reverseArray(arrayForReverce);
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(arrayForReverce));
    }
}
