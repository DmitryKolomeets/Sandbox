package JavaRush.JavaRush_Old;

public class Rectangle {

    public static void main(String[] args) {

        int line = 0;
        while (line < 10)
        {
            int number = 0;
            while (number < 20)
            {
                if (line == 0 || line == 9) {
                    System.out.print("Б");
                } else {
                    if (number == 0 || number == 19) {
                        System.out.print("Б");
                    }
                    System.out.print(" ");
                }
                number++;
            }
            System.out.println();
            line++;
        }
    }
}
