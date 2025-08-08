package java_hw_12.task_2;

public class Vehicle {
    String name;
    int speed;
    double price;
    int countOfWheels;

    Vehicle(String name, int speed, double price, int countOfWheels) {
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.countOfWheels = countOfWheels;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}
