package JavaRush.JavaRush_16.FileReaderExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {

    public static void main(String[] args) {

        Path input = Paths.get("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\mgnovenie.txt");

        try (BufferedReader reader = Files.newBufferedReader(input))
        {

            int character;
            while ((character= reader.read())!=-1) {
                System.out.print((char) character);
            }

            System.out.println("\n");
            System.out.println("Done");;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }


}
