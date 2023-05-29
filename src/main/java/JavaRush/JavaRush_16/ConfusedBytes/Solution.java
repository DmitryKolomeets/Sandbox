package JavaRush.JavaRush_16.ConfusedBytes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in); InputStream is = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream os = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            byte[] buffer = new byte[8192];
            while (is.available() > 0) {
                int read = is.read(buffer);
                for (int i = 0; i < read; i += 2) {
                    if (i + 1 == read) {
                        break;
                    } else {
                        int tmp;
                        tmp = buffer[i];
                        buffer[i] = buffer[i + 1];
                        buffer[i + 1] = (byte) tmp;
                    }
                }
                os.write(buffer, 0, read);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
