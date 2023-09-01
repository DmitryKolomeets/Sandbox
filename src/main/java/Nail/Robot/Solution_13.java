package Nail.Robot;

import java.awt.*;

public class Solution_13 {



    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox{

        @Override
        public Color getColor() {
            return null;
        }

        public Color color() {
            return Color.GRAY;
        }
    }
}
