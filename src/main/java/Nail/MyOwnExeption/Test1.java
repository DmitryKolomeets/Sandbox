package Nail.MyOwnExeption;

public class Test1 {


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