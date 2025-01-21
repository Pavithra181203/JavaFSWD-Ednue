public class Rectangle {

    int length;
    int width;
    public int calculatearea(int length,int width ){
        int area =length*width;
    
    return area;
    }
    public static void main(String[] args){
        Rectangle calculate=new Rectangle();
        
        System.out.print(calculate.calculatearea(4,6));
    }

}