public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful and Current balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds and  Current balance: " + balance);
        } else {
            System.out.println("Withdrawal unsuccessful.");
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.setAccountHolderName("Pavi");
        account.setBalance(500.0);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(200.0);
        account.withdraw(150.0);
        account.withdraw(600.0);
    }
}
