package Gym_3;

public class Gym_53 {

    public boolean isPowerOfFour(int n) {
        if (n == 0) return false;


        while (n % 4 == 0) {
            n = n / 4;
        }


        if (n == 1) {
            return true;
        } else {
            return false;
        }


    }
}
