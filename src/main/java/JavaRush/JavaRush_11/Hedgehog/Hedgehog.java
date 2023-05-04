package JavaRush.JavaRush_11.Hedgehog;

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {

      Apple apple = new Apple();
      Hedgehog hedgehog = new Hedgehog();
      hedgehog.eat(apple);
    }

    public static class Apple {

    }



}
