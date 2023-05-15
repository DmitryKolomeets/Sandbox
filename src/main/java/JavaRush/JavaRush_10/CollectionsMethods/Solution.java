package JavaRush.JavaRush_10.CollectionsMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {


    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);

    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
Collections.replaceAll(list, oldValue, newValue);
    }

}
