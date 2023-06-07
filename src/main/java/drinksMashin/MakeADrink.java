package drinksMashin;

import java.util.Objects;
import java.util.Scanner;

public class MakeADrink {

    static Scanner scanner = new Scanner(System.in);

    public static void start() {
        welcomeMenu();
        int quantity = scanQuantityOfDrink();
        String name = scanNameOfDrink();
        makeADrink(name, quantity);
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
        } else {
            System.out.println("Please enter the quantity of drinks");
            quantity = scanner.nextInt();
        }
        return quantity;
    }


    public static String scanNameOfDrink() {
        System.out.println("Please enter the name of drink: tea or coffe or lemonade or mojito or mineral water of cocca cola");
        String name;
        if (scanner.hasNext()) {
            name = scanner.nextLine();
        } else {
            System.out.println("Incorrect name");
            System.out.println("Please enter the name of drink: tea or coffe or lemonade or mojito or mineral water of cocca cola");
            name = scanner.nextLine();
        }
        return name;
    }


    public static double makeADrink(String drink, int quantity) {
        double cost = 0;
        drink.toUpperCase();
        switch (drink) {

            case "TEA":
                cost = quantity * Drinks.teaPrice;
                break;
            case "COFFE":
                cost = quantity * Drinks.coffeePrice;
                break;
            case "LEMONADE":
                cost = quantity * Drinks.lemonadePrice;
                break;
            case "MOJITO":
                cost = quantity * Drinks.mojitoPrice;
                break;

            case "MINERAL WATER":
                cost = quantity * Drinks.mineralWaterPrice;
                break;
            case "COCA COLA":
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
