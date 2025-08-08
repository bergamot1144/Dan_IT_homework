package java_hw_12.task_1;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (true) {
            try {
                System.out.print("Input first number: ");
                if (!scanner.hasNextDouble()) {
                    scanner.next();
                    throw new Exeptions.InvalidNumberException("Error: Input only numbers.");
                }
                double num1 = scanner.nextDouble();

                System.out.print("Input second numberо: ");
                if (!scanner.hasNextDouble()) {
                    scanner.next();
                    throw new Exeptions.InvalidNumberException("Error: Input only numbers.");
                }
                double num2 = scanner.nextDouble();

                System.out.print("Input  (+, -, *, /) or 'exit' to finish program: ");
                String operation = scanner.next();

                if (operation.equalsIgnoreCase("exit")) {
                    System.out.println("Finishing the program...");
                    break;
                }

                double result;
                if (operation.equals("+")) {
                    result = calculator.add(num1, num2);
                } else if (operation.equals("-")) {
                    result = calculator.subtract(num1, num2);
                } else if (operation.equals("*")) {
                    result = calculator.multiply(num1, num2);
                } else if (operation.equals("/")) {
                    result = calculator.divide(num1, num2);
                } else {
                    throw new Exeptions.UnknownCalculationException("Unknown error!");
                }

                System.out.println("Result: " + result);

            } catch (Exeptions.DivisionByZeroException e) {
                System.out.println(e.getMessage());
            } catch (Exeptions.InvalidNumberException e) {
                System.out.println(e.getMessage());
            } catch (Exeptions.UnknownCalculationException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Unknown error!");
            }
        }
    }
}
