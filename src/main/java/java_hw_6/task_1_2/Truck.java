package java_hw_6.task_1_2;

public class Truck extends Vehicle{
    double loadCapacity;

    @Override
    public void move() {
        System.out.printf("Truck %s with load capacity %s tons moving with speed %s km/h.%n",name,loadCapacity,speed);
    }
}
