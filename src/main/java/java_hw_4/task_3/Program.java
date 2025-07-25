package java_hw_4.task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input max value in kgs of your warehouse can get: ");
        double maxMass = scanner.nextDouble();

        double actualValue = 0.0;
        double minMass = 5.0;

        while (actualValue < maxMass) {
            System.out.print("Enter the value you want to load into the warehouse: ");
            double loadingToWarehouseValue = scanner.nextDouble();

            if (loadingToWarehouseValue < minMass) {
                System.out.println("Input value more than " + minMass + " kgs.");
                continue;
            }

            double freeSpaceBefore = maxMass - actualValue;
            if (loadingToWarehouseValue > freeSpaceBefore) {
                System.out.println("Error: not enough space.");
                continue;
            }

            actualValue += loadingToWarehouseValue;
            double freeSpaceAfter = maxMass - actualValue;

            if (actualValue >= maxMass || freeSpaceAfter < minMass) {
                System.out.println("Warehouse is completely full.");
                break;
            }
        }
        scanner.close();
    }
}
