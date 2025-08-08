package java_hw_12.task_1;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws Exeptions.DivisionByZeroException {
        if (b == 0) {
            throw new Exeptions.DivisionByZeroException("Error. U cant divide zero!!");
        }
        return a / b;
    }
}
