package Nail.RegExp;

public class PrintfExample {


    static void employeeInfo(Employee emp) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n", emp.id, emp.name, emp.surname, emp.salary * (1 + emp.bonusPct));
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Zaujr", "Tregulov", 12345, 0.15);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 29348, 0.08);
        Employee employee3 = new Employee(23, "Mariya", "Sidorova", 12345, 0.15);

//        employeeInfo(employee1);
//        employeeInfo(employee2);
//        employeeInfo(employee3);

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f", 1, "Zaujr", "Tregulov", 12345 * (1 + 0.15));
        System.out.println(newString);
    }

}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}