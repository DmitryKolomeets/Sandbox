package Gym_2;

public class Gym_127 {
    public int addDigits(int num) {
        if (num == 0) return 0;

        // if a number is divisible by 9 then the sum of its numbers is 9. The rule of 9 divisible
        // if number is not divisible by 9 then sum of number is ===> number % 9

        return (num%9==0) ? 9 : num % 9;

    }
}
