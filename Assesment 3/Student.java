public class Student{
    private int id;
    private String name;
    private double marks;

    public Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public void displayDetails(){
        System.out.println("Student Details");
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
        System.out.println("Marks :"+marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Pavi", 85.5);
        Student s2 = new Student(2, "Arun", 90.0);
        Student s3 = new Student(3, "Guhan", 91.2);
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}