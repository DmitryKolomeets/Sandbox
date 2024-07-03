package Gym_6;

public class Gym_58 {

    public boolean isPalindrome(int x) {
        int number = x;
        int reversed = 0;
        boolean result = true;

        if (x < 0) {
            result = false;
        } else if ( x>=0 ){
            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            if (x == reversed) {
                result = true;
            } else {
                result = false;
            }
        }

        return result;
    }
}
