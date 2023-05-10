package JavaRush.Javarush_13.Pascal;
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {

    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
       programmingLanguages.remove("Pascal");
        System.out.println(programmingLanguages);
    }
}
