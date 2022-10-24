//package algoritms;
//
//public class Digital_root class DigitalRoot {
//
//    public static int digitalRoot(int n) {
//        if (single(n) <= 9) { // If n is already single digit than simply call single method and return the value
//            return single(n);
//        } else {
//            return digitalRoot(single(n));
//        }
//    }
//
//    // This function is used for finding the sum of digits of number
//    public static int single(int n) {
//        if (n <= 9) { // if n becomes less than 10 than return n
//            return n;
//        } else {
//            return (n % 10) + single(n / 10); // n % 10 for extracting digits one by one
//        }
//    } // n / 10 is the number obtainded after removing the digit one by one
//    // Sum of digits is stored in the Stack memory and then finally returned
//
//}
///**
// * Time Complexity : O((Number of Digits)^2) Auxiliary Space Complexity :
// * O(Number of Digits) Constraints : 1 <= n <= 10^7
// */{
//}
