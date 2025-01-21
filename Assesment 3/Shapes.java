class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Shapes{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        Circle circle = new Circle(4.0);
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
