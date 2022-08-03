package Metanit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Uchim Java");
        al.add("A Imenno Lambdas");

        al.removeIf(element -> element.length() < 5);
        System.out.println(al);

        Predicate<String> p = element -> element.length() < 5;
        al.removeIf(p);
    }
}