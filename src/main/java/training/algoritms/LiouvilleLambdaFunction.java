//package algoritms;
//
//public class LiouvilleLambdaFunction {
//
//    /**
//     * This method returns λ(n) of given number n
//     *
//     * @param number Integer value which λ(n) is to be calculated
//     * @return  1 when number has even number of prime factors
//     *         -1 when number has odd number of prime factors
//     * @throws IllegalArgumentException when number is negative
//     */
//    static int liouvilleLambda(int number) {
//        if (number <= 0) {
//            //throw exception when number is less than or is zero
//            throw new IllegalArgumentException(
//                    "Number must be greater than zero."
//            );
//        }
//
//        //return 1 if size of prime factor list is even, -1 otherwise
//        return PrimeFactorization.pfactors(number).size() % 2 == 0 ? 1 : -1;
//    }
//}
