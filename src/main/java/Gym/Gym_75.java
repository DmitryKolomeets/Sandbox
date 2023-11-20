package Gym;

public class Gym_75 {

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


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));

    }
}
