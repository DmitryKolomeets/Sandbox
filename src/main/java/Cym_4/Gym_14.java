package Cym_4;

public class Gym_14 {

    public  static int singleNumber(int[] nums) {

        int result = 0;

        for(int i : nums) {
            result ^= i;
        }
        return result;
    }


    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2,9,11,9,11};

        System.out.println(singleNumber(nums));

    }


}
