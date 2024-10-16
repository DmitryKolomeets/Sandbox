package Gym_11;

public class Gym_22 {

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
}
