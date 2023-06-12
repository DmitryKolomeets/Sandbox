package JavaRush.JavaRush_16.Network;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Solution {

    public static void main(String[] args) {

        try {
            URL url = new URL("http://httpbin.org/post");
            URLConnection connection = url.openConnection();
            connection.setDoOutput(true);

            try (OutputStream output = connection.getOutputStream();
                 PrintStream sender = new PrintStream(output)) {
                sender.println("Privet!!!!");
            } catch (IOException e) {
                System.out.println("Poiman exception in outputStream" + e);
            }

            try (InputStream input = connection.getInputStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
                while (reader.ready()) {
                    System.out.println(reader.readLine());
                }
            }
        } catch (MalformedURLException e) {
            System.out.println("Poiman exception" + e);
        } catch (IOException e) {
            System.out.println("Poiman exception" + e);
        }
    }
}
