package JavaRush.JavaRush_10;

public class ConverterBinaryToHexademical {


    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.equals("")) {
            return "";
        } else {
            for (int i = 0; i < binaryNumber.length(); i++) {
                int number = Character.digit(binaryNumber.charAt(i), 10);
                if (number != 0 || number != 1) {
                    return "";
                } else {

                }
            }
        }


        return null;
    }

//}

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        return null;
    }


}
