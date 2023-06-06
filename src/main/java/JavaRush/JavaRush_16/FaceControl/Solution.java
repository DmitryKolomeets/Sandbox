package JavaRush.JavaRush_16.FaceControl;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {
            List<String> list = Files.readAllLines(Paths.get(scanner.nextLine()));
            list.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char character : chars) {
                    if (character != ' ' && character != '.' && character != ',') {
                        System.out.print(character);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println("poiman Exception" + e);
        }
    }

}


