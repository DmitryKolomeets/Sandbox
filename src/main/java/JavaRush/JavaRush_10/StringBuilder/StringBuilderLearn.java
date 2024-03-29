package JavaRush.JavaRush_10.StringBuilder;

public class StringBuilderLearn {

    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            stringBuilder = stringBuilder.append(strings[i]);

        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.replace(start, end, str);
        return stringBuilder;
    }
}
