package lara_dz_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User_23 {

    public static void main(String[] args) throws Exception{

//
//        try (Scanner scanner = new Scanner(System.in); BufferedReader bufferedReader = Files.newBufferedReader(Path.of(scanner.nextLine()))) {
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//        } catch (IOException e) {
//            System.out.println("Something went wrong");
//        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while(scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }


        System.out.print(builder.toString());

        scanner.close();
        reader.close();







    }

}
