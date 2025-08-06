package java_hw_6.task_1_2;

public class Program {
    public static void main(String[] args) {
        Car audi = new Car();
        Truck mackTitan = new Truck();

        audi.setName("Audi RS 6");
        audi.setSpeed(280);
        audi.setPassengerCapacity(2);

        mackTitan.setName("Mack Titan");
        mackTitan.setSpeed(80);
        mackTitan.setLoadCapacity(120);

        audi.move();
        mackTitan.move();

        audi.stop();
        mackTitan.stop();
    }
}
