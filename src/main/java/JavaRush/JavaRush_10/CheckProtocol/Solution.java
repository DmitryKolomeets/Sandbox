package JavaRush.JavaRush_10.CheckProtocol;

public class Solution {

    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            domain.

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }





    public static String checkProtocol(String url) {
        //напишите тут ваш код
        return "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        return "неизвестный";
    }


}
