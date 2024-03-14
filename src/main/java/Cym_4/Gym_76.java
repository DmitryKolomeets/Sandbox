package Cym_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Gym_76 {
    static public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] answer = twoSum(nums, target);
        System.out.println(Arrays.toString(answer));


        String[] stringArray = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);


        String[] stringArray2 = {"a", "b", "c", "d", "e"};
        boolean b = Arrays.asList(stringArray).contains("a");
        System.out.println(b);


        String[] stringArray3 = {"a", "b", "c", "d", "e"};
        ArrayList<String> arrayList3 = new ArrayList<String>(Arrays.asList(stringArray));
        String[] stringArr = new String[arrayList.size()];
        arrayList.toArray(stringArr);
        for (String s : stringArr)
            System.out.println(s);


        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArray2 = {6, 7, 8, 9, 10};
        int[] target2 = new int[intArray.length + intArray2.length];
        Integer[] target3 = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        System.arraycopy(intArray, 0, target2, 0, intArray.length);
        System.arraycopy(intArray2, 0, target2, intArray.length, intArray2.length);


        System.out.println("array before sorting  " + Arrays.toString(target2));
        System.out.println("array after sorting-------------------------------");
        Collections.reverse(Arrays.asList(target3));
        System.out.println(Arrays.toString(target3));


        String j = String.join(", ", (new String[]{"a", "b", "c"}));
        System.out.println(j);
    }

}
