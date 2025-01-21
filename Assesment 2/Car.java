public class Car {
    String brand;
    String model;
    int year;
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2021);
        Car car3 = new Car("Ford", "Mustang", 2022);

        car1.displayCarDetails();
        car2.displayCarDetails();
        car3.displayCarDetails();

        
    }
}