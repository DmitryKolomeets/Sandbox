//package JavaRush.JavaRush_16.Calculator;
//
//
//
//import java.io.IOException;
//import java.util.Objects;
//import java.util.Scanner;
//
//
//
//
//public class Methods {
//
//   public static Scanner scanner = new Scanner(System.in);
//
//    public static void start() {
//        welcomeMenu();
//        double number_1 = scanNumber();
//        double number_2 = scanNumber();
//        char operator = scanOperation();
//        double result = calculation(number_1, number_2, operator);
//        System.out.println("Result of calculation = " + result);
//        resumeOrExit();
//    }
//
//
//    public static void welcomeMenu() {
//        System.out.println("\nWelcome to the calculator ver. 1.0\n");
//        System.out.println("Enter the expression like this: Number, Operation Sign, Number\n");
//    }
//
//
////    public static double scanNumber() {
////        System.out.print("Enter the number please");
////        double number;
////        try (Scanner scanner = new Scanner(System.in)) {
////            if (scanner.hasNextDouble()) {
////                number = Double.parseDouble(scanner.next());
////            } else {
////                System.out.println("Entered number is incorrect. Please enter correct number");
////                number = Double.parseDouble(scanner.next());
////            }
////        } catch (IOException exception) {
////           exception.printStackTrace();
////
////        }
////        return number;
////    }
//
//    public static char scanOperation() {
//        System.out.println("Enter the sign of operation: <+> or <-> or </> or <*>");
//        char operation;
//        if (scanner.hasNext()) {
//            operation = scanner.next().charAt(0);
//        } else {
//            System.out.println("Enter correct sign: : <+> or <-> or </> or <*>");
//            operation = scanner.next().charAt(0);
//        }
//        return operation;
//    }
//
//    public static double calculation(double number_1, double number_2, char operation) {
//        double result;
//        switch (operation) {
//            case '+':
//                result = number_1 + number_2;
//                break;
//            case '-':
//                result = number_1 - number_2;
//                break;
//            case '*':
//                result = number_1 * number_2;
//                break;
//            case '/':
//                result = number_1 / number_2;
//                break;
//            default:
//                System.out.println("The operation is not correct. Please try again.");
//                result = calculation(number_1, number_2, scanOperation());
//                break;
//        }
//        return result;
//    }
//
//
//    public static void resumeOrExit() {
//        System.out.println();
//        System.out.println("Press <Enter> to resume\n");
//        System.out.println("Type <exit>  then <Enter> to end the program");
//        Scanner inputAnswer = new Scanner(System.in);
//        String answer = inputAnswer.nextLine().toLowerCase();
//        if (!Objects.equals(answer, "exit")) {
//            start();
//        } else {
//            System.out.println("Thank You for using calculator ver. 1.0. Have a nice day!");
//        }
//        inputAnswer.close();
//    }
//
//    public static void main(String[] args) {
//        Methods.start();
//    }
//}
//
//
//
