package JavaRush.JavaRush_18.SpaceOdyssey_2;

import java.util.ArrayList;
import java.util.stream.BaseStream;

public class Solution {

    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
      Human human_1 = (Human) astronauts.get(0);
      pilot(human_1);
      Human human_2 = (Human) astronauts.get(1);
      pilot(human_2);
      Dog dog = (Dog) astronauts.get(2);
      createDirection(dog);
      Cat cet = (Cat) astronauts.get(3);
      research(cet);

    }

    public static void pilot(Human human){
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog){
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(Cat cat){
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
