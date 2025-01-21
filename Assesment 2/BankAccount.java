public class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 1000.0);
        account.deposit(500.0);
    }
}
