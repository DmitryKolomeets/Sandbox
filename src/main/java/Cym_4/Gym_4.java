package Cym_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Gym_4 {
    public static void main(String[] args) {
        int [] nums1 = {4,56,6,8,9,12,9};
        Set<int[]> set1 = new HashSet<>(Arrays.asList(nums1));

        System.out.println(set1.toString());
    }

}
