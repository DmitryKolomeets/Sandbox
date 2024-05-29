package Gym_5;

public class Gym_83 {

    public  static int singleNumber(int[] nums) {

        int result = 0;

        for(int i : nums) {
            result ^= i;
        }
        return result;
    }

}
