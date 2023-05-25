package JavaRush.JavaRush_16.ConfusedBytes;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class Solution {


    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in); InputStream input = Files.newInputStream(Path.of(scanner.nextLine())); OutputStream output = Files.newOutputStream(Path.of(scanner.nextLine()))) {

            byte[] buffer = new byte[65536];

            while (input.available() > 0)
            {
                int real = input.read(buffer);
            }


            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] == (buffer.length-1)
                { if (buffer[i]%2==0)
                {
                    output.write(buffer[i]);
                }

                }


                byte first = buffer[i];
                byte second = buffer[i+1];
                buffer[i] = second;
                buffer[i+1] = first;
            }




            output.write(buffer);

        } catch (Exception e) {
            System.out.println("something went wrong : " + e);
            throw new RuntimeException();
        }
    }
}
