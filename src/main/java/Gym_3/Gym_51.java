package Gym_3;

public class Gym_51 {

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





    public static void main(String[] args) {
        missingNumber(new int[] {0,1}) ;
        System.out.println("alles gut");

    }
}
