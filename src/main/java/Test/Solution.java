package Test;

public class Solution {

    public static void main(String[] args) {



    }

    public static int[] bubbleSort(int[] nums) {

        boolean isSorted = false;

        while (!isSorted) {       // !isSorted = !false = true

            isSorted = true;

            for (int i = 1; i < nums.length; i++) {

                if (nums[i - 1] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return nums;
    }










}
