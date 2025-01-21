class Vehicle {

    private String brand;
    private double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Speed: " + speed );
    }
}

class Car extends Vehicle {
    private String fuelType;

    public Car(String brand, double speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public void displayCarDetails() { 
        displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Vehicles{
    public static void main(String[] args) {
        Car car = new Car("BMW", 150.5, "Petrol");
        car.displayCarDetails();
    }
}
