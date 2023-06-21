package JavaRush.JavaRush_19.StreamAPI;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> persons = Data.getPesrons();


//        List<Person> persons2 = persons.stream()
//                .map(person -> new Person(person.getFirstName(), "ИВанов", person.getAge()+100))
//                .collect(Collectors.toList());


        long count = persons.stream()
                .filter(p-> p.getAge()>30)
                .count();

        System.out.println(count);






//        for (int i = 0; i < persons2.size(); i++) {
//            System.out.println(persons2.get(i));
//        }


    }

}
