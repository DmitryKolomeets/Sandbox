package JavaRush.JavaRush_11.Car;

public class Programmer {
    private int salary = 1000;

    public Programmer() {
    }

    public Programmer(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        } else {
        }
    }
}

