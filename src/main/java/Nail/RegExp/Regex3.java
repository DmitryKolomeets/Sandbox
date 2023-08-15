package Nail.RegExp;

public class Regex3 {
    public static void main(String[] args) {

        String s = "ivanov@mail.com borya@yandex.ru petunya@mail.ru";

        String s2 = "borya@yandex.ru";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);
    }


}
