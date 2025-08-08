package java_hw_12.task_1;

public class Exeptions {
    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

    static class UnknownCalculationException extends Exception {
        public UnknownCalculationException(String message) {
            super(message);
        }
    }
}
