package Nail.Robot;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);


        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) numbers.add(value);
        }

        Collections.sort(numbers);

        for (Integer value : numbers) {
            System.out.println(value);
        }


        scanner.close();
        reader.close();


    }

}
