package drinksMashin;

public class Drinks {

    static public int totalCost = 0;

    static final double coffeePrice = 5.65; // Price in Euro
    static final double teaPrice = 3.12;
    static final double lemonadePrice = 12.55;
    static final double mojitoPrice = 18.7;
    static final double mineralWaterPrice = 4.30;
    static final double coccColaPrice = 7.45;


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






}
