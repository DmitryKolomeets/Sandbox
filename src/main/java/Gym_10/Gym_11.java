package Gym_10;

public class Gym_11 {

    public static int missingNumber(int[] nums) {
        int xorArray = 0;
        for (int i : nums) {
            xorArray ^= i;
        }
        int xorAll = 0;
        for (int i = 0; i <= nums.length; i++) {
            xorAll ^= i;
        }
        int number = xorArray ^ xorAll;
        System.out.println("number is====" + number);
        return xorArray ^ xorAll;
    }


}
