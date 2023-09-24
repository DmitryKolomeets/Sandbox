package Metanit;

public class Obj_1 {
    public static String getObjectType(Object o) {
        if (o instanceof Cat) {
            return "Кот";
        } else if (o instanceof Tiger) {
            return "Тигр";
        } else if (o instanceof Lion) {
            return "Лев";
        } else if (o instanceof Bull) {
            return "Бык";
        } else return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
