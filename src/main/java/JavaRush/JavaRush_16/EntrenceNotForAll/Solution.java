package JavaRush.JavaRush_16.EntrenceNotForAll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Solution {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
        for (int i = 0; i < lines.size(); i+=2) {
            System.out.println(lines.get(i));
        }
    }
}