package Gym_5;

public class Gym_38 {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;


        while (low <= high) {

            int middle = low + (high - low) / 2;



            if (target < nums[middle]) {
                high = middle - 1;
            } else if (target>nums[middle]){
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
