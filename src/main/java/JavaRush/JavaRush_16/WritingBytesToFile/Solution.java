package JavaRush.JavaRush_16.WritingBytesToFile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;

public class Solution {

    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        Scanner scanner = new Scanner(System.in);
        Files.write(Path.of(scanner.nextLine()), bytes);
    }
}
