package java_hw_9.task_4;

public class Program {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("Acura").setPrice(25000).setCountOfWheels(4).setMaxSpeed(250).build();
        System.out.println(car.toString());


    }
}
