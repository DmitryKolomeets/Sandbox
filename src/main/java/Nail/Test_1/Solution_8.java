package Nail.Test_1;

public class Solution_8 {



    public static int pow(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
