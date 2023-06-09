package JavaRush.JavaRush_16.FileOperations;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test1 {

    public static void main(String[] args) {



        Path path = Path.of("c:\\Users\\dmitr\\OneDrive\\Рабочий стол");

        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path path1 : files)
                System.out.println(path1);
        } catch (IOException e) {
            System.out.println("exception poiman");
        }
    }
}
