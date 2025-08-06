package java_hw_6.task_1_2;

public class Car extends Vehicle {
    private int passengerCapacity;

    @Override
    public void move() {
        System.out.printf(
                "Car %s moves at a speed of %d km/h with %d passengers.%n",
                getName(), getSpeed(), passengerCapacity
        );
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity < 0) {
            throw new IllegalArgumentException("passengerCapacity cant be < 0");
        }
        this.passengerCapacity = passengerCapacity;
    }
}
