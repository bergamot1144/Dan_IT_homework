package java_hw_9.task_2;

public class Program {
    public static void main(String[] args) {
        VehicleSingleton car1 = VehicleSingleton.getInstance();
        car1.setData("Audi A4",220,15000);
        VehicleSingleton car2 = VehicleSingleton.getInstance();
        car2.setData("BMW 6",300,30000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());



    }
}
