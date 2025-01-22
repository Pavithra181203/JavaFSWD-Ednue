abstract class Employee {
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;

    public FullTimeEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class AbstractEmployee {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Arun", 101, 50000, 10000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Pavi", 102, 120, 25);
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());
    }
}

