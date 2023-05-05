package JavaRush.JavaRush_10.Tokenizer;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] array = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = tokenizer.nextToken();
            }

        }

        return array;
    }

}
