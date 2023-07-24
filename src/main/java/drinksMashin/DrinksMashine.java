package drinksMashin;

public enum DrinksMashine {


    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERAL_WATER("Mineral water"),
    COCA_COLA("Coca Cola");

    public String drinkType;

    DrinksMashine(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrinkType() {
        return drinkType;
    }


    @Override
    public String toString() {
        return "DrinksMashine{" +
                "drinkType='" + drinkType + '\'' +
                '}';
    }
}
