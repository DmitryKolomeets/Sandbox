package Metanit;

public class Xor {

    public static int missingNumber(int[] nums) {
        int xorAll = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xorAll^=i^nums[i];
        }

        System.out.println("number is====" + xorAll);
        return xorAll;
    }
    public static void main(String[] args) {
        missingNumber(new int[] {0,1}) ;

    }
}
