package Gym_3;

public class Gym_66 {

    public static int thirdMax(int[] nums) {

        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int elemCounted = 1;
        int prevElem = nums[0];

        for (int index = 1; index < nums.length; ++index) {
            // Current element is different from previous.
            if (nums[index] != prevElem) {
                elemCounted += 1;
                prevElem = nums[index];
            }

            // If we have counted 3 numbers then return current number.
            if (elemCounted == 3) {
                return nums[index];
            }
        }

        // We never counted 3 distinct numbers, return largest number.
        return nums[0];

    }

    public static void main(String[] args) {
        int[] array = {2, 6, 7, 4, 234, 456, 55, 34, 67};

        System.out.println(thirdMax(array));

    }
}
