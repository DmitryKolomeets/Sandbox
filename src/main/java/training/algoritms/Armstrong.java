package training.algoritms;

public class Armstrong {


    /**
     * Checks whether a given number is an armstrong number or not.
     *
     * @param number number to check
     * @return {@code true} if given number is armstrong number, {@code false}
     * otherwise
     */
    public boolean isArmstrong(int number) {
        long sum = 0;
        long number2 = number;
        while (number2 > 0) {
            long mod = number2 % 10;
            sum += Math.pow(mod, 3);
            number2 /= 10;
        }
        return sum == number;
    }
}
