package java_hw_6.task_2_1;

public class Program {
    public static void main(String[] args) {

        Figure circle = new Circle(5.0);

        double circleArea = circle.getArea();
        System.out.println("Area of the circle " + circleArea);
        double circlePerimeter = circle.getPerimeter();
        System.out.println("Perimeter of the circle " + circlePerimeter);

        Figure square = new Square(5.0);

        double squareArea = square.getArea();
        System.out.println("Area of the square " + squareArea);
        double squarePerimeter = square.getPerimeter();
        System.out.println("Perimeter of the square " + squarePerimeter);

        Figure triangle = new Triangle(3.0, 4.0, 5.0);

        double triangleArea = triangle.getArea();
        System.out.println("Area of the triangle " + triangleArea);
        double trianglePerimeter = triangle.getPerimeter();
        System.out.println("Perimeter of the triangle " + trianglePerimeter);
    }
}
