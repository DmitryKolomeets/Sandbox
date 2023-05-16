package JavaRush.JavaRush_10.HashMap;

import java.util.ArrayList;
import java.util.HashMap;


public class Solution_4 {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        HashMap<Integer, String> map = new HashMap<>();

        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");

        int i = 0;
        for (String value : programmingLanguages) {
            map.put(i, value);
            i++;
        }
        return map;
    }

}
