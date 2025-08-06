package java_hw_6.task_1_2;

public class Vehicle {

    String name;
    int speed;

    public void move() {
        System.out.printf("Vehicle moving with speed %s km/h.%n", speed);
    }

    public void stop() {
        System.out.printf("Vehicle %s stopped.%n", name);
    }

}
