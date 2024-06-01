package Gym_5;

import java.util.Arrays;

public class Gym_89 {

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
}
