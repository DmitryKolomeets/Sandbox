package JavaRush.Javarush_14.CheckWords;

import java.util.HashSet;
import static java.util.Arrays.asList;
public class Solution {

    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
       if (words.contains(word)) {
           System.out.println("Слово " + word + " есть в множестве");
       } else {
           System.out.println("Слова " + word + " нет в множестве");
       }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
