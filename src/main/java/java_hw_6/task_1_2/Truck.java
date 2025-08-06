package java_hw_6.task_1_2;

public class Truck extends Vehicle {
    private double loadCapacity; // тонн

    @Override
    public void move() {
        System.out.printf(
                "Truck %s with load capacity %.1f tons is moving at %d km/h.%n",
                getName(), loadCapacity, getSpeed()
        );
    }

    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity < 0) {
            throw new IllegalArgumentException("loadCapacity cant be < 0 ");
        }
        this.loadCapacity = loadCapacity;
    }
}
