package java_hw_6.task_1_2;

public class Program {
    public static void main(String[] args) {
        Car audi = new Car();
        Truck mack_Titan = new Truck();

        audi.speed=280;
        audi.passengerCapacity=2;
        audi.name="Audi RS 6";

        mack_Titan.speed = 80;
        mack_Titan.loadCapacity=120;
        mack_Titan.name = "Mack Titan";

        audi.move();
        mack_Titan.move();

        audi.stop();
        mack_Titan.stop();
    }
}
