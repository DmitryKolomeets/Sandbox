package JavaRush.JavaRush_19.TwoRealisationOfTwoInterfeises;

import java.util.ArrayList;

public class Solution {


    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
      list.add(runnable);
    }

    public static void runList() {
       for(Runnable runnable: list) {
           runnable.run();
       }
    }

}
