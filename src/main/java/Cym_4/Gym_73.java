package Cym_4;

import java.util.Arrays;

public class Gym_73 {

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


    public static void main(String[] args) {

        plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 9});


    }

}
