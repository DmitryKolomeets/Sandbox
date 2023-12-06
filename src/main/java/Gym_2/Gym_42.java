package Gym_2;

public class Gym_42 {


    public static int pow(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

//    public static void main(String[] args) {
//        System.out.println(Answer_2.pow(7, 4));
//    }

}
