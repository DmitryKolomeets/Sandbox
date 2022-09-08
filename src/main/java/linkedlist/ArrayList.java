package linkedlist;

public class ArrayList {

    public void testStudents(ArrayList<Student> al, Predicate pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }


//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudetnsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolai", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 7.4);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
//
        StudentInfo info = new StudentInfo();

        Function<Student, Double> f = student -> student.avgGrade;
        double result = avgOfSmth(students, student ->  student.avgGrade);
        System.out.println(result);
        double result2 = avgOfSmth(students, student -> (double) student.course);
        System.out.println(result2);
        double result3 = avgOfSmth(students, student -> (double) student.age);
        System.out.println(result3);

//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//
//        info.testStudents(students,  p1.or(p2));

//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("-----------------------------");
//        info.testStudents(students, new StudentsCheks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//
//            }
//        });

//        info.testStudents(students, (Student p) -> {return p.avgGrade > 8;});
//        info.testStudents(students, p -> p.avgGrade > 8 );
//
//
//        System.out.println("-----------------------------");
//        info.testStudents(students, (Student p) -> {
//            return p.age < 30;
//        });
//        System.out.println("-----------------------------");
//        info.testStudents(students, (Student p) -> {
//            return p.age > 20 && p.avgGrade < 9.3 && p.sex == 'f';
//        });
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("-----------------------------");
//        info.printStudetnsUnderAge(students, 30);
//        System.out.println("-----------------------------");
//        info.printStudentMixCondition(students, 20, 9.5, 'f');


    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {

        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}

//interface StudentsCheks extends Predicate<Student> {
//    boolean check(Student s);
//}
//
//abstract class CheckOverGrade implements StudentsCheks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
}
