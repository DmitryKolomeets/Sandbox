package JavaRush;

public class StringPairsEquals {

    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";



        System.out.println((string1 == string2) ? same : different);
        System.out.println((string2 == string3) ? same : different);
        System.out.println((string1 == string3) ? same : different);


    }

}
