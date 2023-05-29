package JavaRush.JavaRush_16.WarAndPeace;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SolutionWarAndPeace {

    Path source = Paths.get("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\War.txt");
    Path output = Paths.get("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\War_remastered.txt");


    public void warAndPeaceFilterAndCout() {

        try (BufferedReader reader = Files.newBufferedReader(source); BufferedWriter writer = Files.newBufferedWriter(output)) {
            List<Map.Entry<String, Long>> list = reader.lines()
                    .flatMap(s -> Arrays.stream(s.split(" ")))
                    .filter(s -> s.length() > 3)
                    .map(s -> s
                            .toLowerCase()
                            .replace(".", "")
                            .replace(",", "")
                            .replace("!", "")
                            .replace("?", "")
                            .replace("<<", "")
                            .replace(">>", "")
                            .replace(";", "")
                            .replace(":", ""))
                    .filter(s -> !s.contains("русс"))
                    .filter(s -> !s.contains("россия"))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .toList();

            writer.write(String.valueOf(list) + '\n');


        } catch (IOException e) {
            throw new RuntimeException();
        }


    }


    public static void main(String[] args) {

        SolutionWarAndPeace solutionWarAndPeace = new SolutionWarAndPeace();
        solutionWarAndPeace.warAndPeaceFilterAndCout();

    }
}
