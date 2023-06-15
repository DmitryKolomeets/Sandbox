package JavaRush.JavaRush_17.TrainingTimeZones.Solution;

import java.util.TreeSet;

public class Test1 {

    public static void main(String[] args) {


        TreeSet<String> states = new TreeSet<String>();

        // добавим в список ряд элементов
        states.add("Ukriane");
        states.add("Pland");
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Angola");
        states.add("Great Britain");
        states.add("Irelend");


        System.out.printf("TreeSet contains %d elements \n", states.size());

        // удаление элемента
        states.remove("Germany");
        for(String state : states){

            System.out.println(state);
        }
    }

    }


