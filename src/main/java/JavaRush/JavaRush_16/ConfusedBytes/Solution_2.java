package JavaRush.JavaRush_16.ConfusedBytes;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution_2 {

    public static void main(String[] args) {

        Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

        Path fileName = testFilePath.getFileName();
        System.out.println(fileName);

        Path parent = testFilePath.getParent();
        System.out.println(parent);

        Path root = testFilePath.getRoot();
        System.out.println(root);

        boolean endWithTxt = testFilePath.endsWith("Desktop\\testFile.txt");
        System.out.println(endWithTxt);

        boolean startsWithLalala = testFilePath.startsWith("lalalala");
        System.out.println(startsWithLalala);


        Path testFilePath_2 = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

        System.out.println(testFilePath_2.endsWith("estFile.txt"));
        System.out.println(testFilePath_2.endsWith("Desktop\\testFile.txt"));


        Path testFilePath_3 = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

        System.out.println(testFilePath_3.isAbsolute());

        Path path5 = Paths.get("C:\\Users\\Java\\.\\examples");

        System.out.println(path5.normalize());

        Path path6 = Paths.get("C:\\Users\\Java\\..\\examples");
        System.out.println(path6.normalize());

        System.out.println("Переменная пути № 6 = " + path6.toString());

        Path testFilePath1 = Paths.get("C:\\Users\\Users\\Users\\Users");
        Path testFilePath2 = Paths.get("C:\\Users\\Users\\Users\\Users\\Username\\Desktop\\testFile.txt");

        System.out.println(testFilePath1.relativize(testFilePath2));








    }

}
