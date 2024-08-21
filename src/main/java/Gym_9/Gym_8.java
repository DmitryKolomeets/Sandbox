package Gym_9;

public class Gym_8 {


    public static int removeElement(int[] nums, int val) {
        int numbers = 0;
        int count = 0;
        int[] bufferArray = new int[nums.length];

        for (int i = 0; i < bufferArray.length; i++) {
            bufferArray[i] = nums [i];
        }


        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }


        for (int i = 0; i < bufferArray.length; i++) {
            if (bufferArray[i] != val) {
                nums[count] = bufferArray[i];
                count +=1;
            } else {

            }
        }

        System.out.println("expected Array length is ===> " + bufferArray.length);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("element " + i + " is =====> " + nums[i]);
        }

        System.out.println("number of elements is ======> " + count);

        return count;
    }

}
