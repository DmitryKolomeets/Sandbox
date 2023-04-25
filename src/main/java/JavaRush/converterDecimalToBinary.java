package JavaRush;

public class converterDecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber = 4;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }


    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        } else {
            StringBuilder builder = new StringBuilder();
            int binaryNumber = 0;
            while (decimalNumber != 0) {
                binaryNumber = decimalNumber % 2;
                decimalNumber = decimalNumber / 2;
                builder.append(binaryNumber);
            }
            String result = builder.reverse().toString();
            return result;


        }
    }


    public static int toDecimal(String binaryNumber) {
        if ((binaryNumber == null || binaryNumber.equals(""))) {
            return 0;
        } else {
            int result = 0;
            for (int i = binaryNumber.length() - 1; i >= 0; i--) {
                //  int currentBinaryNumber = binaryNumber.charAt(i);
                char character = binaryNumber.charAt(i);
                int decimalNumber = (int) (Character.digit(character, 10) * Math.pow(2, ((binaryNumber.length() - 1) - i)));
                result = result + decimalNumber;
            }
            return result;
        }
    }
}


