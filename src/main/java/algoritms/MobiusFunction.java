package algoritms;

public class MobiusFunction {


    /**
     * This method returns μ(n) of given number n
     *
     * @param number Integer value which μ(n) is to be calculated
     * @return  1 when number is less than or equals 1
     *            or number has even number of prime factors
     *          0 when number has repeated prime factor
     *         -1 when number has odd number of prime factors
     */
    static int mobius(int number) {
        if (number <= 0) {
            //throw exception when number is less than or is zero
            throw new IllegalArgumentException(
                    "Number must be greater than zero."
            );
        }

        if (number == 1) {
            //return 1 if number passed is less or is 1
            return 1;
        }

        int primeFactorCount = 0;

        for (int i = 1; i <= number; i++) {
            //find prime factors of number
            if (number % i == 0 && PrimeCheck.isPrime(i)) {
                //check if number is divisible by square of prime factor
                if (number % (i * i) == 0) {
                    //if number is divisible by square of prime factor
                    return 0;
                }
                /*increment primeFactorCount by 1
				if number is not divisible by square of found prime factor*/
                primeFactorCount++;
            }
        }

        return (primeFactorCount % 2 == 0) ? 1 : -1;
    }
}
