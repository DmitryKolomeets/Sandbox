package lara_dz_18;

public class User_14 {

    public static void main(String[] args) {

    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }


    public static abstract class Human implements CanRun, CanSwim{

    }


}
