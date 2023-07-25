package drinksMashin;

import java.util.HashMap;
import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Integer> storage;


    public static void start() {
        welcomeMenu();
        String name = "";
        int quantity = 0;
        String answer = "yes";

        do {
            name = getDrinkName();
            quantity = getQuantityOfDrink();
            vendingMashine(name, quantity);
            answer = addingOrNotNewDrink();

        } while (answer.equals("yes"));

        Drinks.billing();

    }


    public static void welcomeMenu() {
        System.out.println("Welcome to drink mashine ver 0.97");
    }


    public static HashMap<String, Integer> createStorage() {
        HashMap<String, Integer> drinksStorage = new HashMap<String, Integer>();

        drinksStorage.put("Coffee", 0);
        drinksStorage.put("Tea", 0);
        drinksStorage.put("Lemonade", 0);
        drinksStorage.put("Mojito", 0);
        drinksStorage.put("Mineral water", 0);
        drinksStorage.put("Coca Cola", 0);

        return drinksStorage;
    }


    public static String getDrinkName() {
        System.out.println("Enter name of the Drink please....");
        System.out.println("As: <Coffee> or <Tea> or <Lemonade> or <Mojito> or <Mineral water> or <Cola>");

        String drink = scanner.nextLine().toLowerCase();

        while ((!drink.equals("coffee") && !drink.equals("tea") && !drink.equals("lemonade") && !drink.equals("mojito") && !drink.equals("mineral water") && !drink.equals("cola"))) {
            System.out.println("Enter please correct name of the drink");
            System.out.println("As: <Coffee> or <Tea> or <Lemonade> or <Mojito> or <Mineral water> or <Cola>");
            drink = scanner.nextLine().toLowerCase();
        }
        return drink;
    }

    public static Integer getQuantityOfDrink() {

        System.out.println("Enter quantity of the Drink please....");

        Integer quantity = scanner.nextInt();
        return quantity;
    }


    public static String addingOrNotNewDrink() {

        System.out.println("Do You want add new drink?....");
        System.out.println("Please type <yes> or <no>....");

        String string = scanner.nextLine().toLowerCase();
        System.out.println("Your choise is " + string);


        while ((!string.equals("yes")) && (!string.equals("no"))) {
            System.out.println("wrong input...");
            System.out.println("Enter please correct input");
            System.out.println("Do You want add new drink?....");
            System.out.println("Please type <yes> or <no>....");
            string = scanner.nextLine().toLowerCase();
        }

        return string;
    }

    public static void vendingMashine(String name, int quantity) {

        DrinksMashine drinksMashine = DrinksMashine.valueOf(name.toUpperCase());

        switch (drinksMashine) {
            case TEA: {
                System.out.println(drinksMashine.getDrinkType() + " is prepeared in quantity " + quantity + " pieces.");
                for (int i = 0; i < quantity; i++) {
                    new Drinks().teaCount();
                }
            }
            break;

            case COFFEE: {
                System.out.println(drinksMashine.getDrinkType() + " is prepeared in quantity " + quantity + " pieces.");
                for (int i = 0; i < quantity; i++) {
                    new Drinks().coffeCount();
                }
            }
            break;
            case LEMONADE: {
                System.out.println(drinksMashine.getDrinkType() + "is prepeared in quantity " + quantity + " pieces.");
                for (int i = 0; i < quantity; i++) {
                    new Drinks().lemonadeCount();
                }
            }
            break;
            case MOJITO: {
                System.out.println(drinksMashine.getDrinkType() + "is prepeared in quantity " + quantity + " pieces.");
                for (int i = 0; i < quantity; i++) {
                    new Drinks().mojitoCount();
                }
            }
            break;
            case MINERAL_WATER: {
                System.out.println(drinksMashine.getDrinkType() + "is prepeared in quantity " + quantity + " pieces.");
                for (int i = 0; i < quantity; i++) {
                    new Drinks().mineralWaterCount();
                }
            }
            break;
            case COLA: {
                System.out.println(drinksMashine.getDrinkType() + "is prepeared in quantity " + quantity + " pieces.");
                for (int i = 0; i < quantity; i++) {
                    new Drinks().cocaColaCount();
                }
            }break;

        }
    }


}



