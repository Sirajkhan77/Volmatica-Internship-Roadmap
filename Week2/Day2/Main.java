package Week2.Day2;
abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Calls the parent constructor
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        // Calculating area using Heron's formula
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Red", 5.0);
        shapes[1] = new Rectangle("Blue", 4.0, 6.0);
        shapes[2] = new Triangle("Green", 3.0, 4.0, 5.0);
        for (Shape shape : shapes) {
            System.out.println("Shape Type: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColor());
            System.out.printf("Area: %.2f\n", shape.getArea());
            System.out.printf("Perimeter: %.2f\n", shape.getPerimeter());
            System.out.println("-------------------------");
        }
    }
}
