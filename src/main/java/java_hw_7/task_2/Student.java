package java_hw_7.task_2;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", gpa=" + gpa + '}';
    }

    public static List<Student> addStudent(List<Student> students, Student student) {
        students.add(student);
        return students;
    }

    public static List<Student> removeStudentById(List<Student> students, int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Student ID " + id + " deleted.");
        } else {
            System.out.println("Student ID " + id + " not found.");
        }
        return students;
    }

    public static Student findStudentByName(List<Student> students, String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Name " + name + " found successfully.");
            }
        }
        return null;
    }

    public static void printAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Students list is empty.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
