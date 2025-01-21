public class StudentDetail {
    String name;
    int rollNo;
    StudentDetail(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    void displaydetail(){
        System.out.println("Name is "+name+" and Rollno is "+rollNo);
    }
    public static void main(String[] args){
        StudentDetail detail =new StudentDetail("Pavi", 101);
        detail.displaydetail();
    }
    
}