package Gym_11;

public class Gym_36 {

    public static int missingNumber(int[] nums) {
        int xorAll = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xorAll^=i^nums[i];
        }

        System.out.println("number is====" + xorAll);
        return xorAll;
    }
}
