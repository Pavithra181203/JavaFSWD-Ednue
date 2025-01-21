public class InnerClassTest{
    public static void main(String args[]){
        OuterClass outer=new OuterClass();
        System.out.println(outer.firstName);

        OuterClass.InnerClass inner=outer.new InnerClass();
        System.out.println(inner.lastName);
        System.out.println(outer.firstName+" "+inner.lastName);

    }
}