package Gym_10;

public class Gym_17 {


    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count += 1;
                }
            }
        }
        return count;
    }

}
