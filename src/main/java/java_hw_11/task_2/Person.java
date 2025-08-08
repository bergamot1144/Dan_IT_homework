package java_hw_11.task_2;

public class Person {
    private String name;
    private String surName;
    private int age;
    private double salary;

    public Person(String name, String surName, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }
    public String getName() { return name; }
    public String getSurName() { return surName; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    public void setName(String name) { this.name = name; }
    public void setSurName(String surName) { this.surName = surName; }
    public void setAge(int age) { this.age = age; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return String.format("%s %s, age=%d, salary=%.2f", name, surName, age, salary);
    }

}


