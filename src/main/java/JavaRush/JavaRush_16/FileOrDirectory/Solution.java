package JavaRush.JavaRush_16.FileOrDirectory;

import javax.script.ScriptEngine;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {


    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            if (Files.isDirectory(Path.of(str))) {
                System.out.println(str + THIS_IS_DIR);
            } else if (Files.isRegularFile(Path.of(str))) {
                System.out.println(str + THIS_IS_FILE);
            } else {
                break;
            }

        }
    }


}
