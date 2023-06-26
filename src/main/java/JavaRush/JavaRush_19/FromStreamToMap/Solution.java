package JavaRush.JavaRush_19.FromStreamToMap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Solution {


    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {


//        ArrayList<String> list = new ArrayList<String>();
//        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3");
//
//        Map<String, String> result = list.stream()
//                .map( e -> e.split("=") )
//                .filter( e -> e.length == 2 )
//                .collect( Collectors.toMap(e -> e[0], e -> e[1]) );



        return stringStream.collect(toMap(word-> word, String::length));
    }


}
