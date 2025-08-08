package java_hw_11.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Drew", "Macintyre", 35, 3500.0));
        personList.add(new Person("Ivan", "Padavan", 45, 11200.0));
        personList.add(new Person("Broke", "Lesnar", 55, 1400.0));
        personList.add(new Person("John", "Dow", 95, 1800.0));
        personList.add(new Person("Jane", "Dow", 125, 5000.0));
        System.out.println("\nPerson list:");
        personList.forEach(System.out::println);

        List<String> namesUnder70 = personList.stream()
                .filter(p -> p.getAge() < 70)
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("\nNames who < 70 y.o:");
        namesUnder70.forEach(System.out::println);
    }
}
