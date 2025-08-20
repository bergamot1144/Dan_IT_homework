package java_hw_6.task_1_2;

public class Vehicle {
    private String name;
    private int speed;


    public void move() {
        System.out.printf("Vehicle %s is moving at %d km/h.%n", name, speed);
    }

    public void stop() {
        System.out.printf("Vehicle %s stopped.%n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Speed cant be < 0");
        }
        this.speed = speed;
    }
}
