package Nail.Nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution_1 {

    public static <List> void main(String[] args) {

        String src = "c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\IN.txt";
        String dest = "c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\OUT.txt";

        Path in = Paths.get("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\IN.txt");
        Path out = Paths.get("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\OUT.txt");

        try (BufferedReader reader = Files.newBufferedReader(in); BufferedWriter writer = Files.newBufferedWriter(out)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}