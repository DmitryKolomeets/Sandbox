package Nail.Robot;

public class Solution_15 {


    public static void main(String[] args) throws Exception {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public  static class Translator {
        public String translate() {
            return "Я переводчик с английского";
        }
    }
}
