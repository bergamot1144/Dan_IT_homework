package java_hw_6.task_2_1;

public class Circle extends Figure {

    private double radius;
    final double PI = 3.14;

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
