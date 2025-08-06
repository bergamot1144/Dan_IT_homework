package java_hw_9.task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Vehicle audi = new Vehicle("Audi A4", 220);
        Vehicle bmw = new Vehicle("BMW 330d", 290);
        Vehicle mercedes = new Vehicle("Mercedes CLS 350", 250);
        Vehicle opel = new Vehicle("Opel Astra", 170);
        Vehicle mazda = new Vehicle("Mazda CX30", 240);
        List<Vehicle>cars = new ArrayList<>();
        cars.add(audi);
        cars.add(bmw);
        cars.add(mazda);
        cars.add(opel);
        cars.add(mercedes);
        System.out.println("List before .sort: ");
        cars.forEach(System.out::println);
        cars.sort(Comparator.comparing(Vehicle::getSpeed));
        System.out.println("List after .sort: ");
        cars.forEach(System.out::println);





    }
}
