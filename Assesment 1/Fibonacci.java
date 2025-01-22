public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
