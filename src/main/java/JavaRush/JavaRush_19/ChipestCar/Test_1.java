package JavaRush.JavaRush_19.ChipestCar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test_1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        List<String> result = list.stream()
                .filter( s -> Character.isUpperCase(s.charAt(0)) )
                .collect( Collectors.toList() );



    }

}
