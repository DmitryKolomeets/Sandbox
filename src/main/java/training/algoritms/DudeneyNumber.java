//package algoritms;
//
//public class DudeneyNumber {
//
//
//    //returns True if the number is a Dudeney number and False if it is not a Dudeney number.
//    public static boolean isDudeney(int n) {
//        // Calculating Cube Root
//        int cube_root = (int) (Math.round((Math.pow(n, 1.0 / 3.0))));
//        // If the number is not a perfect cube the method returns false.
//        if (cube_root * cube_root * cube_root != n) {
//            return false;
//        }
//        int sum_of_digits = 0; // Stores the sums of the digit of the entered number
//        int temp = n; //A temporary variable to store the entered number
//        // Loop to calculate sum of the digits.
//        while (temp > 0) {
//            // Extracting Last digit of the number
//            int rem = temp % 10;
//
//            // Calculating sum of digits.
//            sum_of_digits += rem;
//
//            // Removing the last digit
//            temp /= 10;
//        }
//
//        //If the cube root of the number is not equal to the sum of its digits we return false.
//        if (cube_root != sum_of_digits) {
//            return false;
//        }
//
//        return true;
//    }
//}
