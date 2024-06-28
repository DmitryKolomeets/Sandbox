package Gym_6;

import java.util.Arrays;

public class Gym_49 {

    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            ++digits[i];
            digits[i] %= 10;
            if (digits[i] != 0) {
                System.out.println(Arrays.toString(digits));
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        System.out.println(Arrays.toString(digits));
        return digits;


    }
}
