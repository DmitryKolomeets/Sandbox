package JavaRush.JavaRush_16.OutPutStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1 {


    public static void main(String[] args) {

        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        try (FileInputStream input = new FileInputStream(src);
             FileOutputStream output = new FileOutputStream(dest)) {

            byte [] buffer = new byte[65536];
            while (input.available()>0) {
                int real = input.read(buffer);
                output.write(buffer,0 ,real);
            }



        } catch (Exception e) {
            System.out.println("Somtheing went wrong" + e);
        }
    }









}
