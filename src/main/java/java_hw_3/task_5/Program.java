package java_hw_3.task_5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int a = scanner.nextInt();
        System.out.print("Input 2nd number: ");
        int b = scanner.nextInt();
        System.out.print("Input symbol (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        int result = (operator == '+') ? (a + b) : (operator == '-') ? (a - b) : (operator == '*') ? (a * b) : (operator == '/') ? (b != 0 ? (a / b) : 0) : (operator == '%') ? (b != 0 ? (a % b) : 0) : 0;
        System.out.println("Result: " + result);

        scanner.close();
    }
}
