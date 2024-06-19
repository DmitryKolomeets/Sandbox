package Gym_6;

import java.util.Arrays;

public class Gym_21 {


    public static int maximumProduct(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);

        return Math.max(nums[n-1]*nums[n-2]*nums[n-3], nums[n-1]*nums[0] * nums[1]);


    }
}
