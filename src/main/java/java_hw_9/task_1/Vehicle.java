package java_hw_9.task_1;

public class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "name='" + name + '\'' + ", speed=" + speed + '}';
    }
}
