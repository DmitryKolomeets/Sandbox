package JavaRush.JavaRush_16.ConfusedBytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class MethodsIO {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt"), UTF_8);


        for (String s: lines) {
            System.out.println(s);
        }
    }

}
