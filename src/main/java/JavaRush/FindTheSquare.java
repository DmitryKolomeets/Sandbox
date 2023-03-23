package JavaRush;

import java.util.Scanner;

public class FindTheSquare {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        int x = console.nextInt();
        int y = console.nextInt();

        if ((x > 0) && (y > 0))
            System.out.println("1");
        else if ((x < 0) && (y > 0)) {System.out.println("2");}
        else if ((x < 0) && (y < 0)) {System.out.println("3");}
        else if ((x > 0) && (y < 0)) {System.out.println("4");}


        console.close();
    }
}
