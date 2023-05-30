package JavaRush.JavaRush_16.IOTrainig;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriterEx {

    public static void main(String[] args) {

        String mgnovenie = "Я помню чудное мгновенье:\n" +
                "Передо мной явилась ты,\n" +
                "Как мимолетное виденье,\n" +
                "Как гений чистой красоты.\n" +
                "\n" +
                "В томленьях грусти безнадежной,\n" +
                "В тревогах шумной суеты,\n" +
                "Звучал мне долго голос нежный\n" +
                "И снились милые черты.\n" +
                "\n" +
                "Шли годы. Бурь порыв мятежный\n" +
                "Рассеял прежние мечты,\n" +
                "И я забыл твой голос нежный,\n" +
                "Твои небесные черты.";

        String privet = "Privet";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\Users\\dmitr\\OneDrive\\Рабочий стол\\mgnovenie.txt", true)))
        {
            writer.append(privet);
            System.out.println("Записываем файл...");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
