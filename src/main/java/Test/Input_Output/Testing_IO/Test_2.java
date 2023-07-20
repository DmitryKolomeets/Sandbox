package Test.Input_Output.Testing_IO;

import java.io.FileReader;

public class Test_2 {

    public static void main(String[] args) throws Exception{
        // Прочитать строки из файла и вывести их на консоль
        FileReader fr = new FileReader("strings.txt");
        char buffer[] = new char[1000]; // буфер для чтения строк

        // Цикл чтения строк из файла
        do {
            fr.read(buffer); // Прочитать строку в буфер buffer
            System.out.println(buffer); // Вывести строку на консоль
        } while (fr.ready()); // проверка, не конец ли файла

        fr.close();


    }
}
