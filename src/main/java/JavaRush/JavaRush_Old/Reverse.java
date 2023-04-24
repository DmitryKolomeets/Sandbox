package JavaRush.JavaRush_Old;


import java.util.Scanner;

class Reverse {


    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (n > 0) {

            int array[] = new int[n];

            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }

            if (n % 2 == 0) {
               for (int i = n - 1; i >= 0; i--) {
                   System.out.println(array[i]);
               }

            } else { for (int i = 0; i < n; i++){
                System.out.println(array[i]);
            }}


        }




        console.close();
    }
}
