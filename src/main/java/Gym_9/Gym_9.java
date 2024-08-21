package Gym_9;

import java.util.Arrays;

public class Gym_9 {

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }


        System.out.println(Arrays.toString(nums));

        System.out.println("count is " + count);
        return count;
    }
}
