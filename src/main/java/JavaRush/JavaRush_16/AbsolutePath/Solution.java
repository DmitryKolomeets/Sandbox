package JavaRush.JavaRush_16.AbsolutePath;

import java.nio.file.Path;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if(Path.of(str).isAbsolute()) {

            System.out.println(str);
        } else {
            System.out.println( Path.of(str).toAbsolutePath());
        }


    }


}
