package java_hw_12.task_2;

public class Program {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", 250, 50000, 4);
        Vehicle v2 = null;

        if (v1 != null) {
            System.out.println("Object is real: " + v1);
            System.out.println("Name: " + v1.getName());
        } else {
            System.out.println("Object missing (null)");
        }

        if (v2 != null) {
            System.out.println("Object is real: " + v2);
            System.out.println("Name: " + v2.getName());
        } else {
            System.out.println("Object missing (null)");
        }
    }
}
