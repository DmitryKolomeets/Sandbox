package JavaRush.JavaRush_18.Traffic;

public interface Vehicle {

    public  default void start() {
        System.out.println("Начинаю движение.");
    }
    void move();
    public default void stop() {
        System.out.println("Останавливаюсь.");
    }
}
