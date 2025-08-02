package java_hw_9.task_2;

public class VehicleSingleton {
    private static final VehicleSingleton instance = new VehicleSingleton();

    String name;
    int speed;
    double price;


    private VehicleSingleton() {
    }

    public void setData(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }


    public static VehicleSingleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "VehicleSingleton{" + "name='" + name + '\'' + ", speed=" + speed + ", price=" + price + '}';
    }
}
