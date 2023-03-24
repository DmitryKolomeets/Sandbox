package JavaRush;

import java.util.Arrays;

public class Test {


    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {

        if (array.length%2==0) {
           result[i] = Arrays.copyOfRange(array, 0, (array.length/2));
            int [] part2 = Arrays.copyOfRange(array, (array.length/2), (array.length));

        }

    }



}




// if (array.length % 2 == 0) {
//         Arrays.fill(array, 0, (array.length/2), valueStart);
//         Arrays.fill(array, ((array.length/2)), array.length, valueEnd);
//         } else {
//
//         Arrays.fill(array, 0, ((array.length / 2) + 1), valueStart);
//         Arrays.fill(array, (((array.length / 2)) + 1), array.length, valueEnd);
//         }