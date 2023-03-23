package JavaRush;

import java.util.Scanner;

public class TriangleIsLive {

    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int side_A = console.nextInt();
        int side_B = console.nextInt();
        int side_C = console.nextInt();

        if ((side_A < (side_B + side_C)) & (side_B < (side_A + side_C)) & (side_C < (side_A + side_B))) {
            System.out.println(TRIANGLE_EXISTS);
        } else System.out.println(TRIANGLE_NOT_EXISTS);

        console.close();

    }
}
