package JavaRush.JavaRush_19.Lambda_2;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");

        list.forEach( (s) -> System.out.println(s) );

    }

}
