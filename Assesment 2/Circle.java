public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
    }
}