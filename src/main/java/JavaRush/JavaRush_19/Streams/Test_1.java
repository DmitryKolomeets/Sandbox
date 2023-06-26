package JavaRush.JavaRush_19.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_1 {

    public static void main(String[] args) {


        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        List<String> stream2 = stream
                .map(String::valueOf)
                .collect(Collectors.toList());


        System.out.println(stream2);



//        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
//        Stream<String> stream4 = stream.map(String::valueOf);
//        Stream<Integer> stream5 = stream2.map(Integer::parseInt);


    }

}
