package Cym_4;

public class Gym_139 {

    public static int missingNumber(int[] nums) {
        int xorAll = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xorAll^=i^nums[i];
        }

        System.out.println("number is====" + xorAll);
        return xorAll;
    }
}
