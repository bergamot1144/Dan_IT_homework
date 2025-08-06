package java_hw_8;

import java.util.HashMap;
import java.util.Map;

public class Person {
    String name;
    String surName;
    int age;


    public Person(String name, int age)
    {
        this.name=name;
//        this.surName=surName;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", surName='" + surName + '\'' + ", age=" + age + '}';
    }


}
