package Nail.MyOwnExeption;

public class Test1 {

    void marathon(int temperaturaVozduxa, int tempBega) throws PdvernutNoguExeption {

        if (tempBega > 12) {
            throw new PdvernutNoguExeption("Temp bega bill sliwkom visokim" + tempBega);
        }

        if (temperaturaVozduxa > 32) {
            throw new SveloMjshcuExeption();
        }
        System.out.println("Vj probegali marathon!!!");

    }


    public static void main(String[] args) {

        Test1 t = new Test1();
        try {
            t.marathon(10,20);
        } catch (PdvernutNoguExeption e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("V Lubom slu4ae vj poluchite gramotu!");
        }

    }



}


class PdvernutNoguExeption extends Exception {

    PdvernutNoguExeption(String message) {
        super(message);
    }
    PdvernutNoguExeption() {

    }

}

class SveloMjshcuExeption extends RuntimeException {
    SveloMjshcuExeption(String message) {
        super(message);
    }
    SveloMjshcuExeption() {

    }
}