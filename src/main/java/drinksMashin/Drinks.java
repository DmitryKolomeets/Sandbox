package drinksMashin;

public class Drinks {

    static public int totalCost = 0;

    static final int coffeePrice = 5; // Price in Euro
    static final int teaPrice = 3;
    static final int lemonadePrice = 12;
    static final int mojitoPrice = 18;
    static final int mineralWaterPrice = 4;
    static final int coccColaPrice = 7;


    public static int coffeCount;
    public static int teaCount;
    public static int lemonadeCount;
    public static int mojitoCount;
    public static int mineralWaterCount;
    public static int cocaColaCount;


    public void coffeCount() {
        coffeCount += coffeePrice;
    }

    public void teaCount() {
        teaCount += teaPrice;
    }

    public void lemonadeCount() {
        lemonadeCount += lemonadePrice;
    }

    public void mojitoCount() {
        mojitoCount += mojitoPrice;
    }

    public void mineralWaterCount() {
        mineralWaterCount += mineralWaterPrice;
    }


    public void cocaColaCount() {
        cocaColaCount += coccColaPrice;
    }


    public static void billing() {
        if (coffeCount > coffeePrice) {
            System.out.println("Your order is " + coffeCount / coffeePrice + " " + DrinksMashine.COFFEE.drinkType + " total cost is " + coffeCount + "$");
        }

        if (teaCount > teaPrice) {
            System.out.println("Your order is " + teaCount / teaPrice + " " + DrinksMashine.TEA.drinkType + " total cost is " + teaCount + "$");
        }

        if (lemonadeCount > lemonadePrice) {
            System.out.println("Your order is " + lemonadeCount / lemonadePrice + " " + DrinksMashine.LEMONADE.drinkType + " total cost is " + lemonadeCount + "$");
        }

        if (mojitoCount > mojitoPrice) {
            System.out.println("Your order is " + mojitoCount / mojitoPrice + " " + DrinksMashine.MOJITO.drinkType + " total cost is " + mojitoCount + "$");
        }

        if (mineralWaterCount > mineralWaterPrice) {
            System.out.println("Your order is " + mineralWaterCount / mineralWaterPrice + " " + DrinksMashine.MOJITO.drinkType + " total cost is " + mineralWaterCount + "$");
        }

        if (cocaColaCount > coccColaPrice) {
            System.out.println("Your order is " + cocaColaCount / coccColaPrice + " " + DrinksMashine.COLA.drinkType + " total cost is " + cocaColaCount + "$");
        }


    }


}
