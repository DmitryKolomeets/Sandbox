package Gym_10;

public class Gym_19 {

    public static int missingNumber(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int actualSum = (nums.length * (nums.length + 1)) / 2;

        System.out.println("sum====" + sum);
        System.out.println("actualSum====" + actualSum);

        int missingNumber = actualSum - sum;
        System.out.println("missingNumber====" + missingNumber);
        return missingNumber;
    }


    public static void main(String[] args) {
        missingNumber(new int[] {0,1}) ;


    }

}
