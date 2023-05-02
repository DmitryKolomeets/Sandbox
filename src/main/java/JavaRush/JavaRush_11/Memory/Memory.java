package JavaRush.JavaRush_11.Memory;

import java.util.Arrays;

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] temp = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]==null) {continue;}
            else {
               array[count]  = temp [i] ;
                count ++;
            }
        }

    }
}
