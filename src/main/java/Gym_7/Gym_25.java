package Gym_7;

public class Gym_25 {

    public static boolean isPowerOfTwo(int n) {



        if(n==0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }

}
