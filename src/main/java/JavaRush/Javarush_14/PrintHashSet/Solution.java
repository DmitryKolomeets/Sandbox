package JavaRush.Javarush_14.PrintHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {


    public static void print(HashSet<String> words) {
        Iterator <String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
