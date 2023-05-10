package JavaRush.Javarush_13.HR;

import java.util.ArrayList;

public class Solution {

    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
      if  (waitingEmployees.contains(name)) {
          alreadyGotSalaryEmployees.add(name);
          int nameIndex = waitingEmployees.indexOf(name);
          waitingEmployees.set(nameIndex, null);


      }
    }
}
