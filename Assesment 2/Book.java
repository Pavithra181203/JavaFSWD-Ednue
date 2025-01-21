public class Book {
    
  String Title ;
  String Author;
  double Price;

public static void main(String[] args){
  Book b=new Book();
  b.Title = "Maverick";
  b.Author="Pavi";
  b.Price=5000.99;
  System.out.println(b.Title);
  System.out.println(b.Author);
  System.out.println(b.Price);
}
}