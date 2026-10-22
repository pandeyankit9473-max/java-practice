class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    static int accountCount = 0;

    final static String bankName = "State Bank";

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount a1 =
            new BankAccount("Ravi", "ACC101", 25000);

        BankAccount a2 =
            new BankAccount("Sneha", "ACC102", 40000);

        System.out.println(a1.getAccountHolder());
        System.out.println("Balance: " + a2.getBalance());
        System.out.println("Bank: " + BankAccount.bankName);
        System.out.println("Total Accounts: "
            + BankAccount.accountCount);
    }
}