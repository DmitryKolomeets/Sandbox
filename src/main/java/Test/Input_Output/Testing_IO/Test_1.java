package Test.Input_Output.Testing_IO;

import JavaRush.JavaRush_21.Solution;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test_1 {

    public static void main(String[] args) throws Exception {

        // Считать строки из консоли и записать их в файл.
        // Использовать метод readLine()
        // 1. Объявление экземпляров классов, которые получают данные (строки)
        InputStreamReader sr = new InputStreamReader(System.in); // создать экземпляр InputStreamReader
        BufferedReader br = new BufferedReader(sr); // класс буферизации

        // 2. Объявление экземпляров классов, выводящих строки
        FileOutputStream fos = new FileOutputStream("strings.txt");
        PrintStream ps = new PrintStream(fos);

        // 3. Дополнительная переменная
        String s;

        // 4. Цикл ввода строк из консоли и запись их в файл
        System.out.println("Enter strings:");

        do {
            s = br.readLine(); // считать одну строку
            System.out.println(s); // вывести эту строку на экран
            ps.println(s); // записать эту строку в поток ps => записать в файл "strings.txt"
        } while (!s.equals("end")); // пока не будет введена строка "end"

        ps.close();


    }
}
