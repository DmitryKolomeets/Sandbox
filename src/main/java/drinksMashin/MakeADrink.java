package drinksMashin;

import java.util.Objects;
import java.util.Scanner;

import static drinksMashin.DrinksMashine.LEMONADE;

public class MakeADrink {

    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        welcomeMenu();
        int quantity = scanQuantityOfDrink();
        String drink = scanNameOfDrink();
        makeADrink(drink, quantity);
        resumeOrExit();
    }


    public static void welcomeMenu() {
        System.out.println("Welcome to drink mashine ver 0.97");
    }

    public static int scanQuantityOfDrink() {
        System.out.println("Please enter the quantity of drinks");
        int quantity = 0;
        if (scanner.hasNextInt()) {
            quantity = scanner.nextInt();
            System.out.println("k-vo napitka ==== " + quantity);
        } else {
            System.out.println("Please enter the quantity of drinks");
            quantity = scanner.nextInt();
        }
        return quantity;
    }


    public static String scanNameOfDrink() {
        System.out.println("Please enter the name of drink: tea or coffe or lemonade or mojito or mineral water of cocca cola");
        String drink = null;
//        if(scanner.hasNext("tea")) {
            drink = scanner.nextLine();
            System.out.println("Napitok ==== " + drink);
//        } else {
//            System.out.println("Incorrect name ");
//            System.out.println("Please enter the name of drink: tea or coffe or lemonade or mojito or mineral water of cocca cola");
//            drink = scanner.nextLine().toLowerCase();
//        }

        return drink;
    }


    public static double makeADrink(String drink, int quantity) {

        double cost = 0;

        switch (drink) {
            case "tea":
                System.out.println("tea ready");
//                cost = quantity * Drinks.teaPrice;
                break;
            case "coffe":
                cost = quantity * Drinks.coffeePrice;
                break;
            case "lemonade":
                cost = quantity * Drinks.lemonadePrice;
                break;
            case "mojito":
                cost = quantity * Drinks.mojitoPrice;
                break;
            case "mineral water":
                cost = quantity * Drinks.mineralWaterPrice;
                break;
            case "cocca cola":
                cost = quantity * Drinks.coccColaPrice;
                break;
            default:
                System.out.println("Invalid name of drink. Please enter: tea or coffe or lemonade or mojito or mineral water of cocca cola");
        }
        return cost;
    }

    public static void resumeOrExit() {
        System.out.println();
        System.out.println("Press <Enter> to resume\n");
        System.out.println("Type <exit>  then <Enter> to end the program");
        String answer = scanner.nextLine().toLowerCase();
        if (!Objects.equals(answer, "exit")) {
            start();
        } else {
            System.out.println("Thank You for using mashine ver 0.97. Have a nice day!");
        }
    }


    public static void main(String[] args) {
        start();


    }



}



