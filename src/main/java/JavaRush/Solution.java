package JavaRush;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
//        String binaryNumber = "1111111111111111111111111111111";
//        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }


    public static String toBinary(int decimalNumber) {
        if (decimalNumber > 0) {
            StringBuilder builder = new StringBuilder();
            int binaryNumber = 0;
            while (decimalNumber != 0) {
                binaryNumber = decimalNumber % 2;
                decimalNumber = decimalNumber / 2;
                builder.append(binaryNumber);
            }
            String result = builder.toString();

            return result;
        } else {
            return "";

        }

    }

//    //for (int i = 0; i < длины двоичного представления; i++) {
////        десятичное число = десятичное число + число из двоичного представления * на 2 в степени i
////    }
//    public static int toDecimal(String binaryNumber) {
//        if ((binaryNumber.isEmpty()) || binaryNumber == null) {
//            return 0;
//        } else {
//            BigInteger binaryNumberToint = new BigInteger(binaryNumber);
//            int decimalNumber = 0;
//            for (int i = 0; i < binaryNumber.length(); i++) {
//                decimalNumber = (decimalNumber + binaryNumberToint * ( Math.pow(2, i)));
//            }
//            decimalNumber = decimalNumber.intValueExact(decimalNumber);
//            return decimalNumber;
//        }
//
//    }

}
