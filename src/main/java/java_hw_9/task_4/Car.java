package java_hw_9.task_4;

public class Car {
    String model;
    double price;
    int maxSpeed;
    int countOfWheels;
    @Override
    public String toString() {
        return "Builder{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
    private Car(Builder builder) {
        this.model = builder.model;
        this.price = builder.price;
        this.maxSpeed = builder.maxSpeed;
        this.countOfWheels = builder.countOfWheels;

    }

    public static class Builder {
        private String model;
        private double price;
        private int maxSpeed;
        private int countOfWheels;


        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setCountOfWheels(int countOfWheels) {
            this.countOfWheels = countOfWheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }


    }
}
