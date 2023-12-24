package Gym_2;

import java.util.Arrays;

public class Gym_86 {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                System.out.println(Arrays.toString(digits));
                return digits;
            } else {
                digits[i] = 0;
            }

        }
        int [] res = new int [digits.length+1];
        res[0] = 1;
        System.out.println(Arrays.toString(res));
        return res;
    }


    public static void main(String[] args) {

        plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 9});


    }
}
