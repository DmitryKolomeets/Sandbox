package Gym_6;

import java.util.Arrays;

public class Gym_10 {

    public static int largestAltitude(int[] gain) {

        int[] altitudes = new int[gain.length + 1];

        for (int i = 0; i < gain.length; i++) {
            altitudes[i+1] = gain[i] + altitudes[i];
        }

        System.out.println(Arrays.toString(altitudes));

        int largestAltitude = 0;
        for (int i = 0; i < altitudes.length; i++) {
            if (altitudes[i] > largestAltitude) {
                largestAltitude = altitudes[i];
            }
        }
        return largestAltitude;
    }

}
