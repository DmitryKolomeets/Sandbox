package Nail.IllegalArgumentException;

public class Test1 {

    public static void main(String[] args) {

        createPwd("qwe");


    }


    public static void createPwd(String pwd) {
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("Dlina parolya sliwkom korotkaya");
        }
        if (pwd.length()>12) {
            throw new IllegalArgumentException("Dlina parolya sliwkom bolwaya");
        }

    }

}

class Samolet {
    String sostoyanie = "v ojidanii"; // v ojidanii, v vozduxe, polet otmenen

    public void letet () {
        sostoyanie = "v vozduxe";
        System.out.println("samolet letit");
    }
     public void ojidat(){
        if(sostoyanie.equals("v vozduxe")) {throw new IllegalStateException("Samolet uje v vozduxe");}
        sostoyanie = "v ojidanii";
         System.out.println("samolet v ojidanii poleta");
     }

    public void otmenitPolet(){
        if(sostoyanie.equals("v vozduxe")) {throw new IllegalStateException("Samolet uje v vozduxe");}
        sostoyanie = "polet otmenen";
        System.out.println("polet samoleta otmenen");
    }


    public static void main(String[] args) {
        Samolet samolet = new Samolet();
        samolet.ojidat();
        samolet.letet();
        samolet.otmenitPolet();
    }

}


