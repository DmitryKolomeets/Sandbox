package JavaRush.JavaRush_19.NastavnikiJavaRush;

import java.util.Comparator;

public class NameComparator implements Comparator <JavaRushMentor> {

    @Override
    public int compare(JavaRushMentor mentor_1, JavaRushMentor mentor_2) {
        return mentor_1.getName().length() - mentor_2.getName().length();
    }

}
