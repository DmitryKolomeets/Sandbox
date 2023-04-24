//package algoritms;
//
//public class AmicableSum {
//    /**
//     * Finds the aliquot sum of an integer number.
//     *
//     * @param number a positive integer
//     * @return aliquot sum of given {@code number}
//     */
//    public static int getAliquotValue(int number) {
//        var sumWrapper = new Object() {
//            int value = 0;
//        };
//
//        IntStream
//                .iterate(1, i -> ++i)
//                .limit(number / 2)
//                .filter(i -> number % i == 0)
//                .forEach(i -> sumWrapper.value += i);
//
//        return sumWrapper.value;
//    }
//
//}
