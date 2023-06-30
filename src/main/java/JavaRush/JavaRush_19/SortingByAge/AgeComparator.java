package JavaRush.JavaRush_19.SortingByAge;

import java.util.Comparator;

public class AgeComparator implements Comparator <Student> {

@Override

     public int compare (Student student_1, Student student_2) {
    return student_2.getAge() - student_1.getAge();
}
}
