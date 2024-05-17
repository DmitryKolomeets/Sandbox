package Gym_5;

public class Gym_52 {

    public static boolean checkPerfectNumber(int num) {
        if (num <= 0) return false;
        int sum = 0;
        for (int i = 1; i*i <= num; ++i) {
            if (num % i == 0) {
                sum += i;
                if (i*i != num) sum += num/i;
            }
        }
        return sum-num == num;

    }
}
