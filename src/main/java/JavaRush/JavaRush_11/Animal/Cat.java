package JavaRush.JavaRush_11.Animal;

public class Cat extends Animal {

    String tail;

    public Cat(String brain, String heart, String tail) {
        super (brain, heart);
        this.tail = tail;
    }



        public static void main (String[]args){
            Cat cat = new Cat("Мозг", "Сердце", "Хвост");
        }
    }

