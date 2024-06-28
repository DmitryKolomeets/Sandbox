package Gym_6;

import java.util.Arrays;

public class Gym_48 {

    public static int[] plusOne(int[] digits) {
        long reversed = 0;
        long arrayLenght = 0;

        long number = 0;
        long count = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i]==0) {

                count *= 10;

            } else {
                number = number + (digits[i] * count);
                count *= 10;
            }

        }

        System.out.println("parsed number =====> " +  number);

        number += 1;

        while (number != 0) {
            long digit = number % 10;
            reversed = reversed * 10 + digit;
            arrayLenght +=1;
            number /= 10;
        }

        long buffer = reversed;


        System.out.println("Dlinna ====>" + arrayLenght);

        int[] result = new int [(int) arrayLenght];

        while (buffer != 0) {
            for (int i = 0; i < result.length; i++) {
                long digit = buffer / 10;
                long arrayDigit = buffer - digit * 10;
                result[i] = (int) arrayDigit;
                buffer = (buffer - arrayDigit) / 10;
            }
        }

        System.out.println(number);
        System.out.println("our array  " + Arrays.toString(result));
        System.out.println("reversed is ===> " + reversed);
        System.out.println("number is ====> " + number);

        return result;

    }

}
