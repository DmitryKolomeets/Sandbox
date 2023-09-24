package Metanit;

public class Obj_4 {

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        @Override
        public String getName() {
            return "Marta";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        @Override
        public String getName() {
            return "Bobik";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }


}
