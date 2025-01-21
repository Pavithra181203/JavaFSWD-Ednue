public class Employee{
    String name;
    double salary;
    Employee(){
        name="Pavi";
        salary=50000.00;
    }
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
void display(){
    System.out.println("Name is "+ name+" and  income is "+salary);
}
public static void main(String[] args){
    Employee emp=new Employee();
    emp.display();

    Employee emp1=new Employee("Arun",70000.00);
    emp1.display();
}
    
}