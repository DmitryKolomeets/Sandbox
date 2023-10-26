package Gym;

import java.util.Arrays;

public class Gym_15 {

    public static int removeDuplicates(int[] nums) {

        int count = 1;

        int number = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != number ) {
                number = nums[i];
                nums[count]=number;
                count++;

            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);
        return count;
    }


    public static void main(String[] args) {

        removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});

        System.out.println();


    }

}
