import java.util.Scanner;

class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance"); 
        }
    }
    void displayAccountDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}



public class BankDemo {
    public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        
        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
        account.displayAccountDetails();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Final Account Details:");
        account.displayAccountDetails();
        
    }
}
