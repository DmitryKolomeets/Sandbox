package Nail.ClassCastExcpetion;

import java.awt.*;

public class Test {


    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();

        Employee[] array1 = {d, t};
        Teacher t2 = (Teacher) array1[0];
    }


}

class Employee {
}

class Doctor extends Employee {
}

class Teacher extends Employee {
}