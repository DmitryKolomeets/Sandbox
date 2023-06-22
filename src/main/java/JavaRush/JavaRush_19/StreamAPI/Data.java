package JavaRush.JavaRush_19.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static List<Person> pesrons = new ArrayList<>();

    static {
        Person person1 = new Person("Иван", "Иванов", 33);
        Person person2 = new Person("Петр", "Петров", 28);
        Person person3 = new Person("Сидор", "Сидоров", 39);
        Person person4 = new Person("Иван", "Тургенев", 46);
        Person person5 = new Person("Лев", "Толстой", 300);
        Person person6 = new Person("Антон", "Чехов", 32);
        Person person7 = new Person("Афанасий", "Фет", 52);
        Person person8 = new Person("Владимир", "Маяковский", 23);
        Person person9 = new Person("Михаил", "Лермонтов", 26);
        Person person10 = new Person("Алексей", "Толстой", 41);

        pesrons.add(person1);
        pesrons.add(person2);
        pesrons.add(person3);
        pesrons.add(person4);
        pesrons.add(person5);
        pesrons.add(person6);
        pesrons.add(person7);
        pesrons.add(person8);
        pesrons.add(person9);
        pesrons.add(person10);

    }


    public static List<Person> getPesrons() {
        return pesrons;
    }
}
