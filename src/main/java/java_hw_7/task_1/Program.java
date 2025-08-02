package java_hw_7.task_1;

public class Program {
    public static void main(String[] args) {

        Warehouse<String> stringWarehouse = new Warehouse<>();

        stringWarehouse.addItem("Tomato");
        stringWarehouse.addItem("Potato");
        stringWarehouse.addItem("Banana");
        stringWarehouse.addItem("Cucumber");
        stringWarehouse.addItem("Coconut");
        stringWarehouse.addItem("Onion");
        stringWarehouse.addItem("Meat");
        stringWarehouse.addItem("Orange");
        stringWarehouse.addItem("Apricot");
        stringWarehouse.addItem("Orange");
        stringWarehouse.addItem("Carrot");
        stringWarehouse.addItem("Beet");
        stringWarehouse.addItem("Cabbage");
        stringWarehouse.addItem("Parsley");
        stringWarehouse.addItem("Dill");
        stringWarehouse.addItem("Basil");
        stringWarehouse.addItem("Dill");
        stringWarehouse.addItem("Chilly Pepper");

        System.out.println("\nCount of units:" + stringWarehouse.getItemCount());

        System.out.println("Is the warehouse empty?");
        if (stringWarehouse.isEmpty()) {
            System.out.println("Warehouse is empty.");
        } else System.out.println("Warehouse is not empty.");

        System.out.println("View all units: " + stringWarehouse.viewItems());
        System.out.println("Delete units: " + stringWarehouse.retrieveAll());

        stringWarehouse.addItem("Meat");
        stringWarehouse.addItem("Orange");
        stringWarehouse.addItem("Apricot");

        System.out.println("\nCount of units:" + stringWarehouse.getItemCount());

        stringWarehouse.clear();

        System.out.println("\nCount of units:" + stringWarehouse.getItemCount());

        System.out.println("Is the warehouse empty?");
        if (stringWarehouse.isEmpty()) {
            System.out.println("Warehouse is empty.");
        } else System.out.println("Warehouse is not empty.");

    }
}
