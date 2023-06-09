package JavaRush.JavaRush_16.FilesTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {


    public static void main(String[] args) {

        Path path = Path.of("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\JavaTest33333.txt" );
        System.out.println(path);
        try {
            Files.writeString(path, "Privet!!!!");
        } catch (IOException e) {
            System.out.println("Poiman exception");
        }
    }
}
