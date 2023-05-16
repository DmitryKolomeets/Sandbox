package JavaRush.JavaRush_10.HashMap;

import java.util.HashMap;

public class Solution {

    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
       grades.put("Иван Смиронв", 4.3);
       grades.put("Сергей Денисов", 5.3);
       grades.put("Халк Хоган", 3.8);
       grades.put("Афина Палада", 4.98);
       grades.put("Николай Растрогуев", 4.0);
    }
}
