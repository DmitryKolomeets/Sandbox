package Gym_9;

public class Gym_15 {

    public  static int singleNumber(int[] nums) {

        int result = 0;

        for(int i : nums) {
            result ^= i;
        }
        return result;
    }

}
