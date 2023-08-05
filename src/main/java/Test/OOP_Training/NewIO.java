package Test.OOP_Training;

import java.io.*;

public class NewIO {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String destinationFile = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

        StringBuilder builder = new StringBuilder();

        String s = "";

        while (!s.equals("exit")) {
            s = reader.readLine();
            builder.append(s).append("\n");
        }



        writer.write(builder.toString());
        writer.close();
    }
}
