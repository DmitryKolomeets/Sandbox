package JavaRush.JavaRush_16.LookToTheRoot;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str).getRoot();


    }

}
