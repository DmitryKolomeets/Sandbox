package Nail.RegExp;

public class Regex8 {

    public static void main(String[] args) {
        String s = "heLLo, privEt!23,_ %@()\".;@ kl \n wow";
        System.out.println("ДО:\n" + s + "\n==============");
        System.out.println("ПОСЛЕ:\n" + s.replaceAll("\\pP", ""));
    }

}
