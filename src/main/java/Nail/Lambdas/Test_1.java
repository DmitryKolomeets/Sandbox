package Nail.Lambdas;

import java.util.ArrayList;

public class Test_1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("A imenno lambdas");
        al.removeIf(element -> element.length() < 5);

        System.out.println(al);


    }


}
