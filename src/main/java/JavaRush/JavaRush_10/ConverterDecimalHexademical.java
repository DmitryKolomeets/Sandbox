package JavaRush.JavaRush_10;

public class ConverterDecimalHexademical {

    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        char[] array = HEX.toCharArray();
        if (decimalNumber <= 0) {
            return "";
        } else {
            String hexNumber = "";
            while (decimalNumber != 0) {
                hexNumber = array[decimalNumber % 16] + hexNumber;
                decimalNumber = decimalNumber / 16;
            }
            return hexNumber;
        }
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.equals("")) {
            return 0;
        } else {
            int decimalNumber = 0;
            for (int i = 0; i < hexNumber.length(); i++) {
                decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
            }
            return decimalNumber;
        }
    }
}
