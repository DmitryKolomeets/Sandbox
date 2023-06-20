package JavaRush.JavaRush_19.Pets;

import java.util.List;
import java.util.stream.Collectors;

import static JavaRush.JavaRush_19.Pets.Selector.initData;
import static JavaRush.JavaRush_19.Pets.Selector.owners;


public class Solution {

    public static void main(String[] args) {

        initData();

        final List<String> findNames = owners.stream()
                .flatMap(owner -> owner.getPets().stream())
                .filter(pet -> Cat.class.equals(pet.getClass()))
                .filter(cat -> Color.FOXY == cat.getColor())
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .map(Animal::getName)
                .collect(Collectors.toList());

        findNames.forEach(System.out::println);


    }

}
