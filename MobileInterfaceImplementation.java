public class MobileInterfaceImplementation implements MobileInterface,AndroidInterface{
    public void welcomeMessage(){
        System.out.println("welcome to mobile platform");
    }
    public void endMessage(){
        System.out.println("thankyou ");
    }
    public void androidwelcomeMessage(){
        System.out.println("welcome to android platform");
    }
    public static void main(String args[]){
        MobileInterfaceImplementation mobile=new MobileInterfaceImplementation();
        mobile.welcomeMessage();
        mobile.endMessage();
        mobile.androidwelcomeMessage();
    }
}