package Nail.Robot;

public class Solution_25 {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public  void fly();
    }

    public static class Horse {
        public void run() {
        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public  void fly() {
        }
    }

    public static abstract class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }

}
