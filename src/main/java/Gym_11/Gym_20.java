package Gym_11;

import java.util.Arrays;

public class Gym_20 {

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
}
