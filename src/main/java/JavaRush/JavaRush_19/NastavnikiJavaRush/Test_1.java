package JavaRush.JavaRush_19.NastavnikiJavaRush;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test_1 {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        Comparator<String> comparator = new Comparator<String>()
        {
            public int compare (String obj1, String obj2)
            {
                return obj1.length() - obj2.length();
            }
        };

        Collections.sort(list, comparator);


        Comparator<String> comparator_2 = (String obj1, String obj2) ->
        {
            return obj1.length() - obj2.length();
        };


    }

}
