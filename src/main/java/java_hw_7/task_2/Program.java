package java_hw_7.task_2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student.addStudent(students, new Student(1, "Ivan", 20, 4.5));
        Student.addStudent(students, new Student(2, "Oksana", 21, 3.9));
        Student.addStudent(students, new Student(3, "Eugen", 22, 4.2));
        Student.addStudent(students, new Student(4, "Jenny", 20, 4.8));
        Student.addStudent(students, new Student(5, "Jared", 23, 3.5));
        System.out.println("All students are loaded.");
        System.out.println("\nAll students:");
        Student.printAllStudents(students);
        Student eugen = Student.findStudentByName(students, "Eugen");
        Student.removeStudentById(students, 2);
        Student.removeStudentById(students, 3);
        System.out.println("\nAll students:");
        Student.printAllStudents(students);

    }
}
