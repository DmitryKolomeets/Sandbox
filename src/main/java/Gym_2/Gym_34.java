package Gym_2;

public class Gym_34 {

    public static int mySqrt(int x) {
        int low = 1;
        int high = x;
        int res = 0;


        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (middle <= x / middle) { //  middle * middle = x
                low = middle + 1;
                res = middle;
            } else {
                high = middle - 1;
            }
        }
        return res;

    }


    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
