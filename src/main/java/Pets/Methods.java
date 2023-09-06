package Pets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Methods {




    public static void read(String s) {
        Path path = Paths.get(s);
        Path buffer = Paths.get("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\buffer.txt");
        try (BufferedReader reader = Files.newBufferedReader(path); BufferedWriter writer = Files.newBufferedWriter(buffer)) {
            List<String> list = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }

            for (String e : list) {
                System.out.println(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void screenOut() {

    }


    public static void main(String[] args) {
        String s = "c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\IN.txt";
        read(s);

    }


}
