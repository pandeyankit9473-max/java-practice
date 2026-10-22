class BankAccount{
    private int balance=10000;
    synchronized void withdraw(int amount, String customer){
        if(balance>=amount){
            System.out.println(customer+ "is withdrawing "+ amount);
            balance= balance-amount;

             System.out.println(customer + " completed withdrawal");
            System.out.println("Remaining balance: ₹" + balance);
        } 
        else {
            System.out.println(customer + " cannot withdraw ₹" + amount);
            System.out.println("Insufficient balance");
        }
    }
}
class Customer extends Thread{
    BankAccount account;
    int amount;
    String customerName;

    Customer(BankAccount account, int amount, String customerName){
        this.account=account;
        this.amount=amount;
        this.customerName= customerName;
    }
    public void run(){
        account.withdraw(amount,customerName);
    }
}

public class BankDemo{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Customer c1= new Customer(account,7000,"Customer 1");
        Customer c2= new Customer(account, 6000, "Customer 2");

        c1.start();
        c2.start();
    }
}