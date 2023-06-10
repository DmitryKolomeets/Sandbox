package JavaRush.JavaRush_16.Network;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {


    public static void main(String[] args) {

        File file = new File("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\test12234235.txt ");

        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!";
            fileOutputStream.write(greetings.getBytes());
        } catch (IOException e) {
            System.out.println("poiman Exception ===> " + e);
        }

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Username\\Desktop\\test.txt")) {

            int i;

            while ((i = fileInputStream.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Poiman exception ===> " + e);
        }
    }


}

