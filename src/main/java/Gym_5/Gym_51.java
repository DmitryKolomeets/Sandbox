package Gym_5;

public class Gym_51 {

    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i*i <= num; ++i) {
            if (num % i == 0) {
                sum += i;
                if (i*i != num) sum += num/i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {

        checkPerfectNumber(28);

    }
}
