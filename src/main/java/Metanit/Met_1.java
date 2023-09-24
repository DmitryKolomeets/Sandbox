package Metanit;

public class Met_1 {

    public static String getObjectType(Object o) {
        if (o instanceof Tiger) {
            return "Тигр";
        } else if (o instanceof Lion) {
            return "Лев";
        } else if (o instanceof Bull) {
            return "Бык";
        } else if (o instanceof Cow) {
            return "Корова";
        } else if (o instanceof Cat) {
            return "Кот";
        } else if (o instanceof Animal) {
            return "Животное";
        }


        return null;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
