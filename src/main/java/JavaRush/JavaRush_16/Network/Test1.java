package JavaRush.JavaRush_16.Network;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class Test1 {

    public static void main(String[] args) throws MalformedURLException, IOException {


        String image = "https://habr.com/ru/articles/312792/";
        URL url = new URL(image);
        InputStream input = url.openStream();

        byte[] buffer = input.readAllBytes();
        String string = new String(buffer);
        System.out.println(string);


    }


}
