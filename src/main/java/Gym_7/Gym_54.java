package Gym_7;

public class Gym_54 {

    public static boolean checkPerfectNumber(int num) {

        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }

        }
        return sum == num;

    }
}
