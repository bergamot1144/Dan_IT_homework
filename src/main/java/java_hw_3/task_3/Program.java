package java_hw_3.task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int a = scanner.nextInt();
        System.out.println("Input second number:");
        int b = scanner.nextInt();
        int difference = (a > b) ? (a - b) : (b - a);
        System.out.println(" Різниця двох чисел = " + difference);
    }
}
