package JavaRush.JavaRush_12.Car2;

public class Car {

    Engine engine;

    public static void main(String[] args) {


    }


    public class Engine {
        private boolean isRunning;


        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }


    }
}
