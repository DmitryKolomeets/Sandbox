package Metanit;

public class Fly_4 {

    public static void callFoodMethods(Food food) {
        food.onEat();
        food.onSelect();
    }

    public static void callSelectableMethods(Selectable selectable) {
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
