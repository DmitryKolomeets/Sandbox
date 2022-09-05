package lara_dz_18;

public class User {

    String name;
    String surname;
    String password;
    String email;
    int id;


    public User(String name, String surname, String password, String email, int id) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.id = id;



    }

    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }


//    public static boolean isAlpha(String s) {
//
//        if (s == null) {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (!(c != '@')) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public static void main(String[] args) {

        User user = new User("Vasya", "Petrov", "3217hd", "qwejkkjlk", 23);

    }


}


