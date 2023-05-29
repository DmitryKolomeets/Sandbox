package JavaRush.JavaRush_16.ConfusedBytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) throws IOException {

        Stream<String> stream = Files.lines(Paths.get("C:\\Users\\Username\\Desktop\\pushkin.txt"));

        List<String> result  = stream
                .filter(line -> line.startsWith("Как"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
