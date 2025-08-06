package java_hw_6.task_1_2;

public class Car extends Vehicle {
    int passengerCapacity;

    @Override
    public void move() {
        System.out.printf("Car %s moves at a speed of %s km/year with %s number of people.%n", name, speed, passengerCapacity);
    }
}
