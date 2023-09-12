package Metanit;

public class Test_2 {

    public static void main(String[] args) {
        Person person = new Person("Ivan", "Kuzkin", 23, 14);
        System.out.println(person.age);
        showName(person);

        System.out.println(person.getName());

    }

    public static class Person {
        private String name;
        private String surname;
        private int id;
        private int age;

        public Person(String name, String surname, int id, int age) {
            this.name = name;
            this.surname = surname;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void showName(Person person) {
        System.out.println("Name of Person is - " + person.name);
    }


}
