package Gym_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Gym_19 {


//    Integer[] A = {22, 45, 33, 66, 55, 34, 77};
//    Integer[] B = {33, 2, 83, 45, 3, 12, 55};
//    Set<Integer> set1 = new HashSet<Integer>();
//        set1.addAll(Arrays.asList(A));
//    Set<Integer> set2 = new HashSet<Integer>();
//        set2.addAll(Arrays.asList(B));
//
//    // Finding Union of set1 and set2
//    Set<Integer> union_data = new HashSet<Integer>(set1);
//        union_data.addAll(set2);
//        System.out.print("Union of set1 and set2 is:");
//        System.out.println(union_data);


    public static int[] intersection(int[] nums1, int[] nums2) {

//        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
//        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int e : nums1) {
            set1.add(e);
        }

        for (int e : nums2) {
            set2.add(e);
        }


        set1.retainAll(set2);
        return set1.stream().mapToInt(Integer::intValue).toArray();


    }


    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));


    }
}
